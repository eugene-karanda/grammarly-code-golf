interface S {
    static void main(String[]a) {
        for (int i=15;i<43;
             System.out.printf("JDK %d will be released in %s %d%n",i,(i%2)==0?"March":"September",2013+i++/2));
    }
}