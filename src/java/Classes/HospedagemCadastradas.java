package Classes;

import java.util.List;


public class HospedagemCadastradas {
    private static List<Hospedagem> hospedagens;
    
    public static List<Hospedagem> getInstance(int cod_usuario, String localizacao) {
        hospedagens.add(new Hospedagem(cod_usuario, localizacao));
        return hospedagens;
    }
    
}
