public class Taxi extends Transport {
    int taxi_num;
    int max_passenger = 4;
    int now_passenger;
    int fuel = 100;
    int now_velocity;
    String destination;
    int distance = 0;
    int basic_distance = 1;
    int basic_fee = 3000;
    int distance_fee = 1000;
    int final_fee = 0;
    int total_fee = 0;
    boolean state = true;

    public Taxi(int num) {
        this.taxi_num = num;
        System.out.println("Taxi 번호 = " + this.taxi_num);
    }
    public int getTaxi_num() {
        return taxi_num;
    }
    public void showInfo() {
       System.out.println("주유량 = " + this.fuel);
       if(this.state==true){
           System.out.println("상태 = 일반" );
       }
       else{
           System.out.println("상태 = 운행중");
       }
    }
    public void getInfo(int add_passenger, String get_destination, int get_distance) {
        if (this.fuel < 10 && this.state == false) {
            System.out.println("탑승 불가");
        } else {
            if (max_passenger >= add_passenger) {
                this.now_passenger = add_passenger;
                int remain_passengers = this.max_passenger - this.now_passenger;
                System.out.println("탑승 승객 수 = " + this.now_passenger);
                System.out.println("잔여 승객 수 = " + remain_passengers);
                this.destination = get_destination;
                this.distance = get_distance;
                this.final_fee = basic_fee + (this.distance - basic_distance) * distance_fee;
                this.state = false;
                System.out.println("기본 요금 확인 = " + basic_fee);
                System.out.println("목적지 = " + this.destination);
                System.out.println("목적지까지 거리 = " + this.distance);
                System.out.println("지불할 요금 = " + this.final_fee);
            }
            else{
                System.out.println("최대 승객 수 초과");
            }
        }
    }
    public void getFuel(int add_fuel) {
        this.fuel += add_fuel;
        if (this.fuel <= 0) {
            this.state = true;
            System.out.println("주유 필요");
        }
    }
    public void condition(){
        if(this.state == true){
            System.out.println("상태 = 일반");
        }
        else{
            System.out.println("상태 = 운행중");
        }
    }
    public void passenger(int max_passenger, boolean state, int add_passenger){
        if(state == true){
            if(max_passenger >= add_passenger){
                this.now_passenger = add_passenger;
            }
            else{
                System.out.println("최대 승객수 초과");
            }
        }
        else{
            System.out.println("주유 필요");
        }
    }
    public void get_fee(){
        this.state = true;
        this.total_fee += this.final_fee;
        if(this.fuel ==0){
            System.out.println("주유량 = 0");
            System.out.println("상태 = 운행불가");
            System.out.println("누적 요금 = " + this.total_fee + "원");
        }
        else{
            System.out.println("주유량 = " + this.fuel);
            System.out.println("누적 요금 = " + this.total_fee + "원");
        }
    }
}