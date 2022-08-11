
public class Bus extends Transport {
    int max_passenger = 30;
    int now_passenger = 0;
    int fee = 1000;
    int bus_num;
    int fuel = 100;
    int now_velocity = 0;
    boolean state = true;

    public Bus(int num) {
        this.bus_num = num;
        System.out.println("버스 번호 = " + this.bus_num);
    }

    public int getBus_num() {
        return bus_num;
    }

    public void getFuel(int add_fuel) {
        this.fuel += add_fuel;
        System.out.println("주유량 = " + this.fuel);
        if (this.fuel < 10) {
            this.state = false;
            System.out.println("상태 = 차고지행");
            System.out.println("주유 필요");
        }
    }

    public void showInfo(int add_passenger) {
        if (this.state == false) {
            System.out.println("운행중이 아닙니다.");
        } else {
            this.now_passenger += add_passenger;
            int remain_passengers = this.max_passenger - this.now_passenger;
            if (this.now_passenger > 30) {
                System.out.println("최대 승객 수 초과");
                this.now_passenger -= add_passenger;
            } else {
                System.out.println("탑승 승객수 = " + add_passenger + "\n" +
                        "잔여 승객수 = " + remain_passengers + "\n" +
                        "요금 확인 = " + add_passenger * fee);
            }
        }
    }

    public void condition() {
        if (this.state == false) {
            System.out.println("상태 = 차고지행");
            this.now_passenger = 0;
        } else {
            System.out.println("상태 = 운행중");
        }
    }
}
