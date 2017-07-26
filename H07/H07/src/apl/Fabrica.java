package apl;

public class Fabrica {

	public static void main(String[] args) {

		try {
			Conexao.getConexao();
			System.out.println("Fabricado com Sucesso ; )");

		} catch (RuntimeException e) {
			System.out.println("TRACE_____________________:");
			e.printStackTrace();
		}

	}

}
