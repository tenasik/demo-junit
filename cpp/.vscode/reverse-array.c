#include <stdio.h>

int main() 
{
   int a[100], b[100], i, j, Size;
 
   printf("\nPlease Enter the size of an array: ");
   scanf("%d",&Size);
 
   //Inserting elements into the array
   for (i = 0; i < Size; i++) 
   {
      scanf("%d", &a[i]);
   }
 
   for(i = Size-1, j = 0; i >= 0; i--, j++) 
   {
      b[j] = a[i];     
   }
 
   printf("\nResult of an Reverse array is: ");
   for (i = 0; i < Size; i++) 
   {
      printf("%d \t", b[i]);
   }
 
   return 0;
}