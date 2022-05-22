import java.util.ArrayList;

public class ProcessIncomingRequest {

    public void processRequest(String text, String subText){
        if(text == null || text.isEmpty() || subText == null || subText.isEmpty())
            throw new NullPointerException();

            getCharPositions(text, subText);
    }

    public ArrayList<Integer> getCharPositions(String text, String subText){
        ArrayList<Integer> results =  new ArrayList<>();
        char[] inputChars = text.toCharArray();
        int subStrLength = subText.length();
        for(int i=0; i<inputChars.length; i++){
            if(i+subStrLength > inputChars.length)
                break;
            String subStrOfInput = text.substring(i, i+subStrLength);
            if(subStrOfInput.equalsIgnoreCase(subText)){
                results.add(i);
            }
        }
        return results;
    }
}
