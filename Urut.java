public class Urut{

    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getUrut(){

        String kodeUr = nim.substring(7);
	
	    return "No Urut Mahasiswa Adalah : "+kodeUr;
    }
}
