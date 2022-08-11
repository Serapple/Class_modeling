public class Transport {
    int num;
    int fuel = 100;
    int now_velocity = 0;
    int max_passenger;
    int now_passenger;
    boolean state;
    public void condition(){ //운행 시작 및 상태 변경
        if(this.state == false){
            System.out.println("상태 = 운행중");
        }
        else{
            System.out.println("상태 = 운행 종료");
        }
    }
    public void velocity(int change_velocity) { //속도 변경
        if (fuel < 10) {
            System.out.println("주유량을 확인해 주세요.");
        } else {
            this.now_velocity += change_velocity;
        }
    }
    public void passenger(int add_passenger){ //승객 탑승
        now_passenger += add_passenger;
        if(max_passenger > now_passenger){
            int remain_passenger = max_passenger - now_passenger;
        }
        else{
            now_passenger -= add_passenger;
            System.out.println("최대 탑승 인원 초과");
        }
    }
}

