package advanced.polimorphism;

public class TvRemoteControler implements RemoteController{

    @Override
    public void enable(boolean action) {
        if (action){
            System.out.println("Turning TV on");
        }else {
            System.out.println("Turning TV off");
        }

    }
}
