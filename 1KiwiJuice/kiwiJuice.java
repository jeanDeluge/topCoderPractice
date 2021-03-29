class kiwiJuice{

// capacities 2~50개의 요소가 있는 배열
// bottles capacities와 같은 수의 요소가 있는 배열
// fromId : 1~50개의 요소가 있는 배열
// toId : fromId 와 같은 수의 요소가 있는 배




    public int [] thePouring(int[] capacities, int [] bottles, int[] fromId, int[] toId){


        // 먼저 첫번째에서 다음으로 옮겨야하는 그릇에 있는 주스양을 보고
        // 분배해야하는 양 > 분배받는주스병의 남은 용량이면
        // 분배해야하는 주스병 쪽에 분배받는 주스병의 남은용량을 뺀 나머지가 들어있을것이고
        // 분배해야하는 양 <= 분배답는 주스병의 남은 용량
        // 분배해야하는 주스병 쪽은 아무것도 안남을 것이다.

        for(int i = 0 ; i < fromId.length; i++){
            int f = fromId[i]; //병 번호 인덱스 가져와야함.
            int t = toId[i];

            int space = capacities[t] - bottles[t]; //분배받는 주스병이 가진 남은 공간

            if (space >= bottles[f]){
                bottles[t] += bottles[f];
                bottles[f] = 0;
            }else{
                bottles[t] += space;
                bottles[f] -= space;

            }



        }
        return bottles;
    }
}