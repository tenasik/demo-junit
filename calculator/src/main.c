#include <stdio.h>
#include <math.h>
#include "calculator.h"

/*
 * We have not talked about floating point NaN (Not a Number) and Inf (infinity)
 * but to make it more interesting I am using it here. This is two special values
 * that  a float value can have.
 * We can create an NaN with the macro NAN from <math.h> and check if it is NaN
 * using isnan().
 * Inf occurs when dividing by zero.
 * One part missing in the exercise was error handling from calculate(), so here
 * I'm using NaN to mean that an error occured.
 */

int main()
{
	char operator;
	float value_1, value_2;

	printf("Input: ");
	scanf("%f %c %f", &value_1, &operator, &value_2);

	float result = calculate(value_1, value_2, operator);

    /* This was not part of specification */
    if(isnan(result))
    {
        printf("Invalid input was detected");
        return 0;
    }
        
	printf("The result is: %f\n", result);

	return 0;
}
