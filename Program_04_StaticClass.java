public class Program_04_StaticClass {
    static class Logger{
        static String LogFileName="LogFile";

        static void Log(){
            System.out.println("Logging in File: "+LogFileName);
        }
    }

    public static void main(String[] args){
        Logger.Log();
    }
}
