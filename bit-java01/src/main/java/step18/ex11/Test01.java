/* 인터페이스: default 메서드
 * => 인터페이스를 정의하고, 
 *    그 인터페이스(규칙)에 따라 클래스를 만들어 사용할 것이다.
 *    예를 들면 Tico, Truck, Tesla 클래스들은 Car 규칙(인터페이스)에 따라 작성하였다.
 * => 어느 정도 시간이 지나,
 *    인터페이스(규칙)에 새 기능(항목)을 추가할 필요성이 생기게 되었다고 가정하자!
 *    새 규칙을 추가하는 순간,
 *    이전 규칙(인터페이스)에 따라 작성된 모든 클래스들을 변경해야 하는 문제가 발생한다.
 *    그렇다고 새 규칙을 정의하자니 유지보수에 좋지 않고,
 *    이전 규칙을 바꾸자니 그 규칙에 따라 작성된 클래스를 모두 변경해야 하는 문제가 있다.
 * => 해결책?
 *    이런 문제를 해결하고자 나온 문법이 default 메서드이다.
 *    기존 규칙(인터페이스)에 새 항목(메서드)를 추가하되,
 *    기존 클래스를 바꾸지 않아도 되게 만드는 것이다.
 * => Car 인터페이스에 전조등을 켜는 메서드를 추가해 보자!
 *    Sonata 클래스처럼 새로 추가하는 클래스는 변경된 규칙에 따라 작성하면 되지만,
 *    기존 클래스들은 다른 조치가 필요하다.
 * => Car 인터페이스에 새로 추가하는 메서드는 추상 메서드로 만들지 말고
 *    구현하라! 그러면 기존 클래스는 영향 받지 않을 것이다.
 *    대신 메서드 앞에 반드시 default를 붙여야 한다. 
 */
package step18.ex11;

public class Test01 {

  public static void main(String[] args) {
    // 자동차 객체 준비
    Tico tico = new Tico();
    Truck truck = new Truck();
    Tesla tesla = new Tesla();
    Sonata sonata = new Sonata();
    
    // 기존 클래스들도 새로 규칙에 추가한 메서드를 가지고 있다.
    tico.lightOn();
    truck.lightOn();
    tesla.lightOn();
    
    // 물론 변경된 규칙에 따라 만든 클래스는 당연히 규칙에 추가된 메서드를 갖고 있다.
    sonata.lightOn();
    
    // 인터페이스에 선언된 스태틱 메서드를 클래스의 스태틱 메서드처럼 사용할 수 있다.
    System.out.println(Car.version());
    
    // 인터페이스에 선언된 스태틱 메서드는 클래스의 스태틱 메서드와 달리
    // 인스턴스를 통해 사용할 수 없다.
    //sonata.version(); // 컴파일 오류!
    
  }

}






