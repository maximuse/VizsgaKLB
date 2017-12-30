package hu.nyirszikszi.vizsga;

public class VizsgaMegoldas2 {
    private int irany;

    public VizsgaMegoldas2(int irany) {
        this.irany = irany;
    }

    public int getIrany() {
        return irany;
    }

    public void setIrany(int irany) {
        this.irany = irany;
    }

    public void balraFordul() {
        if(getIrany()!=0) {
            setIrany(getIrany() - 1);
        }
        else {
            setIrany(3);
        }
    }

    public void jobbraFordul() {
        if(getIrany()!=3) {
            setIrany(getIrany() + 1);
        }
        else {
            setIrany(0);
        }
    }

    public void merreNezek() {
        System.out.println(getIrany());
    }
}