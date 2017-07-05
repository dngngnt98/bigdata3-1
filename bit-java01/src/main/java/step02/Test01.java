/* 값을 저장할 메모리 준비하기 - 변수 선언이라 한다.
 * => 자바는 크게 정수, 부동소수점, 논리값, 문자, 객체 주소를 
 *    저장하는 메모리를 준비할 수 있다.
 */
package step02;

public class Test01 {
  public static void main(String[] args) {
    // 값을 저장하는 메모리를 가리키는 이름을 
    // "변수(variable)"라고 부른다. 
    // 메모리에 저장하기 위해 직접 작성하는 값을
    // "상수값" 또는 "리터럴(literal)"이라 부른다.
    // 어떤 종류의 값인지 가리키는 것을 
    // "데이터 타입(data type)" 이라 부른다.
    int var = 100;
    // 데이터 타입: int
    // 변수: var
    // 리터럴(상수값): 100



    int i = 10; // 정수 값을 저장할 변수
    float f = 3.14f; // 변수 값을 저장할 변수
    boolean bool = true; // 논리 값을 저장할 변수 
    char c = 0xac00; // 2바이트 유니코드 값을 저장할 변수
    Object r = new Object(); // 객체 주소를 저장할 변수

    // 메모리 저장된 값 출력하기
    // "변수"를 이용하여 값이 들어 있는 메모리를 가리킬 수 있다.
    System.out.println(i);
    System.out.println(f);
    System.out.println(bool);
    System.out.println(c);
    System.out.println(r);
  }

}
 