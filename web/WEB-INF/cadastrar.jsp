<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST">
            <label>C�digo do usuario</label>
            <input type="number" name="cod_usuario" >
            <label>Nome do usuario</label>
            <input type="text" name="nome_usuario" >
            <select name="brasileiro">
                    <option value="true">brasileiro</option>                    
                    <option value="false">extrangeiro</option> 
            </select>
            <p>Se for brasileiro, continue o cadastro</p>            
            <label>C�digo da hospedagem</label>
            <input type="number" value="" name="cod_hospedagem" >
            <label>Endere�o da hospedagem</label>
            <input type="text" value="" name="localizacao">            
            <label>Disponivel nesse momento</label>
            <select name="disponivel">
                    <option value="true">Sim</option>                    
                    <option value="false">N�o</option> 
            </select><br>
            <input type="submit">
        </form>
    </body>
</html>
