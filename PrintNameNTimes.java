class Main {
    public static void printing1ToN(int n){
        if(n<1) return;
       printing1ToN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
printing1ToN(5);
    }
    }
