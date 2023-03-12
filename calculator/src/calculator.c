#include <stdio.h>
#include <math.h>

/* Calculate a <operator> b and return the result */
float calculate(float a, float b, char operator)
{
	if(operator == '+')
		return a + b;

	else if(operator == '-')
		return a - b;
	
	else if(operator == '*')
		return a * b;

	else if(operator == '/')
		return a / b;

	else
		return NAN;
}
