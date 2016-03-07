import java.util.*;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private ArrayList<String> answer;
    private HashMap<String,String> MyAnswer;
    /**
     * Contructor para las respuestas y mis respuestas
     */
    public Responder()
    {        
        random = new Random();
        answer = new ArrayList<>();
        MyAnswer = new HashMap <String,String>();
        
        answer.add ("That sounds interesting. Tell me more...");
        answer.add("Only, i wanna try to help");
        answer.add("Of course.");
        answer.add("continue");
        answer.add("I can't help you, sorry...");
        
        MyAnswer.put("Hola", "Hola");
        MyAnswer.put("Tengo un problema", "¿Cual es tu problema?");
        MyAnswer.put("(Tiene arreglo?", "Ahora mismo estamos saturados, segun podamos le responderemos");
        MyAnswer.put("Gracias", "De nada");
    }

    /**
     * Genera una respuesta dependiendo si contiene mis respuestas o las respues aleatorias
     */
    public String generateResponse(String input)
    {
        String respuesta;
        if (MyAnswer.containsKey(input)){
            respuesta = MyAnswer.get(input);
        }
        else{
            respuesta = answer.get(random.nextInt(answer.size()));
        }
        return respuesta;
    }
}
