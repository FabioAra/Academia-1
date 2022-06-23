

public class Cliente{

   private String cpf;

   private String sexo;

   private String dataNascimento;

   private ArrayList<Metrica> metricas;
  
public Cliente(){

cpf="";
sexo="";

metricas = new ArrayList <> ();
  
}

public void adicionar (metrica m){
  metricas.add (m);
}

}

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getsexo() {
        return sexo;
    }
    public void setsexo(String sexo) {
        this.sexo = sexo;
    }



}