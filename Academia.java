
public class Academia{

   private String nome;

   private String cnpj;

   private ArrayList<Cliente> clientes;

  public Academia(){

  nome="";
    
  cnpj="";

  clientes = new ArrayList <> ();
  
  }

  public void adicionar (cliente c){
    clientes.add (c);
  }

  public String getnome() {
      return nome;
    
  }
  
  public void setnome(String nome) {
      this.nome = nome;
  }

  public String getcnpj() {
      return cnpj;
  }
  
  public void setcnpj(String cnpj) {
      this.cnpj = cnpj;
  }

}

