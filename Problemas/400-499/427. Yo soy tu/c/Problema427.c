#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
		char			nombre[101];
		char			parentesco[101];
		unsigned	int	casos;
		unsigned	int	i;
		
		scanf("%d", &casos);

		for (i = 0; i < casos; i++) {
			scanf("%s", nombre);
			scanf("%s", parentesco);

			if (strcmp(nombre, "Luke") == 0 && strcmp(parentesco, "padre") == 0)
				printf("TOP SECRET\n");
			else
				printf("%s, yo soy tu %s\n", nombre, parentesco);
		}

		return 0;
}