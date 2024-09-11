## 1차 요구사항 구현
- [0] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [0] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [0] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [0] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [0] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [0] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- html은 사실상 책이랑 찾아보고 짜기 하는 수준인거 같다 그래서 조금더 공부 해야할거 같다
- 생각해서 하는게 아니라 관성으로 타이핑을 하는거 같다
- 리포지터리? 랑 도메인 분류가 너무 어렵다 이해하고 분류하는 느낌이 아니여서 분류한 클래스에무슨 기능인지를 잘 모르고 하는거 같다  
  

## UI/UX
- 게시글 리스트 페이지
- ![image](https://github.com/user-attachments/assets/5c1cf670-9300-42e9-a86f-811bb238227f)

- 게시글 등록 폼 페이지
- ![image](https://github.com/user-attachments/assets/a2b0c8aa-3e0f-4b96-ac64-3cf2fa578348)

- 게시글 상세 페이지
- ![image](https://github.com/user-attachments/assets/e094a99c-b627-4b5b-9cd2-42a5fa49b20e)


## MVC 패턴
- MVC 는 Model, View, Controller의 약자 입니다. 하나의 애플리케이션, 프로젝트를 구성할 때 그 구성요소를 세가지의 역할로 구분한 패턴이

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 의존성 주입: 스프링 프레임워크에서는 빈 주입을 통해 객체 간의 의존선을 관리한다.
- 생성자 주입: 객체 생성 시점에 의존성을 주입하는 방식입니다.
  -장점
의존성을 불변(immutable)하게 유지할 수 있습니다.
의존성을 주입하지 않으면 객체를 생성할 수 없어, 의존성 주입이 필수임을 보장합니다.
순환 의존성을 방지할 수 있습니다.
  -단점
의존성이 많을 경우 생성자가 복잡해질 수 있습니다.
- 세터 주입:세터 메서드를 통해 의존성을 주입하는 방식입니다.
   -장점
선택적 의존성을 주입할 때 유용합니다.
코드가 더 간결해질 수 있습니다.
  -단점
객체가 불완전한 상태로 생성될 수 있습니다.
의존성이 변경 가능(mutable)하여 객체의 상태가 예측하기 어려워질 수 있습니다.
- 필드 주입:클래스 필드에 @Autowired 어노테이션을 사용하여 의존성을 주입하는 방식입니다.
 -장점
코드가 가장 간결하고 설정이 쉽습니다.
 -단점
테스트하기 어렵고, 의존성 주입이 이루어지기 전에 객체를 초기화할 수 없습니다.
순환 의존성 문제를 유발할 수 있습니다.


## JPA의 장점과 단점
- JPA: java ORM에 대한 API 표준 명세이며 인터페이스의 모음,구현체가 따로 없으며 ORM 프레임워크를 선택하여 사용
- 장점
- 생산성:sql을 직접 사용하지 않음 (메서드 호출만으로 쿼리를 수행)
- 유지보수:테이블 칼럼변경 시 이전에는 sql을 모두 확인 후 수정 필요 JPA는 JPA가대신 작을 수행하므로유지보수 측면에서 장점
- 특정 벤더에 종속적이지 않음: 여러DB벤더 마다 다른 sql을 사용하기때문에 DB변경이 어려움 JPA는 추상화된 데이터 접근 계층을 제공하여 특정 벤더에 종속적이지 않음

- 단점
- 성능:메서드 호출로 쿼리를 실행하는건 내부적인 동작이 많다는 의미
- 러닝커브:JPA를 사용하기 위해서는 학습해야 할 것들이 많            
## HTTP GET 요청과 POST 요청의 차이
- GET:서버로부터 정보를 요청할 때 사용되는 HTTP 메서드이다.
  -GET을 통해 서버에 리소스를 요청할 때 웹 캐시가 요청을 가로채서 서버로부터 리소스를 다시 다운로드 하는 대신 리소스의 복사본을 반환한다. HTTP 헤더에서 cache-control 헤더를 통해 캐시 옵션을 지정할 수 있다.
- POST:정보를 생성/업데이트하기 위해 서버에 데이터를 보내는 HTTP 메서드이다.
 -데이터가 Body로 전송되고 내용이 눈에 보이지 않아서 GET 요청보다 보안적인 면에서 더 안전하다고 생각할 수 있겠지만, 크롬 개발자 도구 등으로 확인할 수 있기 때문에 민감한 정보는 반드시 암호화가 필요하다.
  
