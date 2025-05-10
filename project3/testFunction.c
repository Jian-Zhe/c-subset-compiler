#include "stdio.h"
#include "stdlib.h"

float f(float x, float y) {
    return x + y;
}

void side_effect() {
    printf("side_effect\n");
}

int main() {
    int a;
    scanf("%d", &a);
    printf("%d\n", a);

    void* ptr = malloc(a);
    free(ptr);

    float sum = f(3.0, 9.0);
    int res = printf("sum=%f, %d %f %f %f\n", sum, a, a);

    side_effect();

    undefine();
    
    return 0;
}