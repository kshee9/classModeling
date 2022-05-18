public class Taxi {

    String taxiNum;
    int oilcheck;
    int speed;
    String arrival;
    int basicDistance;
    int money ;
    int arrivalDistance;
    int perMoney ;
    int passenger;
    String nowStatus;
    String ingStatus;
    String stopStatus;

    public void nowStatus()
    {
        System.out.println("일반상태입니다.");

    }

    public void ingStatus()
    {
        System.out.println("운행중입니다.");

    }
    public void stopStatus(){
        System.out.println("운행불가입니다.");
    }

    public void drive() {  // 운행시작
        if (oilcheck < 10) {
            stopStatus();
            System.out.println("주유가 필요합니다.");
        }else {
            nowStatus();
        }
    }

    public Taxi(String taxiNum) // 택시번호, 기분 운행가능인 일반상태
    {
        this.taxiNum =taxiNum;
        System.out.println("택시번호 : " + taxiNum);
        nowStatus();
    }

    public void riding(int arrivalDistance) { //운행할때 승객이 타면 승객수 추가 운행중상태 띄우고 나머지는 운행불가!
        int sum = 0;
        if (nowStatus.equals("일반")) {                           // 거리당 요금추가랑 요금 결제..
            ingStatus();
            passenger++;
        } else if (passenger >0) {
            nowStatus();
        }
        if (arrivalDistance > 20) {
            sum = money + perMoney;
        } else {
            sum += money;
        }

        System.out.println("최종금액:"+ sum);
    }
//    public void showInfo(){
//        System.out.println("최종금액:"+sum);
//    }

}
 class Test2 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("245 가 5781");
        taxi.nowStatus = "일반";
        taxi.oilcheck =20;
        taxi.money =10;
        taxi.perMoney = 5;

        taxi.riding(25);
    }
}


