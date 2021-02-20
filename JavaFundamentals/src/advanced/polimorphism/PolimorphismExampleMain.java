package advanced.polimorphism;

public class PolimorphismExampleMain {
    public static void main(String[] args) {
        //Polimorfizmas
        RemoteController remot = new  TvRemoteControler();
        remot.enable(true);
        System.out.println(remot.getClass().getSimpleName());

        remot = new AcRemoteControler();
        System.out.println(remot.getClass().getSimpleName());

        TvRemoteControler tvRemoteControler = new TvRemoteControler();
        AcRemoteControler acRemoteControler = new AcRemoteControler();

       // printTvObject(acRemoteControler);
       // printAcObject(tvRemoteControler);

        printAcObject(acRemoteControler);
        printTvObject(tvRemoteControler);
        printRemoteControllerObject(remot);


    }
    private static void printTvObject(TvRemoteControler tv){
        System.out.println(tv.getClass().getSimpleName());
    }
    private static void printAcObject(AcRemoteControler ac){
        System.out.println(ac.getClass().getSimpleName());
    }
    private static void printRemoteControllerObject(RemoteController remot){
        System.out.println(remot.getClass().getSimpleName());

    }
}
