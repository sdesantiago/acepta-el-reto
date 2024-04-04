#include <stdio.h>

int main() {
	int c;
	int p;
	int t;
    
    scanf("%d %d %d", &c, &p, &t);
    
    if (c == 0 && p == 0 && t == 0) {
        return 0;
    }
	printf("%d\n", (p + t <= c) ? (p + t) : (c - (t - (c - p))));
	main();
    
    return 0;
}