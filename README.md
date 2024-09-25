# :star: About

## 🍎 Team Lucycato 소개
Team Lucycato는 스타트업, 금융업에 종사하는 다양한 백엔드 개발자로
이루어진 스터디 모임입니다. 우리는 매주 정기적으로 온라인, 오프라인 모임을 통해
Spring Framework 기반으로 최신 기술 스택 학습과, 본질적인 실력향상을 위해
좋은 코드를 연구하고 분석하는 스터디를 진행하고 있습니다.

### Period  : 2024/03/~

## Swagger msa서버 스펙에 맞춰서 gateway 에서 접근가능하도록 구현
<img src="https://github.com/user-attachments/assets/978d0b7a-c68f-4e27-af77-aabc3be055ed" width="70%">  

* Swagger를 이용해 Gateway 접근을 구현한 경험을 통해, 복잡한 서비스 구조에서도 효율적인 API 관리를 제공할 수 있으며, 시스템 확장성과 팀 간 협업을 크게 향상

## 동적쿼리 QueryDSL Spring 3 버전에 맞춰 리펙토링 적용
* Spring 3 버전에 맞춰 QueryDSL을 활용한 동적 쿼리 리팩토링 경험을 통해, 기존 시스템을 최신 환경에 맞게 최적화하고 유지보수성을 높여 생산성과 코드 품질을 향상

## Docker Docker compose 공통화 리펙토링
* 시스템의 일관된 배포와 운영을 자동화하여 개발 속도와 안정성을 높여 인프라 관리 효율성을 극대화

## 핵사고날아키텍처
<img alt="2" src="https://github.com/user-attachments/assets/479ba675-50cb-4a0e-a8d6-7a073aaf75c8" width="70%">  

* 핵사고날 아키텍처를 적용하여 외부 의존성 변화에도 핵심 코드를 유지한 채 유연하게 대응한 경험을 통해, 안정적인 시스템 확장성과 유연한 유지보수를 지원하여 회사의 개발 효율성을 크게 향상, 기존 레이어드 아키텍처에서는 외부 종속성으로 인한 문제 발생률이 1.5배 높았지만 핵사고날 아키텍처는 이러한 문제를 해결

## msa 유저인가 패스포트전략
<img alt="1" src="https://github.com/user-attachments/assets/1e2f52b1-b64a-4ea7-92eb-7532f7310fbf" width="70%">  

* 패스포트 전략을 사용해 유저 인가 정보를 스레드 메모리에 저장하여 외부 통신 없이 빠르게 유저 정보를 가져오는 방식으로, DB나 Redis에 대한 호출 시간을 **0ms**에 가깝게 줄여 성능을 극대화할 수 있었음, 이 방식은 기존의 외부 호출 대비 처리 시간을 5~20ms 절약하고, 시스템의 부하를 크게 줄여 줄 수 있다.

## 모니터링툴  Prometheus, Loki, Grafana
<img src="https://github.com/user-attachments/assets/b2ad7ea8-0d60-480a-a4ac-85d8b4e6d324" width="70%">  

* 방대한 서버 모니터링을 효과적으로 수행한 경험을 통해, 실시간 데이터 시각화와 로그 관리로 인해 문제 진단 시간이 최대 60% 단축되고, 리소스 사용 최적화로 서버 성능 개선, 이를 통해 인프라 관리 효율성을 크게 향상.

## 카프카, 게이트웨이 유레카 사용
https://velog.io/@witwint/series/%EC%B9%B4%ED%94%84%EC%B9%B4  

## CQRS, Webflux
* MSA에서 CQRS(읽기서버와 쓰기서버의 분리)와 WebFlux를 활용해 읽기와 쓰기 작업을 분리한 서버 구축 경험을 통해, 시스템 성능이 개선되고, 각각의 작업에 맞춘 최적화로 확장성 또한 크게 향상, 특히, 읽기와 쓰기를 독립적으로 확장할 수 있어 시스템 부하 분산이 효과적으로 이루어졌으며, 기존 CRUD 방식에 비해 **30%** 더 빠른 데이터 조회 성능을 제공

## 문제 해결/개선사항/추가학습
* 아키텍처 분석
 * 외부 의존성에 대한 강한 결합으로 인해, 변경 시 여러 계층을 수정해야 하는 복잡성과 성능 저하 문제가 발생
 * 비즈니스 로직을 외부 의존성과 분리하여 유연성과 확장성을 높이고, 유지보수와 테스트가 용이
 * https://velog.io/@witwint/레이어드와-헥사고날-아키텍처

* DB 분석 인덱싱등 시간감소
 * [https://velog.io/@witwint/쿼리-실행-계획](https://velog.io/@witwint/%EC%BF%BC%EB%A6%AC-%EC%8B%A4%ED%96%89-%EA%B3%84%ED%9A%8D)

## 요구 사항

- JDK 17
- Gradle 8.5
- Docker, Docker Compose

## 🔍 설치 및 실행

1. 이 저장소를 클론합니다:

```bash
git clone git@github.com:lucycato-backend/lucycato-e-commerce.git
```

2. 프로젝트 디렉토리로 이동합니다:

```bash
cd lucycato-e-commerce
```

3. Docker plug-in, Docker Compose를 사용하여 프로젝트를 빌드 및 이미지를 생성, 실행합니다.

```bash
## 로컬에서 API 실행을 원할 경우
make local-app 

## 로컬에서 DB 실행을 원할 경우
make local-db 
```

## Team Lucycato DNA
 - 열정, 희생, 헌신
 - 세상에 나아가자

## Team Lucycato Vision
- 탁월한 기준에 근거한 코드를 작성하는 본질적인 실력향상
- 탁월한 기준과 안목의 초석이 되는 CS 학습
- PR (블로그 글작성 및 영상촬영)


현재 부족한 분들은 제가 기본 개념에 대해서 강의를 해드리고 있습니다. (앞으로 합류할 인원들을 위해 강의 촬영도 기획 중입니다.)
그러니 열정이 있고 포기하지 않는 근성을 가진 분이라면 과감히 연락주세요.

- Team Lucycato 리더 도학태 전화번호: 010-8705-1693
- Team Lucycato github: https://github.com/lucycato-backend
