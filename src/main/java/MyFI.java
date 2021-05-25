@FunctionalInterface
public interface MyFI {
    void m1();

    default void m2(){
        System.out.println("this is sujana m2");
    }

    default void m3(){
        System.out.println("this is sujana m2");
    }

    static void m4(){
        System.out.println("this is sujana m3");
    }

}
