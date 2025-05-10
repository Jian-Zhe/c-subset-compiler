#include "stdio.h"
#include "stdlib.h"

int main() {
    int a;
    scanf("%d", &a);
    printf("%d\n", a);

    int* ptr = malloc(a);
    free(ptr);
    return 0;
}