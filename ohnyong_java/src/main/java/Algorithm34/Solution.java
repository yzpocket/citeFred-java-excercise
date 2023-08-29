package Algorithm34;
/*최소직사각형
문제 설명
명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
작아서 들고 다니기 편한 지갑을 만들어야 합니다.
이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.

명함 번호	가로 길이	세로 길이   = 크기
        1       60	        50      = 3000
        2	    30	        70      = 2100
        3	    60	        30      = 1800
        4	    80	        40      = 3200
가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.

모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

제한사항
sizes의 길이는 1 이상 10,000 이하입니다.
sizes의 원소는 [w, h] 형식입니다.
w는 명함의 가로 길이를 나타냅니다.
h는 명함의 세로 길이를 나타냅니다.
w와 h는 1 이상 1,000 이하인 자연수입니다.*/

//이런 문제는 국어 자체가 어렵다. 어떻게 쉽게 파악할수있을까?
//우선, 작아서 들고다니기 편한 지갑.
//작다 크다의 기준은 가로 * 세로라는것.
//위에 표에 "크기"라는 가로*세로(면적)을 계산해두었다. 결국 면적이 제일 작은것을 찾아내라는 것이다.
//혼동하지말자, 가로세로는 주어지는 것이고, 내가 어떤 가로세로를 창조해내는것이아니다.
//그럼 나는 저중에 가로세로값들을 뽑아내고 곱한 값이 그 배열중에 가장 작은것만 찾아내면된다.
public class Solution {
    static int min = 1000000;
    public Solution(){

    }
    int Solution(int[][] sizes){
        for(int i=0;i<sizes.length;i++){
            //가장 작은걸로 덮어쓰면된다.
            int width = sizes[i][0];
            //int height = sizes[i][i+1]; // 이표기법이 왜안될까? i=1이되면 i+1=2가되서 없는 공간이라 그런건가?
            //int height = sizes[i][2];     //맞다. 2를 넣어보니 배열 공간이 없는 세번째 인덱스를 찾고있어서 동일한 오류가 발생했다. 명시적으로 1로 두번째 값(세로)를 선택하자.
            int height = sizes[i][1];
            int area = width*height;
            if(min>area){
                min = area;
            }
        }
        int answer = min;
        return answer;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}};
        System.out.print(sol.Solution(sizes));
    }
}
