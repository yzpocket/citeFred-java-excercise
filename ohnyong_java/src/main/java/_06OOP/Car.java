package _06OOP;
/*클래스를 만들기 위해서는 4가지 STEP이 필요하다.
 * -------------------------------------
 * 1. 만들려고 하는 설계도를 선언 (== 클래스 선언)
 * 2. 객체가 가지고 있어야 할 속성(필드)를 정의
 * 3. 객체를 생성하는 방식을 정의.(생성자)
 *   -constructor
 * 4. 객체가 가지고 있어야 할 행위(메서드)를 정의
 * -------------------------------------
 * */

//--------1. "Car"라는 설계도를 선언
public class Car {
    //--------2. "Car"가 가지고 있어야 할 <속성(필드) 영역>

    // 1) 고유 데이터 영역
    String company; //자동차 회사
    String model = "X7 : SAV";   //자동차 모델 <- 초기화 내부 접근
    String color;   //자동차 색
    double price;   //자동차 가격

    // 2) 상태 데이터 영역
    double speed;   //자동차 속도
    char gear;  //기어 상태(P, R, N, D)
    boolean lights = true; //자동차 조명의 상태 <- 초기화 내부 접근

    // 3) 객체 데이터 영역
    Tire tire = new Tire();  // <- 초기화 내부 접근
    Door door;
    Handle handle;



    //--------3. 객체 생성 방식 <생성자 영역>
    public Car() {
        // logic
        // 기본 생성자 : 생략이 가능
        System.out.println("Car() 기본 생성자가 호출되었습니다. 객체가 생성됩니다.");
    }

    //--------4. 메서드 영역
    //gasPedal()
    //intput : kmh
    //output : speed
    double gasPedal(double kmh, char type){
        changeGear(type);//<- 내부 메소드 호출, 전제, 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }
    //brakePedal()
    //intput : X
    //output : speed
    double brakePedal(){
        return speed;
    }
    //changeGear()
    //intput : type(P, R, N, D)
    //output : speed
    char changeGear(char type){
        gear = type;
        return gear;
    }
    //onOffLight()
    //intput : X (<-on/off지만 작동 하냐 마냐로) !로.
    //output : lights
    boolean onOffLights(){
        lights = !lights;
        return lights;
    }
    //horn() (<- 누르면 알림 작동만 하면됨)
    //intput : X
    //output : X
    void horn(){
        System.out.println("빵빵");
    }

    //자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds){
        for (double v : speeds){
            System.out.println("v = " +v);
        }
    }
}



