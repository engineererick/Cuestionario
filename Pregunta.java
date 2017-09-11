public class Pregunta{
    private String texto = "";
    private String respuesta = "";
    
    public Pregunta(String text, String resp){
        texto = text;
        respuesta = resp;
    }
    
    public String asignaTexto(){
        return texto;
    }
    
    public String asignaResp(){
        return respuesta;
    }
    
    public boolean checaResp(){
        if (true)
            return true;
        else
            return false;
            
    }
    
    public String imprime(){
        return respuesta;
    }
}
