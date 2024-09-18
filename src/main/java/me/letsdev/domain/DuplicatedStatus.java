package me.letsdev.domain;

import me.letsdev.util.enums.EnumUtil;

public enum DuplicatedStatus {
    PENDING(10),
    ACTIVE(10), // 실수로 같은 값을 부여한 예시
    REMOVED(0);

    private final int code;

    // enum 클래스는 독특하게도, 열거 상수의 생성자가 먼저 실행되고 static 블록을 실행합니다.
    static {
        assert EnumUtil.isUnique(DuplicatedStatus.class, DuplicatedStatus::code)
                : "SampleStatus의 모든 code 필드가 고유해야 합니다.";
    }

    DuplicatedStatus(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
