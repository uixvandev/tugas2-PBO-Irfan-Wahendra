public class Elemen {
    public String name;
    public int jamSibuk;

    public Elemen(String name) {
        //Downcasting terbentuk dari constructor superclass karena referensi bagi subclass.
        //jika dibuatkan constructor untuk superclass maka subclass juga harus dibuatan constructornya jika tidak akan terjadi errora
        this.name = name;
    }
}

class dosen extends Elemen {
    /* extends polymorphisme */
    private int jumlahHariKerja;

    public dosen(String name, int jumlahHariKerja) {
        super(name);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void cetak() {
        System.out.println(name + " adalah seorang dosen dengan jam sibuk " + jamSibuk);
    }
}

class mahasiswa extends Elemen {
    private int sks;

    public mahasiswa(String name, int sks) {
        super(name);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void cetak() {
        System.out.println(name + " adalah seorang mahasiswa dengan jam sibuk " + jamSibuk);
    }
}

class asdos extends mahasiswa {
    private int jamNgasdos;

    public asdos(String name, int sks, int jamNgasdos) {
        super(name, sks);
        jamSibuk = jamSibuk + jamNgasdos;

    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void cetak() {
        //cetak adalah bentuk upcasting 
      
        System.out.println(name + " adalah seorang asdos dengan jam sibuk " + jamSibuk);
    }
}
