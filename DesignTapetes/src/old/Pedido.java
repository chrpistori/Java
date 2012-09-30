
public class Pedido {
	int identificadorPedido;
	List<Tapete> tapetes;
	double preco;
	
	Pedido(List<Tapete> tapetes, int identificadorPedido){
		
	}
	
	int getIdentificadorPedido(){
		return identificadorPedido;
	}
	
	double getPreco(){
		return preco;
	}
	
	List<Tapete> getTapetes(){
		return tapetes; 
	}
	
	void adicionaTapetesNoPedido(List<Tapete> tapetes){
	}
	
	List<Tapete> getTapetesPorMaterial(Material material){
		return tapetes;
	}
}
