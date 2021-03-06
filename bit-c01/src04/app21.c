/* 포인터 - 동적 메모리를 사용하는 이유
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int* app21_f1(int size) {
	// 다음과 같이 선언한 배열은 로컬 변수로서 스택 메모리 영역을 사용한다.
	// 문제는 함수 호출이 끝나면 그 함수가 만든 모든 로컬 변수는 제거되기 때문에
	// 로컬 변수의 주소를 리턴해봐야 의미 없다. 즉 무효한 주소를 리턴할 뿐이다.
	int arr[size];
	return arr;
}

int* app21_f2(int size) {
	// malloc()으로 만드는 메모리는 스택(stack)이 아니라 힙(heap) 영역에 생성된다.
	// 힙 영역에 생성된 메모리는 프로그램을 종료할 때까지 유지된다.
	// 그래서 함수 호출이 끝난 다음에 그 메모리의 주소를 리턴하더라도 유효한 주소가 되는 것이다.
	int* arr = (int*) malloc(sizeof(int) * size);
	return arr;
}

int main21(void) {
	// app21_f1()은 스택에 생성한 로컬 변수의 주소를 리턴하기 때문에
	// 함수 호출이 끝난 후 리턴한 주소는 무효한 주소이다.
	// 실행 오류!
	//int *p = app21_f1(10);

	// app21_f2()가 리턴하는 주소는 힙 영역에 생성된 메모리의 주소이다.
	// 그래서 함수 호출이 끝나더라도 그 함수가 만든 해당 메모리는 계속 유지되기 때문에 유효하다!
	int *p = app21_f2(10);

	for (int i = 0; i < 10; i++) {
		p[i] = 100 + i;
	}

	for (int i = 0; i < 10; i++) {
		printf("%d,", p[i]);
	}
	return EXIT_SUCCESS;
}

/* malloc()으로 동적 메모리를 생성하는 이유?
 * 1) 함수 호출이 끝나더라도 계속 메모리를 사용하기 위해
 * 2) 대용량의 메모리를 사용하기 위해
 *    - 스택 영역의 메모리 용량은 제한되어 있다. 그래서 많은 메모리를 스택에 생성할 수 없다.
 *    - 힙 영역은 제한이 없다. OS가 허락하는 한에는 제한없이 메모리를 사용할 수 있다.
 *
 */











