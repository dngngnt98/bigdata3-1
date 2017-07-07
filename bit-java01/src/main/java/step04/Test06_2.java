/* 증가/감소 연산자: 후위 연산자와 전위 연산자의 차이
 * => 변수의 값을 1 증가시키거나 1 감소시킨다.  
 * => n++ : 후위(postfix) 연산자
 *    - 변수의 값을 먼저 그 자리에 놓은 후, 변수의 값을 증가시킨다.
 * => ++n : 전위(prefix) 연산자
 *    - 변수의 값을 먼저 증가시킨 후, 그 자리에 변수의 값을 놓는다. 
 */
package step04;

public class Test06_2 {
  public static void main(String[] args) {
    int a = 10, b = 10;
    
    int r1 = ++a; 
    // 실행 순서: 
    // 1) a 값을 먼저 증가시킨다.
    // 2) 그 자리에 a 값을 놓는다.
    // 3) 할당 연산자 =을 실행하여 그 자리에 놓인 값을 r1에 저장한다.
    System.out.printf("a=%d, r1=%d\n", a, r1);

    int r2 = b++; 
    // 실행 순서:
    // 1) 그 자리에 b 값을 먼저 놓는다.
    // 2) b 값을 증가시킨다. 
    // 3) 할당 연산자 =을 실행하여 그 자리에 놓은 값을 r2에 저장한다.
    System.out.printf("b=%d, r2=%d\n", b, r2);
    
    /* 주의!
     * 할당 연산자(=)는 오른쪽 코드가 모두 실행된 후에 맨 마지막으로 항상 실행한다.
     * 
     * 용어
     * 할당 연산자를 기준으로 왼쪽을 "l-value", 오른쪽을 "r-value"라 부른다.
     * a = 20 * 3;
     * l-value: a
     * r-value: 20 * 3
     */
    
    
  }
}








