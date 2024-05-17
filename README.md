# 황재준 학번 202330233

## 5월 17일

### 컨테이너와 배치, 배치관리자 개념
* #### 컨테이너 마다 하나의 배치관리자 존재
* #### 컨테이너의 크기가 변경되면 컴포넌트의 위치와 크기 재결정

### 배치 관리자 대표 유형 4가지
* #### FlowLAyout 배치 관리자
* #### BorderLayout 배치 관리자
* #### GnidLAyout 배치 관리자
* #### CardLayout 배치 관리자

### 컨테이너와 디폴트 관리자
* #### Window, Jwindow / BorderLayout 등

### 컨테이너에 새로운 배치관리자 설정
* #### setLayout(LayoutManager lm) 메소드 호출

### FlowLayout 배치 관리자
* #### 컴포넌트를 컨테이너 내에 왼쪽에서 오른쪽으로 배치

### FlowLayout 생성자
* #### FlowLayout()
*
### BorderLayout 배치 관리자
* #### 컨테이너 공간을 5 구역으로 분할, 배치

### BorderLayout 생성자
* #### BorderLayout()

### GnidLAyout 배치 관리자
* #### 컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고 각 셀에 컴포넌트 하나씩 배치

### GnidLAyout 생성자
* #### GnidLAyout()

### 배치관리자 없는 컨테이너 
* #### 응용프로그램에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우등

### 컴포넌트의 절대 위치와 크기 결정
* #### 배치관리자가 없는 컨테이너에 컴포넌트를 삽입할때
    * 프로그램에서 컴포넌트의 절대 크기와 위치 설정
    * 컴포넌트들이 서로 겹치게 할수 있음

### 

## 5월 3일

### 컬렉션의 개념
* #### 컬렉션
    * 요소라고 불리는 가변 개수의 객체들의 저장소

### 컬렉션의 특징
* #### 컬렉션은 제네릭 기법으로 구현
    * 제네릭
        * 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할수 있도록 클래스나 메소드를 일반화 시키는 기법
### 제네릭은 형판과 같은 개념
* #### 클래스나 메소드를 현판에서 찍어내듯이 생산할수 있도록 일반화된 형판을 만드는 기법

### Vector<E>
* #### 특성
    * 베얄을 가변 크기로 다룰수 있게 하는 컨테이너

### Vector<E> 클래스의 주요 메소드
* #### boolean add(E element) / 벡터의 맨 뒤에 element 추가 
* #### 등등

### 컬렉션과 자동 박싱/언박싱

### ArrayList<E>
* #### 가변 크기 배열을 구현한 클래스
* #### 벡터와 거의 동일

### ArrayList<E> 클래스의 주요 매소드
* #### boolean add(E element) / ArrayList의 맨 뒤에 element 추가 
* #### 등등

### 컬렉션의 순차 검색을 위한 lterator
* #### lterator<E> 인터페이스
    * 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 인터페이스

### HashMap<K,V>
* #### 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션

### HashMap<K,V>의 주요 매소드
* #### void clear() / HashMap의 모든 요소 삭제
* #### 등등

### 제네릭 만들기
* #### 제네릭 클래스 작성
    * 클레스 이름 옆에 일반화된 타입 매개 변수 추가

### 자바의 GUI
* #### GUI 응용 프로그램
    * 사용자가 편리하게 사용할수 있도록 그래픽으로 화면을 구성하고, 마우스나 키보드로 입력을 받을수 잇도록 지원하는것

### 컨테이너와 컴포넌트
* #### 컨테이너
    * 다른 컴포넌트를 포함할수 있는 GUI 컴포넌트

* #### 컴포넌트
    * 컨테이너에 포함되어야 화면에 출력될수 있는 GUI 객체

### 스윙 GUI 프로그램 만들기
* #### 스윙 프레임 만들기, main() 메소드 작성, 스윙 프레임에 스윙 컴포넌트 붙이기

### 스윙 프레임
* #### 스윙 프레임 : 모든 스윙 컴포넌트를 담는 최상위 컨테이너

### 프레임 만들기, JFrame 클래스 상속
* #### 스윙 프레임
    * JFrame 클래스를 상속받은 클래스 작성, 프레임 크기 반드시 지정 : setSize() 호출, 프레임을 화면에 출력하는 코드 반드시 필요 : setVisible(true) 호출

### 스윙 응용프로그램에서 main()의 기능과 위치
* #### 스윙 프로그램에서 main() 의 기능 최소화 바람직

### 프레임에 컴포넌트 붙이기
* #### 타이틀 달기
* #### 컨텐트팬에 컴포넌트 달기

### 스윙 프로그램의 종료
* #### System.exit(0);


## 4월 19일

### 추상 클래스
* #### 추상 메소드
    * abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언
* #### 추상 클래스
    * 추상 메소드를 가지고나 없이 abstract로 선언된 클래스

### 추상 클래스의 인스턴스 생성 불가
* #### 추상 클래스는 온전한 클래스가 아니기 때문에 인스턴스를 생성할 수 없음

### 추상 클래스의 상속과 구현
* #### 추상 클래스 상속
    * 추상 클래스를 상속받으면 추상 클래스가 됨
* #### 추상 클래스 구현
    * 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)
    * 추상 클래스를 구현한 서브 클래스는 추상 클래스가 아님

### 추상 클래스의 목적
* #### 상속을 위한 슈퍼 클래스로 활용하는것
* #### 서브 클래스에서 추상 메소드 구현
* #### 다향성 실현

### 자바의 인터페이스
* #### 자바의 인터페이스
    * 클레스가 구현해야 할 메소드들이 선언되는 추상형
    * 인터페이스 선언
* #### 자바 인터페이스에 대한 변화
    * java 7까지
        * 인터페이스는 상수와 추상 메소드로만 구성
    * java 8부터
        * 상수와 추상메소드 포함
        * default, private, static 메소드 포함
    * 여전히 인터페이스에는 피드(멤버 변수) 선언 불가

### 인터페이스의 구성 요소들의 특징
* #### 인터페이스의 구성 요소들
    * 상수
    * 추상 메소드, default 메소드, private 메소드, static 메소드

### 자바 인터페이스 특징
* #### 인터페이스의 객체 생성 불가
* #### 인터페이스 타입의 레퍼런스 변수 선언 가능

### 인터페이스 상속
* #### 인터페이스 간에 상속 가능
    * 인터페이스를 상속하여 확장된 인터페이스 작성 가능
    * extends 키워드로 상속 선언
* #### 인터페이스 다중 상속 허용

### 인터페이스 구현
* #### 인터페이스의 추상 메소드를 모두 구현한 클래스 작성
    * implements 키워드 사용
    * 여러 개의 인터페이스 동시 구현 가능

### 패키지의 개념과 필요성
* #### 다인이 자바 응용프로그램을 개발할경우
    * 동일한 이름의 클래스가 존재할 가능성이 있음
    * 합칠때 오류 발생 가능성
    * 개발자가 서로 다른 디렉터리로 코드 관리하여 해결

### 자바의 패키지와 모듈이란?
* #### 패키지
    * 서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묶어놓은 디렉토리
* #### 모듈
    * 여러 패키지와 이미지등의 자원을 모아 놓은 컨테이너
* #### 플랫폼의 모듈화
    * 자바 API의 모든 클래스들을 패키지 기반에서 모듈들로 완전히 재구성
    * 모듈 프로그래밍은 어렵고 복잡, 기존 방식으로 프로그램 작성

### 자바의 모듈화 목적
* #### 모듈화의 목적
    * 응용프로그램이 실행할 때 꼭 필요한 모듈들로만 실행 환경 구축
* #### 모듈의 현실
    * 복잡한 개념
    * 큰 자바 응용프로그램에는 개발, 유지보수 등에 적합
    * 현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요가 없음

### 자바 API의 모듈 파일들
* #### 자바 JDK에 제공되는 모듈 파일들
    * 자바에 설치된jmods디렉토리에 모듈 파일 존재
    * 모듈 파일에는 자바 API의 패캐지와 클래스들이 들어 있음
    * jmods 명령을 이용하여 모듈 파일에 들어 잇는 패키지를 풀어 낼 수 있음

### 패키지 사용하기, import문
* #### 다른 패키지에 작성된 클래스 사용
    * import를 이용하지 않는 경우
        * 소스에 클래스 이름의 완전 경로명 사용
    * 필요한 클래스만 import
        * 소스 시작 부분에 클래스의 경로명 import
    * 패키지 전체를 import 
        * 소스 시작 부분에 패키지의 경로명 * import

### 패키지 만들기
* #### 클래스 파일이 저장되는 위치
    * 클래스 파일은 패키지로 선언된 디렉토리에 저장
* #### 패키지 선언
    * 소스 파일의 맨 앞에 컴파일 후 저장될 패키지 지정

### 디폴트 패키지
* #### package 선언문이 없는 자바 소스 파일의 경우
    * 컴파일러는 클래스나 인터페이스를 디폴트 패키지에 소속시킴

### 모듈 개념
* #### 모듈
    * 패키지와 이미지등의 리소스를 담은 컨테이너
    * 모듈파일(.jmod)로 저장

### 자바 플랫폼의 모듈화
* #### 자바 플랫폼
    * 자바의 개발 환경과 자바의 실행 환경을 지칭
    * 자바 API의 모든 클래스가 여러 개의 모듈로 재구성됨
* #### 모듈 파일로부터 모듈을 푸는 명령

### 모듈 기반의 자바 실행 환경
* #### 자바 실행 환경
    * JRE : 디폴트 자바 실행 환경
        * 자바 모듈, 자바 가상 기계등으로 구성
### 자바 모듈화의 목적
* #### 가장 큰 목적
    * 자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함
    * 컴퓨터 시스템의 불필요한 부담 감소

### JDK의 주요 패키지
* #### java.lang
    * 스트링, 수학 함수, 입출력등 자바 프로그래밍에 필료한 기본적인 클래스와 인터페이스
* #### java.util
    * 날짜, 시간, 벡터, 해시맵등과 같은 다양한 유틸리티 클래스와 인터페이스 제공
* #### java.io
    * 키보드, 모니터, 프린터, 디스크등에 입출력 할 수 있는 클래스와 인터페이스 제공
* #### java.awt 
    * gui프로그램을 작성하기 위한 awt패키지
* #### java.swing 
    * gui프로그래밍을 작성하기 위한 스윙 패키지

### Object 클래스
* #### 특징
    * 모든 자바 클래스는 반드리 Object를 상속받도록 자동 컴파일
* #### 주요 메소드
    * Class getClass() / 한 객체의 런타임 클래스를 리턴
    * 등등

### 객체 속성
* #### Object 클래스는 객체의 속성이 나타나는 메소드 제공
    * hashCode() 메소드
    * getClass() 메소드
    * toString() 메소드

### toString() 메소드, 객체를 문자열로 변환
* #### 각 클래스는 toString()을 오버라이딩하여 자신만의 문자열 리턴 가능
* #### 컴파일러에 의한 toString() 자동 변환

### 객체 비교(==)와 equals() 메소드
* #### ==연산자
    * 객체 레퍼런스 비교
* #### boolean equals(Object obj)
    * 두 객체의 내용물 비교
    * 객체의 내용물을 비교하기 위해 클래스의 멤버로 작성

### Wrapper 클래스
* #### Wrapper 클래스
    * 자바의 기본 타입을 클래스화한 8개 클래스를 통칭
* #### 용도
    * 객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해 -> Wrapper 객체로 만들어 사용

### 주요 메소드
* #### 가장 많이 사용하는 Integer 클래스의 주요 메소드
    * 다른 Wrapper 클래스의 메소드는 이와 유사

### 박싱과 언박싱
* #### 박싱
    * 기본 타입의 값은 Wrapper 객체로 변환하는것
* #### 언박싱
    * Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는것

### String의 생성과 특징
* #### String
    * String클래스는 문자열을 나타냄

### 스트링 리터럴과 new String()
* #### 스트링 리터럴
    * 자바 가상 기게 내부에서 리터럴 테이블에 저장되고 관리됨

### 스트링 객체의 주요 특징
* #### 스트링 객체는 수정 불가능
    * 리터럴 스트링이든 new String()을 생성했든 객체의 문자영 수정 불가능
* #### 스트링 비교
    * 두 스트링을 비교할 때 반드시 epuals()를 사용하여하 함

### 주요 메소드
* #### char charAt(int index) / index 인덱스에 있는 문자 값 리턴
* #### 등등

### String 활용
* #### 스트링 비교, equals()와 co,pareTo() 
    * 스트링 비교에 ==연산자 절대 사용 금지
* #### int compareTo(String anotherString)
    * 문자열이 같으면 0 리턴

### String 활용
* #### 공백 제거, String trim()
    * 키보드나 파일로부터 스트링을 입력 시, 스트링 앞 뒤 공백이 끼는 경우가 많다. -> trim()을 이용하면 스트링 앞 뒤에 있는 공백 제거

### StringBuffer 클래스
* #### 가변 스트링을 다루는 클래스
* #### StringBuffer 객체 생성
* #### String 클래스와 달리 문자열 변경 가능

### StringTokenizer 클래스
* #### 구분 문자를 기준으로 문자열을 분리하는 클래스

### Math 클래스 
* #### 기본 산술 연산 메소드를 제공하는 클래스
    * 모든 메소드는 static로 선언
* #### Math.random() 메소드로 난수 발생

## 4월 12일

### static 멤버
* #### static멤버 선언
* #### 객체 생성과 non-static멤버의 생성
    * non-static멤버는 객체가 생성될 때, 객체마다 생긴다

### static 멤버의 생성
* #### static 멤버는 클래스당 하나만 생성
* #### 객체들에 의해 공유됨

### static멤버와 non-static멤버 특성 정리
* #### 선언
    * non-static 멤버 : int n; / void g()
    * static 멤버 : static int m; / static void g()
* #### 공간적 특성
    * non-static 멤버 : 멤버는 객체마다 별도 존재(인스턴트 멤버라 부름)
    * static 멤버 : 멤버는 클래스당 하나 생성(멤버는 객체 내부가 아닌 별도의 공간에 생성, 클래스 멤버라 부름)
* #### 시간적 특성
    * non-static 멤버 : 객체 생성 시에 멤버 생성됨
    * static 멤버 : 클래스 로딩 시에 멤버 생성
* #### 공유의 특성
    * non-static 멤버 : 공유되지 않음
    * static 멤버 : 동일한 클래스의 모든 객체들에 의해 공유됨

### static멤버 사용
* #### 클래스 이름으로 접근 가능
* #### 객체의 멤버로 접근 가능
* #### non-static멤버의 클래스 이름으로 접근 안 됨

### statci의 활용
* #### 전역 변수와 전역 함수를 만들 때 활용
* #### 공유 멤버를 만들고자 할 때
    * static으로 선언한 멤버는 클래스의 객체들 사이에 공유

### static 메소드의 제약 조건 1
* #### static메소드는 오직 static멤버만 접근 가능
    * 객체가 생성되지 않은 상황에서도 static메소드는 실행될수 있기 때문에, non-static 멤버 활용 불가
    * non-static 메소드는 static멤버 사용 가능

### static 메소드의 제약 조건 2
* #### static 메소드는 this 사용불가
    * static메소드는 객체 없이도 사용 가능하므로, this레퍼런스 사용할수 없음

### final 클래스와 메소드
* #### final 클래스 - 더 이상 클래스 상속 불가능
* #### final 메소드 - 더 이상 오버라이딩 불가능

### final 필드
* #### final 필드, 상수 선언
    * 상수 필드는 선언 시에 초기 값을 지정하여야 한다
    * 상수 필드는 실행 중에 값을 변경할 수 없다

### 상속
* #### 객체 지향 상속
    * 자식이 부모 유전자를 물려 받는 것과 유사한 개념

### 클래스 상속과 객체
* #### 상속 선언
    * extends 키워드로 선언
    * 부모 클래스 -> 슈퍼 클래스
    * 자식 클래스 -> 서브 클래스

### 서브 크래스의 객체 모양
* #### 슈퍼 클래스 객체와 서브 클래스의 객체는 별개
* #### 서브 클래스 객체는 슈퍼 클래스 멤버 포함

### 자바의 상속 특징
* #### 클레스의 다중 상속 불허
    * C++는 다중 상속 가능
        * C++는 다중 상속으로 멤버가 중복되는 문제 있음
* #### 자바는 인터페이스의 다중 상속 허용
* #### 모든 자바 클래스는 묵시적으로 Object클래스 상속받음
    * java.lang.Object 클래스는 모든 클래스의 슈퍼 클래스

### 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
* #### 슈퍼 클래스의 private멤버
    * 서브 클래스에서 접근할수 없음
* #### 슈퍼 클래스의 디폴트 멤버
    * 서브 클래스가 동일한 패키지에 있을 때, 접근 가능
* #### 슈퍼 클래스의 public멤버
    * 서브 클래스는 항상 접근 가능
* #### 슈퍼 클래스의 protected멤버
    * 같은 패키지 내의 모든 클래스 접근 허용
    * 패키지 여부와 상괸없이 서브 클래스는 접근 가능

### 슈퍼 클래스 멤버의 접근 지정자
* #### 슈퍼 클래스 멤버의 접근 지정자
    * private은 모든 클래스에서 접근 불가
    * 디폴트는 다른 패키지의 클래스, 서브 클래스에서 접근 불가
    * protected는 다른 패키지의 클래스에서 접근 불가
    * public은 모든 클래스에서 접근 가능

### protected 멤버
* #### protected 멤버에 대한 접근
    * 같은 패키지의 모든 클래스에게 허용
    * 상솓되는 서브 클래스(같은 패키지든 다른 패키지든 상관없음)에게 허용

### 서브 클래스 / 슈퍼 클래스의 생성자 호출과 실행
* #### 서브 클래스의 객체가 생성될 때
    * 슈퍼 클래스 생성자와 서브 클래스 생성자 모두 실행
    * 호출 순서 : 서브 클래스 생성자 호출, 실행 전 슈퍼 클래스 생성자 호출
* #### 실행 순서
    * 슈퍼 클래스의 생성자 실행 후 서브 클래스 생성자 실행 

### 서브 클래스와 슈퍼 클래스의 생성자 선택
* #### 슈퍼 클래스와 서브 클래스
    * 각각 여러개의 생성자 작성 가능
* #### 서브 클래스의 객체가 생성될 때
    * 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개 실행
* #### 서브 클래스의 생성자와 슈퍼 클래스 생성자가 결정되는 방식
    * 개발자의 명시적 선택
    * 컴파일러가 기본 생성자 선택

### super()로 슈퍼 클래스의 생성자 명시적 선택
* #### super()
    * 서브 클래스에서 명시적으로 슈퍼 클래스의 생성자 선택 호출
    * 사용 방식
        * super(paeameter);

### 업캐스팅 개념
* #### 업 캐스팅은 기본 클래스와 포인터로 파생 클래스의 객체를 가르키는것을 말한다.

### 업 캐스팅
* #### 업캐스팅
    * 서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
    * 슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가르키게 되는 현상

### 다운 캐스팅
* #### 다운 캐스팅
    * 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
    * 업캐스팅된 것을 다시 원래대로 되돌리는 것
    * 반드시 명시적 타입 변환 지정

### 업캐스팅 레퍼런스로 객체 구별?
* #### 업캐스팅된 레퍼런스로는 객체의 실제 타입을 구분하기 어려움
    * 슈퍼 클래스는 여러 서브 클래스에 상속되기 때문에

### instanceof 연산자 사용
* #### instanceof 연산자
    * 레퍼런스가 가르키는 객체의 타입 식별

### 메소드 오버라이딩의 개념
* #### 메소드 오버라이딩
    * 서브 클래스에서 슈퍼 클래스의 메소드 중복 작성
    * 슈퍼 클래스의 메소드 무력화, 항상 서브 클래스에 오버라이딩한 메소드가 실행되도록 보장됨
    * "메소드 무시하기"로 번역되기도 함
* #### 오버라이딩의 조건
    * 슈퍼 클래스 메소드의 원형(메소드 이름, 인자 타입 개수, 리턴 타입) 동일하게 작성

### 오버라이딩의 목적, 다양성 실현
* #### 오버라이딩으로 다향성 실현
    * 하나의 인터페이스(같은 이름)에 서로 다른 구현
    * 슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞도록 다르게 구현

### super 키워드로 슈퍼 클래스의  멤버 접근
* #### super 
    * 슈퍼 클래스의 멤버를 접근할 때 사용되는 레퍼런스
    * 서브 클래스에서만 사용

### 오버로딩과 오버라이딩
* #### 메서드 오버로딩과 메소드 오버라이딩 차이
    * 선언
        * 메소드 오버로딩 : 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성
        * 메소드 오버라이딩 : 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성
    * 관계
        * 메소드 오버로딩 : 동일한 클래스 내 혹은 상속 관계
        * 메소드 오버라이딩 : 상속 관계
    * 목적
        * 메소드 오버로딩 : 이름이 같은 여러 개의 메소드를 중복 선언하여 사용의 편리성 향상
        * 메소드 오버라이딩 : 슈퍼 클래스에 구현된 메소드를 무시하고 서브 클래스에서 새로운 기능의 매소드를 재정의하고자 함
    * 조건
        * 메소드 오버로딩 : 메소드 이름은 반드시 동일함. 메소드의 인자의 개수나 인자의 타입이 달라야 성립
        * 메소드 오버라이딩 : 에소드 이름, 인자의 타입, 인자의 개수, 인자의 리턴 타입이 달라야 성립
    * 바인딩
        * 메소드 오버로딩 : 정적 바인딩. 컴파일 시에 중복된 메소드 중 호출되는 메소드 결정
        * 메소드 오버라이딩 : 동적 바인딩. 실행 시간에 오버라이딩된 메소드 찾아 호출    


## 4월 5일

### 2차원 배열
* #### 2차원 배열 선언
    * int intArray[][]; 또는 int[][] int intArray;
* #### 2차원 배열 생성
    * int intArray[] = new int[2][5]; // 배열 선언과 생성 동시
* #### 2차원 배열의 구조

### 메소드의 배열 리턴
* #### 배열 리턴
    * 배열의 레퍼런스만 리턴
* #### 메소드의 리턴 타입
    * 리턴하는 배열 타입과 리턴 받는 배열 타입 일치

### 배열을 리턴 받아 사용하는 과정
int [] Array;
makeArray();
intArray에 temp값 치환
for(int i=0; i<intArray.legth; i++)
intArray[i] = i;

### 자바의 예외처리
* #### 예외
    * 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생
* #### 실행 중 예외가 발생하면
    * 자바 플렛폼은 응용프로그램이 예외를 처리하도록 호출
* #### 예외 발생 경우
    * 정수를 0으로 나누는경우
    * 배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는경우
    * 정수를 읽는 코드가 실행되고 있을때 사용자가 문자를 입력한 경우

### 자바의 에외 처리, try-chatch-finclly문
* #### 예외 처리
    * 발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것

### 자바의 예외 클래스
* #### 자바 플랫폼은 응용프로그램이 실행 중 오류를 탐지할수 있도록 많은 예외 를 클래스로 제공
    * AritmeticException / 정수를 0으로 나눌 때 발생
    * NullPointerException / null 레퍼런스를 참조할때 발생
    * ClassCastException / 변환할 수 없는 타입으로 객체를 변환할때 발생
    * 기타 등등

### 예외 클래스 사례
* #### 배열의 범위를 벗어나 원소를 접근하는 예외 처리
    * ArraylndexOutOfBoundsException 예외

### 실세계 객체의 특징
* #### 객체마다 고유한 특성과 행동을 가짐
* #### 다른 객체들과 정보를 주고 받는 등, 상호작용하며 살아감

### 컴퓨터 프로그램에서 객체의 사례
* #### 테트리스 게임의 각 블록들
* #### 한글 프로그램의 메뉴나 버튼들

### 자바의 객체 지향 특성 : 캡슐화
* #### 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것
    * 객체의 가장 본질적인 특징 : 외부로의 접근으로부터 보호
* #### 자바의 캡슐화
    * 클래스 : 객체 모양을 선언한 틀
    * 객체 : 생성된 실체

### 자바의 객체 지향 특성 : 상속
* #### 상속
    * 상위 개체의 속성이 하위 개체에 물려짐
    * 하위 개체가 상위 개체의 속성을 모두 가지는 관계

### 자바 상속
* #### 자바 상속
    * 상위 클래스의 멤버를 하위 클래스가 물려받음
        * 상위 클래스 : 수퍼 클래스
        * 하위 클래스 : 서브 클래스, 수퍼 클래스 코드의 재사용, 새로운 특성 추가 가능

### 자바의 객체 지향 특성 : 다향성
* #### 다향성
    * 같은 이름의 메소드가 혹은 객체에 따라 다르게 구현되는것
    * 다향성 사례 : 메소드 오버로딩, 메소드 오버라이딩

### 객체 지향 언어의 목적
* #### 소프트웨어의 생산성 향상
    * 컴퓨터 산업 발전에 따라 소프트웨어 생명 주기 단축
    * 객체 지향 언어
        * 상속, 다향성, 객체, 캡슐화등 소프트웨어 재사용을 위한 여러 장치 내장
        * 소프트웨어 생산성 향상
* #### 실세계에 대한 쉬운 모델링
    * 객체 지향 언어 : 실세계의 일을 보다 쉽게 프로그래밍하기 위한 객체 중심적 언어

### 절차 지향 프로그래밍과 객체 지향 프로그래밍
* #### 절차 지향 프로그래밍
    * 작업 순서를 표현하는 컴퓨터 명령의 집합
    * 함수들의 집합으로 프로그램 작성
* #### 객체 지향 프로그래밍
    * 컴퓨터가 수행하는 작업을 객체들간의 상호 작용으로 표현
    * 클래스 혹은 객체들의 집합으로 프로그램 작성

### 클래스와 객체
* #### 클래스
    * 객체의 속성과 행위 선언
    * 객체의 설계도 혹은 틀
* #### 객체
    * 클래스의 틀로 찍어낸 실체
        * 인스턴트라고도 부름

### 자바 클래스 구성
* #### 클래스
    * class 키워드로 선언
    * 멤버 : 클래스 구성 요소
    * 클래스에 대한 public 접근 지정 : 다른 모든 클래스에서의 사용 허락
    * 멤버에 대한 public 접근 지정 : 다른 모든 클래스에서의 멤버 접근 허용

### 생성자 개념과 목적
* #### 생성자
    * 객체가 생성될 때 초기화 목적으로 실행되는 메소드
    * 객체가 생성되는 순간에 자동 호출

### 생성자의 특징
* #### 생성자 이름은 클래스 이름과 동일
* #### 생성자는 여러 개 작성 가능(생성자 중복)
* #### 생성자는 책체 생성시 한 번만 호출
* #### 생성자의 목적은 객체 생성 시 초기화
* #### 생성자는 리턴 타입을 지정할 수 없음

### 기본 생성자
* #### 기본 생성자
    * 매개 변수 없고, 아무 작업 없이 단순 리턴 하는 생성자
* #### 디폴트 생성자라고도 불림

### 기본 생성자가 자동 생성 되는 경우
* #### 클래스에 생성자가 하나도 선언되어 있지 않을때

### 기본 생성자가 자동 생성되지 않는 경우 2
* #### 클래스에 생성자 선언이 되어 있는 경우
    * 컴파일러는 기본 생성자를 자동 생성해 주지 않는다

### this 레퍼런스
* #### this
    * 객체 자신에 대한 레퍼런스
        * this.멤버 형대로 멤버에 접근할때 사용

### this 요약
* #### this와 this()는 다르다
* #### this는 객체 자신에 대한 레퍼런스다
* #### this는 메소드에서 사용되며 현재 객체를 가리킨다

### this()로 다른 생성자 호출
* #### this()
    * 같은 클래스의 다른 생성자 호출
    * 생성자 내에서만 사용 가능
    * 생성자 코드의 제일 처음에 있어야함

### 객체 배열
* #### 자바의 객체 배열
    * 객체에 대한 레퍼런스 배열임
* #### 자바의 객체 배열 만들기 3단계
    * 1 : 배열 레퍼런스 변수 선언
    * 2 : 레퍼런스 배열 생성
    * 3 : 배열의 각 원소 객체 생성

### 객체 배열 선언과 생성 과정
* #### 배열에 대한 레퍼런스 병수 선언
    * Circle[] c;
* #### 레퍼런스 배열 생성
    * c = new Circle[5];
* #### 객체 생성
    * for(int i=0; i<c.legth; i++)  
    c[i] = new Circle(i);

### 메소드
* #### 메소드
    * 메소드는 C/C+의 함수와 동일
    * 자바의 모든 메소드는 반드시 클래스 안에 있어야함(캡슐화 원칙)
* #### 메소드 형식
    * 접근 지정자
    * 리턴 타입

### 인자 전달 - 기본 타입의 값이 전달되는 경우
* #### 매개 변수가 byte, int, double 등 기본 타입으로 선언되었을때

### 인자 전달 - 객체가 전달되는 경우
* #### 객체의 레퍼런스 전달
    * 매개 변수가 실인자 개체 공유

### 인자 전달 - 배열이 전달되는 경우
* #### 배열 레퍼런스만 매개 변수에 전달
    * 배열 통째로 전달되지 않음
* #### 객체가 전달되는 경우와 동일
    * 매개 변수가 싱인자의 배열 공유

### 메소드 오버로딩
* #### 오버로딩
    * 한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성
        * 메소드 이름이 동일해야함
        * 매개 변수의 개수가 서로 다르거나, 타입이 서로 달라야함
        * 리턴 타입은 오버로딩과 관련 없음

### 객체 소멸
* #### 객체 소멸
    * new에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기ㅖ로 되돌려 주는 행위
    * 소멸된 객체 공간은 가용 메모리에 포함
* #### 자바에서 사용자 임의로 객체 소멸 안됨
    * 자바는 객체 소멸 연산자가 없음
    * 객체 소멸은 자바 가상 기계의 고유한 역할
    * 자바 개발자에게는 매우 다행스러운 기능

### 가비지
* #### 가비지
    * 가리키는 레퍼런스가 하나도 없는 객체
        * 더 이상 접근할수 없어 사용할 수 없게 된 메로리
* #### 가비지 컬렉션
    * 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 반환

### 가비지 컬렉션
* #### 가비지 컬렉션
    * 자바 가상 기계가 가비지 자동 회수
    * 가비지 컬렉터에 의해 자동 수행
* #### 강제 가비지 컬렉션 강제 수행
    * System 또는 Runtime 객체의 gc() 메소드 호출
        * System.gc() / 가비지 컬렉션 작동 요청

### 자바의 패키지 개념
* #### 패키지
    * 상호 관련 있는 클래스 파일을 저장하여 관리하는 디렉터리 
    * 자바 응용프로그램은 하나 이상의 패키지로 구성

### 접근 지정자
* #### 자바의 접근 지정자
    * 4가지 : private, protected, public, 디폴트(접근지정자 생략)
* #### 접근 지정자의 목적
    * 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
    * 객체 지향 언어의 캡슐화 정책은 멤버를 보호하는 것

### 클래스 접근 지정
* #### 클래스 접근 지정
    * 다른 클래스에서 사용하도록 허용할지 지정
    * public 클래스 : 다른 모든 클래스에게 접근 허용
    * 디폴트 클래스 : 같은 패키지의 클래스만 접근 허용

### 멤버 접근 지정
* #### public 멤버
    * 패키지에 관계 없이 모든 클래스에게 접근 허용
* #### private 멤버
    * 동일 클래스 내에서만 허용
    * 상속 받은 서브 클래스에서 접근 불가
* #### protected 멤버
    * 같은 패키지 내의 다른 모든 클래스에게 접근 허용
    * 상속 받은 서브 클래스는 다른 패키지에 있어도 접근 가능
* #### 디폴트 멤버
    * 같은 패키지 내의 다른 클래스에게 접근 허용



## 3월 29일
### 실수 리터럴
* #### 소수점 형태나 지수 형태로 표현한 실수
* #### 실수 타입 리터럴은 double타입으로 컴파일
* #### 숫자 뒤에 f(float)나 d(doule)을 명시적으로 붙이기도 함
### 문자 리터럴
* #### 단일 인용부호('')로 문자 표현
* #### 특수문자 리터럴은 백슬래시(\)로 시작
    * '\b' (백스페이스), '\t' (탭), '\n' (라인피드),
    '\f' (폼피드), '\r' (캐리지 리턴), '\"' (이중 인용부호), '\'' (단일 인용부호), '\\' (백슬래시)
### 논리 타입 리터럴
* #### 논리 값 표시
    * true 또는 false 뿐
    * boolean 타입 변수에 치환하거나 조건문에 이용
### 기본 타입 이외 리터럴
* #### null리터럴
    * 레퍼런스 대입 사용
* #### 문자열 리터럴(스트링 리터럴)
    * 문자열 리터럴은 String 객체로 자동 처리
### 상수
* #### final 키워드 사용
* #### 선언 시 초깃값 지정
* #### 실행 중 값 변경 불가
### var 키워드
* #### 기존의 변수 선언 방식 : 변수의 타입 반드시 지정
* #### var키워드
    * 타입을 생략하고 변수 선언 가능
    * 컴파일러가 추론하여 변수 타입 결정
    * 변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류
    * var는 지역 변수 선언에만 한정
### 타입 변환
* #### 타입 변환
    * 한 타입의 값을 다른 타입의 값으로 변환
* #### 자동 타입 변환
    * 컴파일러에 의해 원래의 타입보다 큰 타입으로 자동 변환
    * 치환문(=)이나 수식 내에서 타입이 일치하지 않을때
### 강제 타입 변환
* #### 강제 타입 변환
    * 개발자의 의도적 타입 변환
    * () 안에 개발자가 명시적으로 타입 변환 지정
### 자바의 키 입력과 System.in
* ##### System.in
    * 키보드와 연결된 자바의 표준 입력 스트림
    * 입력되는 키를 바이트(문자 아님)로 리턴하는 저수준 스트림
    * System.in을 직접 사용하면 바이트를 문자나 숫자로 변환하는 많은 어려움이 있음
### Scanner
* #### Scanner 클래스
    * 읽은 바이트를 문자, 정수, 실수, 불린, 문자열등 다양한 타입으로 변환하여 리턴
* #### 객체 생성
### Scanner를 이용한 키 입력
* #### Scanner에서 키 입력 받기
* #### 개발자가 원하는 타입 값으로 쉽게 읽을 수 있음
### Scanner 주요 메소드
* String next() / 다음 토큰을 문자열로 리턴
* byte nextByte() / 다음 토큰을 byte 타입으로 리턴
* short nextShort() / 다음 토큰을 short 타입으로 리턴
* int nextTin() / 다음 토큰을 int 타입으로 리턴
* long nextLong() / 다음 토큰을 long 타입으로 리턴
* float nextFloat() / 다음 토큰을 float 타입으로 리턴
* double nextDouble() / 다음 토큰을 double 타입으로 리턴
* boolean nextBoolean() / 다음 토큰을 boolean 타입으로 리턴
* String nextLine() / '\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머지만 문자열로 리턴
* void close() / Scanner의 사용 종료
* Boolean hasNext() / 현재 입력괸 토큰이 있다면 true, 아니면 새로운 입력 때까지 무한정 대기, 새로운 입력이 들어올 때 true 리턴, crtl-z 키가 입력되면 입력 끝이므로 false 리턴
### 식과 연산자
* #### 연산
    * 주어진 식을 계산하여 결과를 얻어내는 과정
* #### 연산의 종류
    * 증감 ++ --, 산술 + - * / %, 시프트 >> << >>>, 비교 > < >= == !=, 비트 & | ! ^ ~, 논리 && || ! ^, 조건 ? :, 대입 = =* /= += -= &= ^= |= <<= >>= >>>=
### 산술 연산자
* #### 산술 연산자
    * 더하기, 빼기, 곱하기, 나누기, 나머지(%)
    * / 와 % 응용
### 증감 연산
* #### 1증가 혹은 감소 시키는 연산
    * ++, --
* #### 연산자
    * a++ / a를 1 증가하고 증가 전의 값 반환
    * a-- / a를 1 감소하고 감소 전의 값 반환
    * ++a / a를 1증가하고 증가된 값 반환
    * --a / a를 1 감소하고 감소된 값 반환
### 대입 연산
* #### 연산의 오른쪽 결과는 왼쪽 변수에 대입
    * a = b / b 의 값을 a 에 대입
    * a += b / a = a + b 와 동일
    * a -= b / a = a - b 와 동일
    * a *= b / a = a * b 와 동일
    * a /= b / a = a / b 와 동일
    * a %= b / a = a % b 와 동일
    * a &= b / a = a & b 와 동일
    * a ^= b / a = a ^ b 와 동일
    * a |= b / a = a | b 와 동일
    * a <<= b / a = a <<= b 와 동일
    * a >>= b / a = a >>= b 와 동일
    * a >>>= b / a = a >>>= b 와 동일
### 비교 연산, 논리 연산
* #### 비교연산자 : 두 개의 값을 비교하여 true/false 결과
    * a < b 
    * a > b
    * a <= b / a가 b보다 작거나 같으면 true
    * a >= b / a가 b보다 크거나 작으면 true
    * a == b / a가 b와 같으면 true
    * a != b / a가 b와 같지 않으면 true
* #### 논리연산자 : 두 개의 논리 값에 논리 연산. 논리 결과
    * !a / a가 true이면 false, false이면 true
    * a^b / a와 b의 XOR연산. a, b가 같으면 true
    * a || b / a와 b의 OR연산, a와 b 모두 false인 경우에만 false
    * a && b / a와b AND연산. a와b 모두 true인 경우에만 false
### 조건 연산
* #### 3개의 피연산자로 구성된(ternary) 연산자
* #### if-else을 조건연산자로 간결하게 표현 가능
### 비트 연산
* #### 비트 개념
    * byte x = 10;
* #### 비트 연산
    * 비트 논리 연산
    * 비트 시프트 연산
### 비트 논리 연산
* #### 피 연산자의 각 비트들을 대상으로 하는 연산
    * a&b / AND연산 / 두 비트 모두 1이면 1, 그렇지 않으면 0
    * a|b / OR연산 / 두 비트 모두 0이면 0, 그렇지 않으면 1
    * a^b / XOR연산 / 두 비트가 다르면 1, 같으면 0
    * ~a / NOT연산 / 1을 0으로, 0을 1로 변환
### 시프트 연산
* a>>b / 술적 오른쪽 시프트
* a>>>b / 논리적 오른쪽 시프트
* a<< b / 산술적 왼쪽 시프트
### 조건문 -단순 if문, if-else문
* #### 단순 if문
    * if의 괄호 안에 조건식
* #### if-else문
    * 조건식이 true면 실행문장1, false이면 실행문장2 실행
### 다중 if-else문
* #### 다중 if문
    * 조건문이 너무 많은 경우, switch문 사용 권장
### 중첩 if-else문
* #### if문이나 else문, 혹은 if-else문에 if문이나 if-else문을 내포할수 있다.
### switch문
* #### switch문은 식과case문의 값과 비교
    * case의 비교 값과 일치하면 해당 case실행문장 수행
    * case의 비교 값과 일치 하는것이 없으면 default문 실행
### switch문에서 break문의 역할
* #### switch문 내의 break문
    * break문을 만나면 switch문 벗어남
    * case문에 break문이 없다면, 다음 case문으로 실행 계속
### case문의 값
* #### case문의 값
    * 문자, 정수, 실수, 문자열 리터럴만 허용
    * 실수 리터럴은 허용하지 않음


### 반복문
* #### 자바 반복문 - for문, while문, do-while문
### while문
* #### 조건식이 참일 동안 반복 실행
### do-while문
* #### 조건식이 참인동안 반복실핼
* #### 작업문은 한 번 반드시 실행
### 중첩 반복
* #### 중첩 반복
    * 반복문이 다른 반복문을 내포하는 구조
### continue문
* #### contiune문
    * 반복문을 빠져 나가지 않고, 다음 반복으로 제어 변경
* #### 반복문에서 contiune; 문에 의한 분기
### break문
* #### break문
    * 반복문 하나를 즉시 벗어날때 사용
### 자바 배열
### 배열
* #### 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
* #### 배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간
* #### 배열 인덱스
    * 0부터 시작
### 배열 선언과 생성
* #### 배열에 대한 레퍼런스 변수 intArray 선언
* #### 배열 생성
### 배열 선언 및 생성 디테일
* #### 배열 선언과 배열 생성의 두 단계 필요
* #### 배열 선언
* #### 배열 생성
* #### 배열 초기화
### 배열 인덱스와 배열 원소 접근
* #### 배열 인덱스
    * 배열의 인덱스는  0 ~ (배열 크기 -1)
* #### 인덱스를 잘못 사용한 경우
* #### 반드시 배열 생성 후 접근
### 레퍼런스 치환과 공유
* #### 레퍼런스 치환으로 두 레퍼런스가 하나의 배열 공유
### 배열의 크기, length 필드
* #### 자바의 배열은 객체로 처리
    * 배열 객체의 length 필드
### 함수 호출 시 배열 전달 비교 : C/C++ VS 자바
* #### C/C++ 경우, 배열과 크기를 각각 전달 받음
* #### 자바 경우, 배열만 전달받음
### 배열과 for-each문
* #### for-each문
    * 배열이나 나열(enumeration)의 원소를 순차 접근하는데 유용한 for문
    * for-each문으로 정수 배열의 합을 구하는 사례

## 3월 22일  
내용  
java work디랙토리에서 test파일을 만들고 기존 리드미 파일에 복사, 빨간색으로 오류가 뜨면 vs코드 껐다가 다시키기  

### 프로그래밍 언어  
1. 기계어  
2. 어셈플리어  
3. 고급 언어  

### 프로그래밍과 컴파일  
소스: 프로그래밍 언어로 작성된 텍스트 파일  
컴파일: 소스파일을 컴퓨터가 이해 할수있는 기계어로 만드는과정  

### 기존 언어의 플랫폼 종속성  
* 플랫폼 = 하드웨어 플랫폼 + 운영체제 플랫폼  
* 기계어가 CPU마다 다름
* 운영체제마다 API가 다름
* 운영체제마다 실행파일 형식이 다름

### 자바의 플랫폼 독립성, WORA
* #### WORA
    * 한번 작성괸 코드는 모든 플랫폼에서 바로 실행됨  
    * WORA를 가능하게 하는 자바의 특징
* #### 바이트 코드
    * 자바소스를 컴파일한 목적코드이며 CPU에 종속적이지 않고 JVM에 의해 해석되고 실행됨
* #### JVM
    * 자바 바이트 코드를 실행하는 자바 가상기계(소프트웨어)

### 자바 가상 기계와 자바 실행 환경
* #### 바이트 코드
    * 자바 가상 기계에서 실행 가능한 바이너리 코드
* #### 자바 가상 기계
    * 각기 다른 플랫폼에 설치되어도 동일한 자바 실행 환경 제공
* #### 자바의 실행
    * 자바 가상 기계가 클래스 파일의 바이트 코드를 실헹

### 자바 응용프로그램 실행 환경
* #### 실행환경
    * 자바 가상 기계 + 자바 플랫폼의 다양한 클래스 라이브러리(자바 API)
* #### 응용프로그램 실행
    * main() 메소드를 가진 클래스의 main()에서 실행 시작

### JDK 와 JRE
* #### JDK
    * 자바 응용 개발 환경. 개발에 필요한 도구 포함

* #### JRE
    * 자바 실행 환경 JVM포함
    * 컴파일된 API들이 들어있는 모듈 파일

### JAVA 9부터 시작된 모듈 프로그래밍
#### 모듈화
* JAVA9에서 정의된 새로운 기능
* #### 모듈 
    * 자바 패키지들과 미이지, XML 파일 등의 자원들을 묶은 단위
* #### 모듈 프로그래밍
    * 자바 응용프로그램을 마치 직소 퍼즐을 연결하듯이 필요한 모듈을 연경하는 방식으로 작성
* #### 자바 플랫폼의 모듈화
    * 실행 시간에 사용되는 자바API의 모든 클래스들을 모듈들로 분할
    * 모듈화의 목적
        * 세밀한 모듈화
        * 작은 크기의 실행환경 구성
        * 하드웨어가 열악한 소형 IOT장치 지원
* #### 모듈 방식이 아닌, 기존 방식으로 자바 프로그래밍 해도 무관
    * 자바 플랫폼이 모듈방식으로 바뀌었지만, 굳이 응용프로그램을 모듈 방식으로 작성할 필요 없음

### 자바 API
* #### 자바 API란?
    * JDK에 포함된 클래스 라이브러리
        * 주요한 기능들은 미리 구현해놓은 클래스 라이브러리의 집합
    * 개발자는 API를 이용하여 자바 프로그램 개발

* #### 자바 패키지
    * 서로 관련된 클래스들을 분류하여 묶어 놓은것
    * 계층구조로 되어있음
        * 클래스의 이름에 패키지 이름도 포함
        * 다른 패키지에 동일한 이름의 클래스 존재 가능
    * 자바 API는 JDK에 패키지 형태로 제공됨
    * 개발자 자신의 패키지 생성 가능

### 자바 통합 개발 환경
* #### IDE란?
    * 통합 개발 환경
    * 편집, 컴파일, 디버깅을 한번에 할수 있는 통합된 개발 환경
    * 이클립스, 인텔리제이, VS코드등이 있음

### 자바 응용의 종류: 데스크톱 응용프로그램
* PC등의 데스크톱 컴퓨터에 설치되어 실행
* 자바 실행 환경이 설치된 어떤 컴퓨터에서도 실행

### 자바 응용의 종류: 서블릿 프로그램
* #### 서블릿
    * 웹 서버에서 실행되는 자바 프로그램
        * 서블릿은 웹브라우저에서 실행되는 자바스크립트 코드와 통신
* 데이터베이스 서버 및 키타 서버와 연동되는 복잡한 기능 구현 시 사용
* 사용자 인터페이스가 필요없는 응용
* 웹 서버에 의해 통제 받음

### 자바 모바일 응용: 안드로이드 앱
* #### 안드로이드
    * 구글의 주도로 여러 모바일 회사가 모여 구성한 OHA(Open Handest Alliance)에서 만든 무료 플랫폼
    * 개발 언어는 자바를 사용하나 JVM에 해당하는 Dalvik은 기존 바이트 코드와 호환성 없어 변환 필요

### 자바의 특성(1)
* #### 플랫폼 독립성
    * 하드웨어, 운영체제에 종속되지 않는 바이트 코드로 플랫폼 독립성 확보
* #### 객체지향
    * 캡슐화, 상속, 다향성 지원
* #### 클래스로 캡슐화
    * 자바의 모든 변수나 함수는 클래스 내에 선언
    * 클래스 안에서 클래스(내부 클래스)작성 가능
* #### 소스와 클래스 파일
    * 하나의 소스 파일에 여러 클래스 작성 가능
        * public 클래스는 하나만 가능
    * 소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야함
    * 클래스 파일에는 하나의 클래스만 존재 (클래스 파일과 이름이 다르면 다수 존재가능)
        * 다수의 클래스를 가진 자바 소스를 컴파일하면 클래스마다 변도 클래스 파일 생성

### 자바의 특성(2)
* #### 패키지
    * 서로 관련 있는 여러 클래스를 패키지로 묶어 관리
    * 패키지는 폴더 개념
* #### 멀티스레드
    * 여러 스레드의 동시 수행 환경 지원
        * 자바는 운영체제의 도움 없이 자체적으로 멀티스레드 지원
* #### 가비지 컬렉션
    * 자바 언어는 메모리 할당 기능은 있어도 메모리 반환 기능 없음
        * 사용하지 않는 메모리는 JVM에 의해 자동 반환 - 가비지 컬렉션

### 자바의 특성 (3)
* #### 실시간 응용프로그램에 부적합
    * 실행 도중 예측할수 없는 시점에 가비지 컬렉션 실행 때문
        * 응용프로그램의 일시적 중단 발생
* #### 자바 프로그램은 안전
    * 타입 체크 엄격
    *  물리적 주소를 사용하는 포인터 개념 없음
* #### 프로그램 작성 쉬움
    * 포인터 개념 없음
    * 동적 메모리 반환 하지 않음
    * 다양한 라이브러리 지원
* #### 실행 속도 개선을 위한 JIT 컴파일러 사용
    * 자바는 바이트 코드를 인터프리터 방식으로 실행
        * 기계어가 실행되는 것보다 느림
    * JIT 컴파일 기법으로 실행 속도 개선
         JIT 컴파일 - 실행 중에 바이트 코드를 기계어 코드로 컴파일하여 기계어를 실행하는 기법

### 식별자란?
* #### 클래스, 변수, 상수, 메소드등에 붙는 이름
* #### 식별자 원칙
    * 특수문자, 공백 또는 탭은 식별자로 사용 불가
    * 유니코드문자 사용 가능(추천하지 않음)
    * 자바 언어의 키워드는 식별자로 사용불가
    * 식별자의 첫 번째 문자로 숫자는 사용불가
    * '_', '&'를 식별자 첫 번째 문자로 사용할수 있으나 일반적으로 추천하지 않음
    * NULL, TRUE, FALSE등은 사용 불가
    * 길이 제한 없음
* #### 대소문자 구별

### 자바의 데이터 타입
* #### 자바의 데이터 타입
    * 기본 타입: 8개
        * boolean
        * char
        * byte
        * short
        * int
        * long
        * float
        * double
    * #### 레퍼런스 타입: 1개이며 용도는 3가지
        * 클레스에 대한 레퍼런스
        * 인터페이스에대한 레퍼런스
        * 배열에 대한 레퍼런스
    * #### 특징
        * 기본 타입의 크기는 CPU나 운영체제에 따라 변하지 않음

### 문자열
*  문자열은 기본 타입이 아님
*  String 클래스로 문자열 표현

### 변수와 선언
* #### 변수
    * 프로그램 실행 중에 값을 임시 저장하기 위한 공간
* #### 변수 선언
    * 데이터 타입에서 정한 크기의 메모리 할당

### 리터럴과 정수 리터럴
* #### 리터럴
    * 프로그램에서 직접 표현한 값
    * 정수, 실수, 문자, 논리, 문자열 리터럴 있음
* #### 정수 리터럴
    * 10진수, 8진수, 16진수, 2진수 리터럴
    * 정수 리터럴은 int형으로 컴파일
    * long타입 리터럴은 숫자 뒤에 L 또는 I를 붙여 표시


## 3월 15일  
내용  
commit 할때 한글로 입력. 파일 이름보고 이해 가능해야함 (나중엔 영어로 입력하는게 바람직함)  
현재 내용을 commit하는것이 아니라 전에 것만 푸쉬하고 싶을땐 아래쪽 main옆 위쪽 화살표를 누르면 됨  
commit을 하는 타이밍과 방법에 관한 학습  