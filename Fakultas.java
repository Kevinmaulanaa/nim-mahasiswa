public class Fakultas{

    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getFakultas(){

        char kodeFa = nim.charAt(3);

        System.out.println(kodeFa);
	
        if(kodeFa == ('5')){
            return "Fakultas Sains Dan Teknologi";

        }else if(kodeFa == ('4')){
            return "Fakultas Hukum dan Syariah";
        }
	return "Fakultas Tidak Diketahui";
    }
}
