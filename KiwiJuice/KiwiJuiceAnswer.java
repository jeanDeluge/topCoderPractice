package KiwiJuice;

public class KiwiJuiceAnswer {
    
    public int [] thePouring(int[] capacities, int [] bottles, int[] fromId, int[] toId){


        // 먼저 첫번째에서 다음으로 옮겨야하는 그릇에 있는 주스양을 보고
        // 분배해야하는 양 > 분배받는주스병의 남은 용량이면
        // 분배해야하는 주스병 쪽에 분배받는 주스병의 남은용량을 뺀 나머지가 들어있을것이고
        // 분배해야하는 양 <= 분배답는 주스병의 남은 용량
        // 분배해야하는 주스병 쪽은 아무것도 안남을 것이다.

        //=> 가지고 있는 병 두개를 더 해서, 받는 쪽의 병의 용량만큼 빼고

        for(int i = 0 ; i < fromId.length; i++){

            int sum = bottles[fromId[i]] + bottles[toId[i]];
            bottles[toId[i]] = Math.min(sum, capacities[toId[i]]);
            bottles[fromId[i]] = sum - bottles[toId[i]];


        }
        return bottles;
    }
}
//가능한 조건문을 적게 쓰는 쪽으로 해야한다.