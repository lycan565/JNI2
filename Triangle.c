#include <jni.h>
#include <stdio.h>
#include "Triangle.h"

JNIEXPORT void JNICALL Java_Triangle_form (JNIEnv *env, jobject obj, jint n1, jint n2) {
	jint row,symbol, i, j, k;
	jdouble result;

	row = ((jint)n1);
	symbol = ((jint)n2);
	
	for(i=1; i<=row; ++i, k=0)
    {
        for(j=1; j<=row-i; ++j)
        {
            printf(" ");
        }

        while(k != 2*i-1)
        {
            printf("%d",symbol);
            ++k;
        }

        printf("\n");
    }
	

}