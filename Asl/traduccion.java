void funcion() {
    a = 10;
    System.out.println("hola");
    b = true;
}

int main(int a, bool b) {
    while(a > 4 && b) {
        c = main(a, b);
        a = 10;
    }

    if(a + 10 % 3 < 3) {
        a = 20;
    } else {
        a = 3;
    }

    return a;
}