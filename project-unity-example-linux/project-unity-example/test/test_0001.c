#include <unity.h>

#include <stdio.h>
#include "file1.h"

#define epsilon 0.001

void test_normal(void)
{
    TEST_ASSERT_FLOAT_WITHIN(epsilon, 4.0, square(2.0));
    TEST_ASSERT_FLOAT_WITHIN(epsilon, 1.0, square(1.0));
}

void test_negative(void)
{
	TEST_ASSERT_FLOAT_WITHIN(epsilon, 4.0, square(-2.0));
}

void setUp(void)
{
}

void tearDown(void)
{
}

int main()
{
	UNITY_BEGIN();

	RUN_TEST(test_normal);
	RUN_TEST(test_negative);

    return UNITY_END();
}
