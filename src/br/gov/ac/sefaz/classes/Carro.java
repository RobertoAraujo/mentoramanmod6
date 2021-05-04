package br.gov.ac.sefaz.classes;

import java.io.Serializable;

public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;

	int qntdPortas;
	String corCarro;
	int qntdRodas;
	String ar;
	String som;
	String motor;

	public int getQntdPortas() {
		return qntdPortas;
	}

	public void setQntdPortas(int qntdPortas) {
		this.qntdPortas = qntdPortas;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public int getQntdRodas() {
		return qntdRodas;
	}

	public void setQntdRodas(int qntdRodas) {
		this.qntdRodas = qntdRodas;
	}

	public String getAr() {
		return ar;
	}

	public void setAr(String ar) {
		this.ar = ar;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ar == null) ? 0 : ar.hashCode());
		result = prime * result + ((corCarro == null) ? 0 : corCarro.hashCode());
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		result = prime * result + qntdPortas;
		result = prime * result + qntdRodas;
		result = prime * result + ((som == null) ? 0 : som.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (ar == null) {
			if (other.ar != null)
				return false;
		} else if (!ar.equals(other.ar))
			return false;
		if (corCarro == null) {
			if (other.corCarro != null)
				return false;
		} else if (!corCarro.equals(other.corCarro))
			return false;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		if (qntdPortas != other.qntdPortas)
			return false;
		if (qntdRodas != other.qntdRodas)
			return false;
		if (som == null) {
			if (other.som != null)
				return false;
		} else if (!som.equals(other.som))
			return false;
		return true;
	}

	public String toString() {
		return "Carro [qntdPortas=" + qntdPortas + ", corCarro=" + corCarro + ", qntdRodas=" + qntdRodas + ", ar=" + ar
				+ ", som=" + som + ", motor=" + motor + "]";
	}

	public void methodoLigar(boolean carro) {
		if (carro == true) {
			System.out.println("Sim o Carro esta " + carro);
		}
		if (carro == false) {
			System.out.println("Não o Carro esta , Desligado. Ligue o carro para andar !");
		}
	}

	public void methodoParad(boolean carroP) {

		if (carroP = true) {
			System.out.println("Carro esta Ligado" + carroP);
		} else {
			System.out.println("Ainda Estou parado !");
		}
	}

	public void methodoCor(int cor) {

		switch (cor) {
		case 1:
			System.out.println("Preto");
			break;
		case 2:
			System.out.println("Vermelho");
			break;
		case 3:
			System.out.println("Branco");
			break;
		case 4:
			System.out.println("Azul");
			break;
		case 5:
			System.out.println("Prata");
			break;
		case 6:
			System.out.println("Cinza");
			break;
		case 7:
			System.out.println("Vinho");
			break;

		default:
			System.out.println("Opa somente corres de 1 a 7 :");
			break;
		}

	}

	public void methodoAr(boolean Ar) {

		if (Ar = true) {
			System.out.println("Sim carro tem ar  " + Ar);
		} else {
			System.out.println("Não tem Ar abra a janela !");
		}
	}
}
