
public class Main{
    public static void main(String[] args){
        Bus bus273 = new Bus(273); //버스 273 생성
        Bus bus111 = new Bus(111); //버스 111 생성
        if(bus273.getBus_num()!=(bus111.getBus_num())){
            System.out.println(bus273.getBus_num()+"과 "+ +bus111.getBus_num()+ "은 같지 않습니다.");
        }
        bus273.now_passenger = 0;
        bus273.showInfo(2); //승객 +2;
        bus273.getFuel(-50); //주유 -50; 안넣었을 때 상태확인은 입력 0으로
        bus273.state = false; //차고지행으로 상태 변경
        bus273.getFuel(+10); //주유 +10; 넣은 후 연료량 출력
        bus273.condition();//차고지행 출력
        bus273.state = true; //운행중으로 상태 변경
        bus273.showInfo(45); //45명 승객 -> 초과
        bus273.showInfo(5); // 5명 승객
        bus273.getFuel(-55); //연료 - 55

        Taxi taxi4885 = new Taxi(4885);
        Taxi taxi5978 = new Taxi(5978);
        if(taxi5978.getTaxi_num()!=(taxi4885.getTaxi_num())){
            System.out.println(taxi5978.getTaxi_num()+"과 "+ +taxi4885.getTaxi_num()+ "은 같지 않습니다.");
        } //번호 다른 것 출력
        taxi5978.showInfo(); // 상태
        taxi5978.getInfo(2, "서울역", 2); //승객 탑승
        taxi5978.condition(); // 운행 여부
        taxi5978.getFuel(-80); //연료 -80
        taxi5978.get_fee(); //요금 지불
        taxi5978.getInfo(5, "", 0); //승객탑승 x(인원 초과)
        taxi5978.getInfo(3,"구로디지털단지역", 12); //승객 탑승
        taxi5978.getFuel(-20); //연료 -20
        taxi5978.get_fee(); //요금 지불
    }

}