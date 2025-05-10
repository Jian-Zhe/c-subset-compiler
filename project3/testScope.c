double x = 6.9;

void f(int x) {
    float y = 10.0f;
}

int main() {
    int x = 3;
    int y = 10;

    {
        float x = 2.3f;
        double y = 2.5;
    }

    for(float x = 3.0f; x < 10.0f; ++x) {
        float y = x*3.0f;
    }
}