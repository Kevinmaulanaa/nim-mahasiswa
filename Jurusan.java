public class Jurusan{

    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan(){

        String kodeFa = nim.substring(4,6);

        System.out.println(kodeFa);
	
        if(kodeFa.equals("01")){
            return "Jurusan Teknik Informatika";

        }else if(kodeFa.equals("02")){
            return "Jurusan Ilmu Syariah";
        }
	return "Jurusan Tidak Diketahui";
    }
}