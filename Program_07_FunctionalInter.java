public class Program_07_FunctionalInter {
    public  static void main(String[] args){
        //using anonymous class
        /*BirdInterface birdObj = new BirdInterface(){
            @Override
            public void canFly(String val){
                System.out.println("Interface implemented using Anonymous Class");
            }
        };
        birdObj.canFly("Anonymous");*/

        //using lambda expression
        BirdInterface birdObj = (String val) ->{
          System.out.println("Interface implemented using Lambda Expression");
        };
        birdObj.canFly("Lambda");
    }
}
