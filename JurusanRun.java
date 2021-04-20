public class JurusanRun{
    public static void main(String[] args) {
        String nim = "12050110378";
        Jurusan objNim = new Jurusan();
        objNim.setNim(nim);
        System.out.println("Fakultas = "+objNim.getJurusan());
    }
}