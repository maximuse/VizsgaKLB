package hu.nyirszikszi.vizsga;

public class VizsgaMegoldas2 {
    private int irany;

    public VizsgaMegoldas2(int irany) {
        this.irany = irany;
        merreNezek();
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

        merreNezek();
    }

    public void jobbraFordul() {
        if(getIrany()!=3) {
            setIrany(getIrany() + 1);
        }
        else {
            setIrany(0);
        }

        merreNezek();
    }

    private void merreNezek() {
        String egtaj = "";

        switch (getIrany()) {
            case 0:
                egtaj = "eszak";
                break;
            case 1:
                egtaj = "kelet";
                break;
            case 2:
                egtaj = "del";
                break;
            case 3:
                egtaj = "nyugat";
                break;
        }

        System.out.println(getIrany() + " (" + egtaj + ")");
    }
}