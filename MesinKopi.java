public class MesinKopi {

    private String JenisKopi;
    private String Topping;
    private int JumlahStokKopi;

    public void setJenisKopi(String jenisKopi) {
        JenisKopi = jenisKopi;
    }

    public void setJumlahStokKopi(int jumlahStokKopi) {
        JumlahStokKopi = jumlahStokKopi;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    public int getJumlahStokKopi() {
        return JumlahStokKopi;
    }

    public String getJenisKopi() {
        return JenisKopi;
    }

    public String getTopping() {
        return Topping;
    }

}
