#include <stdio.h>

extern "C" int multiply(int a,int b){
	printf("c function called with %d and %d",a,b);
	return a * b;
}



