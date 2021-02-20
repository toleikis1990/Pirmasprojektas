package advanced.enumerators;

public enum CarMaker {
    BMW("bumer", 1890),
    VOLVO("volvuzas", 2000),
    MB("mersedes-benz", 1952);

     final String fullName;
     final int establishedIn;

    CarMaker(String fullName, int establishedIn){
        this.fullName = fullName;
        this.establishedIn = establishedIn;
    }
}
