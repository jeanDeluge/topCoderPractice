package InterestingParty;

public class practive {
    
    //first = {"snake", "programming", "cobra", "monty"}
    //second = {"python", "python", "ananconda", "python"}

    //output = int,

    public int bestInvitation(String[] first, String[] second){


        // 4가지 경우의 수, 

        // f - f , f- s , s - f, f -s
        int answer = 0;
        int commonInf = 0;
        int commonIns = 0;
        for(int i = 0; i < first.length; i++){
          
            

            for(int j = 0; j < second.length; j++){
                if(first[i].equals(first[j])) commonInf++;
                if(first[i].equals(second[j])) commonInf++;
                if(second[i].equals(second[j])) commonIns++;
                if(second[i].equals(first[j])) commonIns++;

            }
        }

        answer = Math.max(commonInf , Math.max(commonIns, 0));



        return answer;

    }
}
