package bsu.rfe.java.group9.lab1.Kopachevskiy.varA12;

public class Cheese extends Food{

    public Cheese(){
        super("Сыр");
    }

    @Override
    public void consume() {
        System.out.println(this + " съеден.");
    }
}
