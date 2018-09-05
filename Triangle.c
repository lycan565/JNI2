#include <jni.h>
#include <stdio.h>
#include "Triangle.h"

JNIEXPORT void JNICALL Java_Triangle_form (JNIEnv *env, jobject obj, jint row, jint shape) {
	int i, j, k;
	
	printf("\n");
	
	for(i=1; i<=row; ++i, k=0)
    {
        for(j=1; j<=row-i; ++j)
        {
            printf(" ");
        }

        while(k != 2*i-1)
        {
            printf("%d",shape);
            ++k;
        }

        printf("\n");
    }

}