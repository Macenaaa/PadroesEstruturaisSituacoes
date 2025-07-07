package adapter;
import adapter.src.service.PagamentoService;


public class Main {
	    public static void main(String[] args) {
	        PagamentoService pagamentoService = new PagamentoService();
	        pagamentoService.processar(200.0);
	    }
	}