# Enum 객체의 고유 필드 확인

- `static` 블록에서 enum의 모든 열거 상수와 필드를 확인할 수 있습니다.
- `assert` 키워드로 프로덕션에서의 불필요한 실행을 없앱니다.
- [enum-util](https://github.com/merge-simpson/enum-util) 라이브러리의 다운로드 및 실행을 테스트합니다.

## Assertion 활성화

데모 프로젝트이기 때문에 런타임 VM 옵션에 `-ea`를 추가합니다.  
테스트 코드를 실행할 때는 대부분 이 옵션이 자동으로 포함되기 때문에 따로 추가하지 않아도 됩니다.

## Expectation

- `UserStatus`의 `code` 필드는 고유해야 하며, 실제로 고유하게 구현했습니다. (expected: ✅)
- `DuplicatedStatus`의 `code` 필드는 고유해야 하며, 고유하지 않게 구현했습니다. (expected: ❌)