package org.example;

class Car {
    private boolean isEngineOn = false;
    private int speed = 0;

    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("시동이 걸렸습니다.");
        } else {
            System.out.println("이미 시동이 걸렸습니다.");
        }
    }

    public void accel() {
        if (isEngineOn) {
            speed += 10;
            System.out.println("가속. 현재 속도: " + speed );
        } else {
            System.out.println("시동이 꺼져 있습니다.");
        }
    }

    public void decel() {
        if (isEngineOn && speed > 0) {
            speed -= 10;
            System.out.println("감속. 현재 속도: " + speed );
        } else {
            System.out.println("감속할 수 없습니다.");
        }
    }

    public void stop() {
        if (isEngineOn) {
            speed = 0;
            System.out.println("정지. 속도: " + speed + "km/h");
        } else {
            System.out.println("이미 정지 상태입니다.");
        }
    }

    public void showSpeed() {
        System.out.println("현재 속도는" + speed);
    }

    public void stopEngine() {
        if (isEngineOn) {
            if(speed > 0) {
                System.out.println("달릴때는 시동끄기 X");
            }else{
            isEngineOn = false;
            speed = 0;
            System.out.println("시동 끄기.");
            }
        } else {
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }
}
