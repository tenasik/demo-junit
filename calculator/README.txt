Compile calculator with:
gcc src/calculator.c src/main.c -o calculator.exe

Compile tests with
gcc -Iunity -Isrc unity/unity.c src/calculator.c test/test_0001.c -o test.exe