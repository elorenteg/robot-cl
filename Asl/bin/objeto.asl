include paquete/piloto
include paquete/sensor

void main()
    
    o = ejemplo();
    b = OBJECT(sensor);
    numero = 5;
    m1 = MOTOR(1);
    m2 = MOTOR(2);
    m3 = ejemplo2();
    o.girar(m1,m2,45);
    b.girar2(m2,m1,20);
    girar(10,m1,o);
    

endfunc

void girar(int a,motor m1, piloto pi)
    
    b = a;
    
endfunc


piloto ejemplo()

    o = OBJECT(piloto);
    
    return o;
    
endfunc

motor ejemplo2()
    
    m1 = MOTOR(3);
    
    return m1;
    
endfunc