import javax.swing.*;
import java.util.Scanner;

public class Bus {

    Scanner in = new Scanner(System.in);
    int maxPassenger= 50; //최대 승객수
    int nowPassenger; //승객 수
    int money; //요금
    int changespeed ; // 변경할 속도
    String busNum;  // 버스번호
    int oilCheck; // 주유량
    int speed ; // 현재 속도
    String nowStatus  ; //현재상태
    String stopStatus;  //차고지행 상태


    public Bus(String busNum) { //버스번호 넣기
        this.busNum = busNum;
        System.out.println("버스번호 : " + busNum);
        nowStatus();
    }

    public void nowStatus(){   //현재상태 알림
        System.out.println("운행중입니다.");
    }
    public void stopStatus(){ //멈춤 상태 알림
        System.out.println("차고지 행입니다.");
    }

    public  void  drive(int oilCheck){
        this.oilCheck = oilCheck;
        if (oilCheck>10){
            nowStatus();
        }
        else if(oilCheck<10){
            stopStatus();
            System.out.println("주유가 필요합니다.");
        }
    }

    public void take(int money) {   // 승객 탑승시
              // 버스 요금 (매개변수 money)만큼 버스 수입이 증가

        if (nowPassenger<maxPassenger)
        {

            nowPassenger++;
            this.money += money;

        }
    }
    public void speedchange(int speed){
        if (oilCheck>10)
        {
            this.speed += speed;

        }
    }

    public void showInfo(){
        System.out.println("금액:"+money +"주유량:" + oilCheck+"속도:"+speed+"현재승객수:"+nowPassenger+"최대승객수:"+maxPassenger);
    }

}
class Test{
    public static void main(String[] args) {
        Bus bus1 = new Bus("245가 5781");
        bus1.drive(30);
        bus1.speedchange(20);
        bus1.take(5);
        bus1.showInfo();
    }
}
