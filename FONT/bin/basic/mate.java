package basic;
import lejos.nxt.*;
import lejos.util.Delay;

public class mate {
    public static int absolute(int n) {
        int ret = 0;
        if((n < 0)) {
            ret = -n;
        }

        return ret;
    }

    public static int exponenciacion(int base, int expo) {
        int ret = 0;
        if((expo == 0)) {
            ret = 1;
        } else {
            if((expo == 1)) {
                ret = base;
            } else {
                if((expo == 2)) {
                    ret = (base * base);
                } else {
                    if(((expo2) == 0)) {
                        ret = exponenciacion(base, (expo / 2));
                        ret = (ret * ret);
                    } else {
                        ret = exponenciacion(base, (expo / 2));
                        ret = ((ret * ret) * base);
                    }
                }
            }
        }
        return ret;
    }
}