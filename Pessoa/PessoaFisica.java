package Pessoa;
public class PessoaFisica extends Pessoas {
    private String cpf;
  
    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
      super(nome, telefone, endereco);
      this.cpf = cpf;
    }

    @Override
    public String toString() {
      return "Pessoa Física: " + getNome() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nCPF: " + cpf;
    }
  
    public String getCpf() {
      return cpf;
    }
  
    public void setCpf(String cpf) {
      this.cpf = cpf;
    }
  }
