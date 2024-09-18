package me.letsdev;

public class Main {
    public static void main(String[] args) {
        prepareClassLoadAssertionTest()
                .className("me.letsdev.domain.UserStatus")
                .success("✅ UserStatus의 code 필드는 중복 없음")
                .error("❌ UserStatus의 code 필드가 중복됨.")
                .test();

        prepareClassLoadAssertionTest()
                .className("me.letsdev.domain.DuplicatedStatus")
                .success("✅ DuplicatedStatus의 code 필드는 중복 없음")
                .error("❌ DuplicatedStatus의 code 필드가 중복됨.")
                .test();
    }

    private static TestClassLoadAssertion prepareClassLoadAssertionTest() {
        return TestClassLoadAssertion.prepare();
    }
}
