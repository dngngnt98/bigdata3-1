/* 구조체 - 비트 필드
 * => 구조체 멤버의 크기를 세밀하게 지정할 때 사용한다.
 * => struct 구조체명 {
 *       데이터타입 변수명 : 필드 크기;
 *    }
 * => 데이터 타입은 int 여야 한다.
 *    가능한 음수 저장이 가능한 타입(signed)인지 양수만 저장하는 타입(unsigned)인지 지정하는 것이 좋다.
 * => int 크기를 넘어가면 다음 int 크기 만큼 메모리가 추가된다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main61(void) {
	struct flag {
		unsigned int c;
		unsigned int cpp;
		unsigned int java;
		unsigned int python;
	} f1;

	printf("struct flag의 크기=%d\n", sizeof(struct flag));
	f1.c = 1;
	f1.cpp = 1;
	f1.java = 1;
	f1.python = 1;
	printf("%d,%d,%d,%d\n", f1.c, f1.cpp, f1.java, f1.python);

	// c, cpp, java, python 프로그래밍 가능 여부를 저장하기 위해
	// 각각의 값을 int 변수에 저장하였다.
	// 꺼낼 때도 각각의 변수를 지정해야 한다.
	// 문제점1 - 메모리를 너무 많이 차지 한다.
	// 문제점2 - 1과 0으로 표현되는 값을 넣고 빼내기가 번거롭다.

	// 이렇게 작은 값을 보다 쉽게 다루고 메모리 또한 절약하기 위해 등장한 문법이 비트 필드이다.
	// 비트 필드를 사용할 때 메모리 크기의 기본 단위는 int 이다. int 만큼 증가한다.
	struct flag2 {
		unsigned int c 		: 1;
		unsigned int cpp 	: 1;
		unsigned int java 	: 1;
		unsigned int python : 1;
	} f2;

	printf("struct flag2의 크기=%d\n", sizeof(struct flag2));
	f2.c = 1;
	f2.cpp = 1;
	f2.java = 1;
	f2.python = 1;
	printf("%d,%d,%d,%d\n", f2.c, f2.cpp, f2.java, f2.python);

	return EXIT_SUCCESS;
}







