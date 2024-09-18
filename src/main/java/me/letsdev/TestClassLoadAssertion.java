package me.letsdev;

public class TestClassLoadAssertion {
    private String className;
    private String success;
    private String error;

    static TestClassLoadAssertion prepare() {
        return new TestClassLoadAssertion();
    }

    public TestClassLoadAssertion className(String className) {
        this.className = className;
        return this;
    }

    public TestClassLoadAssertion success(String success) {
        this.success = success;
        return this;
    }

    public TestClassLoadAssertion error(String error) {
        this.error = error;
        return this;
    }

    public void test() {
        boolean assertionEnabled = false;
        assert assertionEnabled = true;

        if (!assertionEnabled) {
            System.out.println("TestClassLoadAssertion.test()를 위해 실행 VM 옵션에 `-ea`가 필요합니다.");
            return;
        }

        try {
            Class.forName(className);
            System.out.println(success);
        } catch (AssertionError e) {
            System.out.println(error);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}