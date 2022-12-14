package bsu.rfe.java.group9.lab1.Kopachevskiy.varA12;

public class Beef extends Food{

    private String preparedness;

    public Beef(String preparedness) {
        super("Мясо");
        this.preparedness = preparedness;
    }

    @Override
    public void consume() {
        System.out.println(this + " съедено.");
    }

    public String toString() {
        return super.toString() + " готовности '" + this.preparedness.toUpperCase() + "'";
    }

    public String getPreparedness() {
        return preparedness;
    }

    public void setSize(String preparedness) {
        this.preparedness = preparedness;
    }

    /*@Override
    public boolean equals(Object arg) {
        if (super.equals(arg)) {
            if (!(arg instanceof Burger)) return false;
            return size.equals(((Burger)arg).size);
        }
        else {
            return false;
        }
    }*/
}
