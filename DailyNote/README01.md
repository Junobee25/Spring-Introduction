# _Spring Boot Project 생성 (1주차)_
>## Java Version 및 IDE
* Java 11
* IntelliJ 무료판
>## 사용 Dependency
* Spring Web
* Thymeleaf (Web Template Engine)
___
### 8080 Port연결 완료
📌 localhost:8080시  
Whitelabel Error Page 출력
>## 라이브러리 살펴보기
* Gradle은 의존관계가 있는 라이브러리를 함께 Download한다.
    * Spring Boot 라이브러리
* Spring-boot-starter-web
    * Spring-boot-starter-tomcat:톰캣(웹서버)
    * Spring-webmvc:스프링 웹 MVC
* Spring-boot-starter-thymeleaf:타임리프 템플릿엔진(View)
* Spring-boot-starter(공통):스프링 부트 + 스프링 코어 + 로깅
    * Spring-boot
        * spring-core
    * Spring-boot-starter-logging
        * logback,slf4j
    
    * 테스트 라이브러리
* Spring-boot-starter-test
    * junit:테스트 프레임워크
    * mockito:목 라이브러리
    * assertj:테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
    * Spring-test:스프링 통합 테스트 지원
>## View 환경설정
### Welcome Page 만들기
✅ resources/static/index.html
```html
<!DOCTYPE HTML>
<html>
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
Hello
<a href="/hello">hello</a>
</body>
</html>
```
* 스프링 부트가 제공하는 Welcome Page 기능
    * static/index.html을 올려주면 Welcome Page 기능을 제공
* thymeleaf template engine
### 간단하게 동작하고 프로그래밍되는 화면을 만들려면
1. Web App의 첫번째 진입점인 Controller만들어 Mapping을 통해서 해당 url이 들어오면 메서드를 호출
2. Model data를 렌더링
✨ 컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버('viewResolver')가 화면을 찾아서 처리  
✨ 'resources:templates/'+(ViewName)+'.html'
>## 빌드하고 실행하기
### console
1. ./gradlew.bat build
2. cd build/libs
3. java -jar 스프링-SNAPSHOT.jar(파일명)




