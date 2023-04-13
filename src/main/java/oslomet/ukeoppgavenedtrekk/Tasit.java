package oslomet.ukeoppgavenedtrekk;

public class Tasit {
    private String tc;
    private String isim;
    private String soyisim;
    private String adres;
    private String plaka;
    private String marka;
    private String model;
    private String yil;

    public Tasit(String tc, String isim, String soyisim, String adres, String plaka, String marka, String model, String yil) {
        this.tc = tc;
        this.isim = isim;
        this.soyisim = soyisim;
        this.adres = adres;
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public Tasit() {    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYil() {
        return yil;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }
}
