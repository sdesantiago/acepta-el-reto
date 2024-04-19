#include <stdio.h>
#include <math.h>

int main() {
	double	x;
	double	y;

	if (scanf("%lf %lf", &x, &y) == EOF)
		return 0;

	long resultado = trunc(((log((y*1000000)/x)/log(2))+1));
	printf("%ld\n", resultado);

	main();
}