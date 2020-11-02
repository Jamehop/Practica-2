package jardineria;

public class Main {
	public static void main(String[] args) {
		
	Cliente builder = new Cliente("Dario","Jaime","Moreno",601543192,"Si","Calle1","Calle2","Zaragoza","Ourense","España",50002,null,66666);
	
	Pedido builderPedido= new Pedido(null, null, null, "En camino", null, null);
	System.out.println(builder);
	System.out.println(builderPedido);
	}
 
}
