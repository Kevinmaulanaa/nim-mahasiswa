public class JenisRun {
    public static void main(String[] args) {
        String nim = "12050110378";
        Jenis objNim = new Jenis();
        objNim.setNim(nim);
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
    }
}