package Veiculo;

public abstract class Veiculo {
    protected String placa;
    protected double combustivelNoTanque;
    protected int quilometragem;
    protected boolean alugado;
    protected double precoDiaria;

    public void abastecer(int litros) {
        combustivelNoTanque = combustivelNoTanque + litros;
      }
    
      public boolean viajar(int distancia) {
        return viajar(distancia);
      }
    
      public boolean equals(Veiculo outro) {
        return this.placa.equals(outro.placa);
      }

      public void setAlugado(boolean alugado) {
          this.alugado = alugado;
      }

      public void setCombustivelNoTanque(double combustivelNoTanque) {
          this.combustivelNoTanque = combustivelNoTanque;
      }

      public void setPlaca(String placa) {
          this.placa = placa;
      }

      public void setPrecoDiaria(double precoDiaria) {
          this.precoDiaria = precoDiaria;
      }

      public void setQuilometragem(int quilometragem) {
          this.quilometragem = quilometragem;
      }

      public double getCombustivelNoTanque() {
          return combustivelNoTanque;
      }

      public String getPlaca() {
          return placa;
      }

      public double getPrecoDiaria() {
          return precoDiaria;
      }

      public int getQuilometragem() {
          return quilometragem;
      }

  }