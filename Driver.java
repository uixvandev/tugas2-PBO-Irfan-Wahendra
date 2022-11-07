public class Driver {
    public static void main(String[] args) {
        asdos fair = new asdos("fairuzikun",23,4);
        dosen raja = new dosen("Raja OP Damanik",5);
        asdos angel = new asdos("Angel-chan",19,7);
        mahasiswa firman = new mahasiswa("Firman",20);
        mahasiswa nid = new mahasiswa("Nid to pass this sem", 23);
        dosen nivo = new dosen("Nivotko",3);

        fair.cetak();
        raja.cetak();
        angel.cetak();
        firman.cetak();
        nid.cetak();
        nivo.cetak();

        int totJamSibuk = fair.jamSibuk + raja.jamSibuk + 
        angel.jamSibuk + firman.jamSibuk + nid.jamSibuk + nivo.jamSibuk;

        System.out.println("Total jam sibuk elemen fasilkom adalah "+totJamSibuk);
    }
}
