# _Spring Boot Project 생성 (1주차)_
>## **Java Version 및 IDE**
* Java 11
* IntelliJ 무료판
>## **사용 Dependency**
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
