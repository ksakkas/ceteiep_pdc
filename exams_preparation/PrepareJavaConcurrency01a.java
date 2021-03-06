import java.util.Random;

public class PrepareJavaConcurrency01a {
    final static int N = 1_000_000;
    final static int M = 100;

    static int a[] = new int[N];
    static int frequency[] = new int[M];

    public static void main(String[] args) {
        Random random = new Random(1729);
        for (int i = 0; i < N; i++) {
            a[i] = random.nextInt(M);
        }

        for (int i = 0; i < N; i++) {
            frequency[a[i]]++;
        }

        for (int i = 0; i < M; i++) {
            System.out.printf("%d --> %d\n", i, frequency[i]);
        }
    }
}

/*
0 --> 10136 
1 --> 9944  
2 --> 9891  
3 --> 10253 
4 --> 9868  
5 --> 9791  
6 --> 10073 
7 --> 10060 
8 --> 10151 
9 --> 9961  
10 --> 9891 
11 --> 9896 
12 --> 10118
13 --> 9986 
14 --> 9926 
15 --> 10001
16 --> 9990 
17 --> 10045
18 --> 9945
19 --> 9965
20 --> 10036
21 --> 10039
22 --> 9803
23 --> 10008
24 --> 9831
25 --> 9889
26 --> 10031
27 --> 10033
28 --> 9881
29 --> 10127
30 --> 10032
31 --> 10124
32 --> 10007
33 --> 10192
34 --> 10085
35 --> 10094
36 --> 9953
37 --> 9982
38 --> 10094
39 --> 9979
40 --> 9935
41 --> 9881
42 --> 10098
43 --> 9948
44 --> 9886
45 --> 9983
46 --> 10058
47 --> 10013
48 --> 10075
49 --> 9959
50 --> 9968
51 --> 10051
52 --> 9940
53 --> 10201
54 --> 10066
55 --> 9961
56 --> 10143
57 --> 10059
58 --> 9949
59 --> 9981
60 --> 10105
61 --> 10049
62 --> 10158
63 --> 9935
64 --> 9894
65 --> 9970
66 --> 10040
67 --> 9912
68 --> 9983
69 --> 10047
70 --> 10124
71 --> 10083
72 --> 9927
73 --> 10128
74 --> 10042
75 --> 10064
76 --> 10195
77 --> 9941
78 --> 9856
79 --> 10098
80 --> 9927
81 --> 9967
82 --> 10015
83 --> 9791
84 --> 10021
85 --> 9948
86 --> 9976
87 --> 9957
88 --> 9982
89 --> 9836
90 --> 9853
91 --> 9925
92 --> 10003
93 --> 9980
94 --> 10019
95 --> 10007
96 --> 10053
97 --> 9970
98 --> 10053
99 --> 9900
*/
