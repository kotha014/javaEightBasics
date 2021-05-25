public class CaluculatorImpl {
    public static void main(String[] args) {
//      CaluculatorInterface calInterface=  () -> System.out.println("SWITCH ON");
//      calInterface.switchOn();

//        CaluculatorInterface sum =(input)->
//            System.out.println("Sum:"+input);
//        sum.sum(487);

        CaluculatorInterface diff = (i1,i2)->  {
            if(i1>i2){
                throw new RuntimeException("message");
            }else{

            return i2-i1;}
        };
        System.out.println(diff.substract(8,20));

    }

}
