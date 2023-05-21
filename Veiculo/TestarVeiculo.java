package Veiculo;

public class TestarVeiculo {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        moto1.setPlaca("ABC-1234");
        moto1.setCombustivelNoTanque(10);
        moto1.setQuilometragem(0);
        moto1.setAlugado(false);
        moto1.setPrecoDiaria(50);
        moto1.setCilindradas(250);

        Carro carro1 = new Carro();
        carro1.setPlaca("XYZ-5678");
        carro1.setCombustivelNoTanque(20);
        carro1.setQuilometragem(0);
        carro1.setAlugado(false);
        carro1.setPrecoDiaria(100);
        carro1.setPotenciaDoMotor(150);

        boolean resultado = moto1.viajar(100);
        System.out.println("A moto conseguiu viajar 100 km? " + resultado);
        System.out.println("Combustível restante na moto: " + moto1.getCombustivelNoTanque());

        resultado = carro1.viajar(200);
        System.out.println("O carro conseguiu viajar 200 km? " + resultado);
        System.out.println("Combustível restante no carro: " + carro1.getCombustivelNoTanque());

        Moto moto2 = new Moto();
        moto2.setPlaca("ABC-1234");
        moto2.setCombustivelNoTanque(5);
        moto2.setQuilometragem(50);
        moto2.setAlugado(true);
        moto2.setPrecoDiaria(40);
        moto2.setCilindradas(300);

        resultado = moto1.equals(moto2);
        System.out.println("A moto1 é igual a moto2? " + resultado);

        resultado = moto1.equals(carro1);
        System.out.println("A moto1 é igual ao carro1? " + resultado);
    }
}
