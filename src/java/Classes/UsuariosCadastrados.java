
package Classes;

import java.util.List;

public class UsuariosCadastrados {
    private static List<Usuario> usuarios;
    
    public static List<Usuario> getInstance(String nome, boolean brasileiro) {
        usuarios.add(new Usuario( nome, brasileiro));
        return usuarios;
    }
    
}
