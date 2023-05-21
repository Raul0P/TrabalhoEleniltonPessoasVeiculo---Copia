package Pessoa;
public class TestarPessoa {

    public static void main(String[] args) {
      PessoaFisica pf = new PessoaFisica("João", "1234-5678", "Rua A", "111.222.333-44");
      PessoaJuridica pj = new PessoaJuridica("Empresa X", "4321-8765", "Rua B", "55.666.777/0001-88");
  
      System.out.println(pf);
      System.out.println(pj);
      
     }
  }