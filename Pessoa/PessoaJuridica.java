package Pessoa;
public class PessoaJuridica extends Pessoas {
    private String cnpj;
  
    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj) {
      super(nome, telefone, endereco);
      this.cnpj = cnpj;
    }
  
    @Override
    public String toString() {
      return "Pessoa Jurídica: " + getNome() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nCNPJ: " + cnpj;
    }
  
    public String getCnpj() {
      return cnpj;
    }
  
    public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
    }
  }
