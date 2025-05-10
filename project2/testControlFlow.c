int main() {
    int a = 10;

    if(a == 100)
        if(a % 2 == 0)
            a = 0;
        else if(a % 3 == 0) 
            a = 3;
        else
            a = 1;
    else a = -1;

    for(int i = 0; i < 3; ++i) {
        a++;

        if(i == 1) {
            continue;
        }
    }

    if(a > 10) {
        a = 0;
    } else {
        a = 100;
    }

    while(a < 1000) {
        a++;
        if(a % 30 == 0) {
            break;
        }
    }

    do {
        a--;
    } while(a > 100);

    switch(a) {
        case 1:
            a = 'A';
            break;
        case 2:
            a = 'B';
            break;
        default:
            a = 'C';
    }

    return 0;
}