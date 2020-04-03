#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>

#define N 12
#define T 4

int a[N] = {23, 11, 18, 90, 16, 22, 34, 52, 19, 41, 88, 72};
int max_num[T];

void *maximum(void *tid)
{
    long mytid = (long)tid;
    int local_max = 0;

    for (int i = mytid * (N / T); i < (mytid + 1) * (N / T); i++)
    {
        if (a[i] > local_max)
            local_max = a[i];
    }
    max_num[mytid] = local_max;
    return NULL;
}

int main()
{
    pthread_t threads[T];

    for (long i = 0; i < T; i++)
    {
        pthread_create(&threads[i], NULL,
                       maximum, (void *)i);
    }

    for (int i = 0; i < T; i++)
    {
        pthread_join(threads[i], NULL);
    }

    int max = 0;
    for (int i = 0; i < T; i++)
    {
        if (max_num[i] > max)
            max = max_num[i];
    }

    printf("Maximun Element is : %d\n", max);

    return 0;
}
