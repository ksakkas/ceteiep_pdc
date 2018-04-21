#include <iostream>
#include <thread>
using namespace std;

void func(int x) {
    cout << "Message from thread " << x << endl;
}

int main() {
    thread th(&func, 123);
    th.join();
    cout << "Message from the main thread" << endl;
    return 0;
}
