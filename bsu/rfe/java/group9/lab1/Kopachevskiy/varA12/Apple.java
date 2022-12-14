package bsu.rfe.java.group9.lab1.Kopachevskiy.varA12;

public class Apple extends Food{
    private String size;

    public String getSize() {
        return size;
    }

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void consume(){
        System.out.println(this + " съедено.");
    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Apple)) {
//            return false;
//        } else if (size == null || ((Apple) obj).size == null) {  // размер не задан
//            return false;
//        }
//        else if (!(size.equals(((Apple) obj).size))) {
//            return false;
//        }
//        return super.equals(obj);
//    }
}
