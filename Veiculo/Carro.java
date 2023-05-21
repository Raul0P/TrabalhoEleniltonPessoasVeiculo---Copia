package Veiculo;

public class Carro extends Veiculo {
    private int potenciaDoMotor;

    public void setPotenciaDoMotor(int potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public int getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    @Override
    public boolean viajar(int distancia) {
        double consumo = distancia / 10.0;
        if (combustivelNoTanque >= consumo) {
            combustivelNoTanque = combustivelNoTanque - consumo;
            quilometragem = quilometragem + distancia;
            return true;
        } else {
            return false;
        }
    }
}
