public class FakultasRun {
    public static void main(String[] args) {
        String nim = "12050110378";
        Fakultas objNim = new Fakultas();
        objNim.setNim(nim);
        System.out.println("Fakultas = "+objNim.getFakultas());
    }
}