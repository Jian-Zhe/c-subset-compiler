int main() {
    int a = 10;
    int b = 20;
    int c;

    // Arithmetic operators
    c = a + b;
    c = a - b;
    c = a * b;
    c = a / b;
    c = a % b;
    c = a & b;
    c = a | b;
    c = a ^ b;
    c = a << b;
    c = a >> b;
    c = a && b;
    c = a || b;
    c = a < b;
    c = a <= b;
    c = a > b;
    c = a >= b;
    c = a == b;
    c = a != b;

    /* with assignment */
    c = 10;
    c += a;
    c -= a;
    c *= a;
    c /= a;
    c %= a;
    c &= a;
    c |= a;
    c ^= a;
    c <<= a;
    c >>= a;

    c = -c++;

    return 0;
}