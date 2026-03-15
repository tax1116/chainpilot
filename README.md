# ChainPilot

> Connect, test, and automate your API workflows

ChainPilot은 API 워크플로우 자동화 플랫폼입니다. API 스텝을 등록하고, 플로우로 연결하고, 실행/검증/모니터링까지 하나의 웹 UI에서 수행합니다.

## 기술 스택

- **Language:** Kotlin 2.2.21
- **Framework:** Spring Boot 4.0.3
- **Build:** Gradle (Kotlin DSL)
- **Java:** 21
- **Test:** JUnit 5
- **Lint:** ktlint

## 빌드 & 실행

```bash
./gradlew build              # 전체 빌드
./gradlew check              # 테스트 + ktlint
./gradlew bootRun            # 실행

# 테스트
./gradlew test
./gradlew :app:test

# 린트
./gradlew ktlintCheck
./gradlew ktlintFormat
```

## 프로젝트 구조

```
chainpilot/
├── buildSrc/                # 컨벤션 플러그인 (global, spring-boot, spring-jar)
├── app/                     # 메인 애플리케이션
├── gradle/libs.versions.toml  # 버전 카탈로그
└── settings.gradle.kts
```
