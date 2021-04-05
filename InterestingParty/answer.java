package InterestingParty;

import java.util.Dictionary;
import java.util.HashMap;

public class answer {
   
    public int bestInvitation(String[] first, String[] second){

        int answer = 0;

        //for 중첩반복문을 삭제

        HashMap<String, Integer> dic = new HashMap<String, Integer>();

        for(int i = 0; i < first.length; i++){
            dic.put(first[i], 0);
            dic.put(second[i], 0);
        }


        for(int i = 0; i < first.length ; i++){
            dic.put(first[i], dic.get(first[i])+1); // first의 value값
        
            //같은 key값이 나타나면 value 에 하나씩 추가된다.

            dic.put(second[i], dic.get(second[i]) + 1); 
            
            //

        }

        for(String key : dic.keySet()){
            answer = Math.max(answer, dic.get(key));
        }
        return answer;
 
}
