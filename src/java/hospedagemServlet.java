import Classes.Usuario;
import Classes.Hospedagem;
import Classes.HospedagemCadastradas;
import Classes.UsuariosCadastrados;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hospedagemServlet", urlPatterns = {"/procurar_hospedagem.html", "/cadastrar.html"})
public class hospedagemServlet extends HttpServlet {
    
    List<Usuario> usuarios = new ArrayList<>();
    List<Hospedagem> locais = new ArrayList<>();
    int cod_usuario;
    String nome_usuario;
    boolean brasileiro;
    int cod_hospedagem;
    String localizacao;
    boolean disponivel;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (null != request.getServletPath()) {
            switch (request.getServletPath()) {
                case "/cadastrar.html":
                    cadastrar(request, response);                    
                    break; 
                case "/procurar_hospedagem.html":
                    procurarHospedagem(request, response);                    
                    break;
                default:
                    break;
            }
       
        
    }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cod_usuario = Integer.parseInt(request.getParameter("cod_usuario"));
            String nome_usuario = "nome_usuario";
            boolean brasileiro = Boolean.getBoolean("brasileiro");
            int cod_hospedagem  = Integer.parseInt(request.getParameter("cod_hospedagem"));
            String localizacao = "localizacao";
            boolean disponivel = Boolean.getBoolean("disponivel");
            
            
            UsuariosCadastrados.getInstance(nome_usuario, brasileiro);               
            Usuario user = new Usuario(nome_usuario, brasileiro);
            usuarios.add(user);
            
            if(brasileiro = true){
                HospedagemCadastradas.getInstance(cod_usuario, localizacao);
                Hospedagem hosp = new Hospedagem(cod_usuario, localizacao);
                locais.add(hosp);
                
            }
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mensagem.jsp");
            despachante.forward(request, response);
    }
    
    private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cadastrar.jsp");
        despachante.forward(request, response);
    }
    
    
    private void procurarHospedagem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("locais", locais);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/locais-disponiveis.jsp");
        despachante.forward(request, response);
    }

}