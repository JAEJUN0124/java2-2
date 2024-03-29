# 황재준 학번 202330233
## 3월 29일
* #### 실수 리터럴
    * 소수점 형태나 지수 형태로 표현한 실수
    * 실수 타입 리터럴은 double타입으로 컴파일
    * 숫자 뒤에 f(float)나 d(doule)을 명시적으로 붙이기도 함
* #### 문자 리터럴
    * 단일 인용부호('')로 문자 표현
    * 특수문자 리터럴은 백슬래시(\)로 시작
        * '\b' (백스페이스), '\t' (탭), '\n' (라인피드), '\f' (폼피드), '\r' (캐리지 리턴), '\"' (이중 인용부호), '\'' (단일 인용부호), '\\' (백슬래시)
* #### 논리 타입 리터럴
    * 논리 값 표시
        * true 또는 false 뿐
        * boolean 타입 변수에 치환하거나 조건문에 이용
* #### 기본 타입 이외 리터럴
    * null리터럴
        * 레퍼런스 대입 사용
    * 문자열 리터럴(스트링 리터럴)
        * 문자열 리터럴은 String 객체로 자동 처리
* #### 상수
    * final 키워드 사용
    * 선언 시 초깃값 지정
    * 실행 중 값 변경 불가
* #### var 키워드
    * 기존의 변수 선언 방식 : 변수의 타입 반드시 지정
    * var키워드
        * 타입을 생략하고 변수 선언 가능
        * 컴파일러가 추론하여 변수 타입 결정
        * 변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류
        * var는 지역 변수 선언에만 한정
* #### 타입 변환
    * 타입 변환
    * 한 타입의 값을 다른 타입의 값으로 변환
    * 자동 타입 변환
        * 컴파일러에 의해 원래의 타입보다 큰 타입으로 자동 변환
        * 치환문(=)이나 수식 내에서 타입이 일치하지 않을때
* #### 강제 타입 변환
    * 강제 타입 변환
        * 개발자의 의도적 타입 변환
        * () 안에 개발자가 명시적으로 타입 변환 지정
* #### 자바의 키 입력과 System.in
    * System.in
        * 키보드와 연결된 자바의 표준 입력 스트림
        * 입력되는 키를 바이트(문자 아님)로 리턴하는 저수준 스트림
        * System.in을 직접 사용하면 바이트를 문자나 숫자로 변환하는 많은 어려움이 있음
* #### Scanner
    * Scanner 클래스
        * 읽은 바이트를 문자, 정수, 실수, 불린, 문자열등 다양한 타입으로 변환하여 리턴
    * 객체 생성
* #### Scanner를 이용한 키 입력
    * Scanner에서 키 입력 받기
    * 개발자가 원하는 타입 값으로 쉽게 읽을 수 있음
* #### Scanner 주요 메소드
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
* #### 식과 연산자
    * 연산
        * 주어진 식을 계산하여 결과를 얻어내는 과정
    * 연산의 종류
        * 증감 ++ --, 산술 + - * / %, 시프트 >> << >>>, 비교 > < >= == !=, 비트 & | ! ^ ~, 논리 && || ! ^, 조건 ? :, 대입 = =* /= += -= &= ^= |= <<= >>= >>>=
* #### 산술 연산자
    * 산술 연산자
        * 더하기, 빼기, 곱하기, 나누기, 나머지(%)
        * / 와 % 응용
* #### 증감 연산
    * 1증가 혹은 감소 시키는 연산
        * ++, --
    * 연산자
        * a++ / a를 1 증가하고 증가 전의 값 반환
        * a-- / a를 1 감소하고 감소 전의 값 반환
        * ++a / a를 1증가하고 증가된 값 반환
        * --a / a를 1 감소하고 감소된 값 반환
* #### 대입 연산
    * 연산의 오른쪽 결과는 왼쪽 변수에 대입
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
* #### 비교 연산, 논리 연산
    * 비교연산자 : 두 개의 값을 비교하여 true/false 결과
        * a < b 
        * a > b
        * a <= b / a가 b보다 작거나 같으면 true
        * a >= b / a가 b보다 크거나 작으면 true
        * a == b / a가 b와 같으면 true
        * a != b / a가 b와 같지 않으면 true
    * 논리연산자 : 두 개의 논리 값에 논리 연산. 논리 결과
        * !a / a가 true이면 false, false이면 true
        * a^b / a와 b의 XOR연산. a, b가 같으면 true
        * a || b / a와 b의 OR연산, a와 b 모두 false인 경우에만 false
        * a && b / a와b AND연산. a와b 모두 true인 경우에만 false
* #### 조건 연산
    * 3개의 피연산자로 구성된(ternary) 연산자
    * if-else을 조건연산자로 간결하게 표현 가능
* #### 비트 연산
    * 비트 개념
        * byte x = 10;
    * 비트 연산
        * 비트 논리 연산
        * 비트 시프트 연산
* #### 비트 논리 연산
    * 피 연산자의 각 비트들을 대상으로 하는 연산
        * a&b / AND연산 / 두 비트 모두 1이면 1, 그렇지 않으면 0
        * a|b / OR연산 / 두 비트 모두 0이면 0, 그렇지 않으면 1
        * a^b / XOR연산 / 두 비트가 다르면 1, 같으면 0
        * ~a / NOT연산 / 1을 0으로, 0을 1로 변환
* #### 시프트 연산
    * a>>b / 술적 오른쪽 시프트
    * a>>>b / 논리적 오른쪽 시프트
    * a<< b / 산술적 왼쪽 시프트
* #### 조건문 -단순 if문, if-else문
    * 단순 if문
        * if의 괄호 안에 조건식
    * if-else문
        * 조건식이 true면 실행문장1, false이면 실행문장2 실행
* #### 다중 if-else문
    * 다중 if문
        * 조건문이 너무 많은 경우, switch문 사용 권장
* #### 중첩 if-else문
    * if문이나 else문, 혹은 if-else문에 if문이나 if-else문을 내포할수 있다.
* #### switch문
    * switch문은 식과case문의 값과 비교
        * case의 비교 값과 일치하면 해당 case실행문장 수행
        * case의 비교 값과 일치 하는것이 없으면 default문 실행
* #### switch문에서 break문의 역할
    * switch문 내의 break문
        * break문을 만나면 switch문 벗어남
        * case문에 break문이 없다면, 다음 case문으로 실행 계속
* #### case문의 값
    * case문의 값
        * 문자, 정수, 실수, 문자열 리터럴만 허용
        * 실수 리터럴은 허용하지 않음


* #### 반복문
    * 자바 반복문 - for문, while문, do-while문
* #### while문
    * 조건식이 참일 동안 반복 실행
* #### do-while문
    * 조건식이 참인동안 반복실핼
    * 작업문은 한 번 반드시 실행
* #### 중첩 반복
    * 중첩 반복
        * 반복문이 다른 반복문을 내포하는 구조
* #### continue문
    * contiune문
        * 반복문을 빠져 나가지 않고, 다음 반복으로 제어 변경
    * 반복문에서 contiune; 문에 의한 분기
* #### break문
    * break문
        * 반복문 하나를 즉시 벗어날때 사용
* #### 자바 배열
    * 배열
        * 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
        * 배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간
        * 배열 인덱스
            * 0부터 시작
* #### 배열 선언과 생성
    * 배열에 대한 레퍼런스 변수 intArray 선언
    * 배열 생성
* #### 배열 선언 및 생성 디테일
    * 배열 선언과 배열 생성의 두 단계 필요
    * 배열 선언
    * 배열 생성
    * 배열 초기화
* #### 1

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