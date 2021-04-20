public class TahunRun{
    public static void main(String[] args) {
        String nim = "12050110378";
        Tahun objNim = new Tahun();
        objNim.setNim(nim);
        System.out.println("Tahun Masuk = "+objNim.getTahun());
    }
}