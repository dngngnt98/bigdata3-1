/* 다형성 : 오버라이딩(overriding) 적용 전 
 * => 오버라이딩은 다형성(polymorphism)의 특징 중 하나이다.
 * => 의미
 *    - 상속 받은 메서드를 서브클래스의 역할에 맞게끔 재정의하는 것. 
 * => 문법
 *    - 상속 받은 메서드와 이름과 파라미터, 리턴 타입이 같아야 한다.
 * => 오버라이딩이 없다면, 
 *    서브 클래스에서 같은 기능을 수행하는 메서드를 만들 때 마다 이름을 달리해야 한다.    
 */
package step11.ex8;

public class Test01 /* extends Object */{

  public static void main(String[] args) {
    B obj = new B(); 
    obj.v1 = 100;
    obj.v2 = 200;
    
    // B의 인스턴스 값을 출력하기 위해 새로 만든 메서드를 호출한다.
    obj.print2();
    
    /* 위와 같이 서브 클래스를 만들 때 마다 그 서브 클래스의 내용을 출력하기 위해
     * 매번 다른 이름으로 새 메서드를 만든다면,
     * 개발자가 그 메서드의 이름들을 암기하기가 불편할 것이다.
     * 가능한 같은 기능에 대해 같은 이름을 부여하는 게 프로그래밍을 일관되게 하는데 도움이 된다.
     * 그래스 등장한 문법이 "오버라이딩"이다.
     * 
     * 수퍼 클래스에서 상속 받은 메서드를 서브 클래스의 환경에 맞춰서 재정의 한다면,
     * 개발자는 수퍼 클래스의 메서드 이름 따로, 서브 클래스의 메서드 이름 따로 
     * 이렇게 여러 개의 메서드 이름을 암기해야 할 불편함이 없어질 것이다.
     * 
     * ex9 패키지에서 오바라이딩 적용된 예를 살펴보라!
     */
  }

}







