<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Classes.Hospedagem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            List<Hospedagem> locais = (List<Hospedagem>) request.getAttribute("locais");
        %> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Locais disponiveis:</h1>
        <%if(locais.size() == 0 ) {%>Nenhum local cadastrado<%}%>
        <%for (int i = 0; i < locais.size() ; i++) {%>
            <%if(locais.get(i).isDisponivel() == true ) {%>
                <p>Código da residencia: <%=locais.get(0).getCodigo() %></p>        
                <p>Localização: <%=locais.get(0).getLocalizacao() %></p>        
                <p>Código do usuario: <%=locais.get(0).getCod_usuario() %></p><br>                
            <%}%>
        <%}%>
    </body>
</html>
