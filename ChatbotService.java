public class ChatbotService {

    String language;
    int timesUsed;

    public String helloMessage(){

        if(language.equals("english")){
            return "hello";
        }else if(language.equals("spanish")){
            return "hola";
        }else if(language.equals("hawaiian")){
            return "aloha";
        }
        return "language not recognized";
    }

    public String goodbyeMessage(){
        if(language.equals("english")){
            return "goodbye";
        }else if (language.equals("spanish")){
            return "adios";
        }else if (language.equals("hawaiian")){
            return "aloha";
        }
        return "language not recognized";
    }

}