#include <stdio.h>

void soma(int a, int b, int *result) {
    *result = a + b;
}

int main() {
    int num1, num2, result;

    printf("Digite o primeiro n?mero inteiro: ");
    scanf("%d", &num1);

    printf("Digite o segundo n?mero inteiro: ");
    scanf("%d", &num2);
    soma(num1, num2, &resultado);
    printf("A soma de %d e %d ? %d\n", num1, num2, resultado);
    return 0;
}

