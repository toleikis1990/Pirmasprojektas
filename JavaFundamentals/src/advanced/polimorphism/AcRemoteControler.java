package advanced.polimorphism;

public class AcRemoteControler implements RemoteController{

    @Override
    public void enable(boolean action) {
        System.out.println("Turning Air conditioning ON");

    }
}
