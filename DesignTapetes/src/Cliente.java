public class Cliente {
	String nome, sobreNome;
	int cpf;
	Pedido pedido;
	
	public Cliente (String nome, String sobreNome, int cpf, Pedido pedido){
		/*nome = nNome;
		sobreNome = nSobreNome;
		cpf = nCpf;
		pedido = nPedido;*/ 
		
		//Não é assim que construi?
		this.nome = nome;
        	this.cpf = cpf;
       		this.sobreNome = sobreNome;
	}
	
	Pedido getPedido(){
		return pedido;
	}
	
	void setPedido(Pedido pedido){
		this.pedido = pedido;
	}
	
	void setCpf(int cpf){
		this.cpf = cpf;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	void setSobreNome(String sobreNome){
		this.sobreNome = sobreNome;
	}
	
	String getSobreNome(){
		return sobreNome;
	}
}
