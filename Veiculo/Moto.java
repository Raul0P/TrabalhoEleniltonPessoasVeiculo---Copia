package Veiculo;

public class Moto extends Veiculo {
  private int cilindradas;

  public void setCilindradas(int cilindradas) {
      this.cilindradas = cilindradas;
  }

  public int getCilindradas() {
      return cilindradas;
  }

  @Override
  public boolean viajar(int distancia) {
    double consumo = distancia / 30.0;

    if (combustivelNoTanque >= consumo) {
      combustivelNoTanque = combustivelNoTanque - consumo;
      quilometragem = quilometragem + distancia;
      return true;
    } else {
      return false;
    }
  }
}