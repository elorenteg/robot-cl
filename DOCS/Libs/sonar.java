package basic;
import lejos.nxt.*;
import lejos.util.Delay;

public class sonar {
    private static UltrasonicSensor U;
    private static NXTRegulatedMotor M;
    private static NXTRegulatedMotor M2;
    private static NXTRegulatedMotor M1;

    public static void sigueObjeto(int lim) {
        int i = 0;
        while((i < lim)) {
            int g = gradosObjeto();
            System.out.println(g);
            M1.rotate(-(2 * g),true);
            M2.rotate((2 * g),false);
            if(((g != 180) && (U.getDistance() > 10))) {
                M1.rotate(100,true);
                M2.rotate(100,false);
            }

            i = (i + 1);
        }
    }

    public static int grados() {
        girarUltra(-75);
        int grad = 0;
        int dist = 0;
        int i = -65;
        boolean cerca = true;
        while((i <= 75)) {
            if((U.getDistance() > dist)) {
                dist = U.getDistance();
                grad = i;
            }

            if((U.getDistance() > 50)) {
                cerca = false;
            }

            girarUltra(10);
            i = (i + 10);
        }
        girarUltra(-65);
        if(cerca) {
            grad = 180;
        }

        return grad;
    }

    public static int gradosObjeto() {
        girarUltra(-75);
        int grad = 0;
        int dist = 255;
        int i = -65;
        boolean cerca = false;
        while((i <= 75)) {
            if((U.getDistance() < dist)) {
                dist = U.getDistance();
                grad = i;
            }

            if((U.getDistance() < 100)) {
                cerca = true;
            }

            girarUltra(10);
            i = (i + 10);
        }
        girarUltra(-65);
        if(!cerca) {
            grad = 180;
        }

        return grad;
    }

    public static void laberinto(int lim) {
        int i = 0;
        while((i < lim)) {
            int g = grados();
            System.out.println(g);
            M1.rotate(-(2 * g),true);
            M2.rotate((2 * g),false);
            if((g != 180)) {
                M1.rotate(100,true);
                M2.rotate(100,false);
            }

            i = (i + 1);
        }
    }

    public static void init(NXTRegulatedMotor m1, NXTRegulatedMotor m2, NXTRegulatedMotor mu, UltrasonicSensor u) {
        U = u;
        M = mu;
        M.setSpeed(180);
        M1 = m1;
        M2 = m2;
        M1.setSpeed(180);
        M2.setSpeed(180);
    }

    public static void girarUltra(int g) {
        M.rotate(g,true);
        M.rotate(-g,false);
    }
}