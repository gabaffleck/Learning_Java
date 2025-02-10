public class Methods {
    static void myStaticMethod () {
        System.out.println("I just got executed!");
    }

    public void myPublicMethod () {
        System.out.println("I just got revived!");
    }
    
    public static void main(String[] args) {
        myStaticMethod();
        Methods obj = new Methods();
        obj.myPublicMethod();
    }
    
}
