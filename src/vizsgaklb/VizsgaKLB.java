package vizsgaklb;

import hu.nyirszikszi.vizsga.VizsgaMegoldas1;
import hu.nyirszikszi.vizsga.VizsgaMegoldas2;

public class VizsgaKLB {
    public static void main(String[] args) {
        VizsgaMegoldas1 v1 = new VizsgaMegoldas1(3, 5, 4);
        v1.haromszogKerulete();

        System.out.println();

        VizsgaMegoldas2 v2 = new VizsgaMegoldas2(0);
        v2.jobbraFordul();
        v2.jobbraFordul();
        v2.jobbraFordul();
        v2.jobbraFordul();
        v2.jobbraFordul();
        v2.balraFordul();
        v2.balraFordul();
        v2.balraFordul();
        v2.jobbraFordul();
    }
}