interface S {
    static void main(String[] a) {
        int i, m[] = {1,2,12,5,2,9,12,7,3,0,1,2,4,6,8,10,15,18};
        for(i=0;i<9;
            a(i, m[i], m[i+++9]));
        for (i=9;i<43;
             a(i,3+6*(i&1),17+i++/2));
    }

    static void a(int... t) {
        System.out.printf("JDK %s will be released in %s %d%n", (t[0]<5?"1.":"")+t[0], java.time.Month.of(t[1]), 1996+t[2]);
    }
}