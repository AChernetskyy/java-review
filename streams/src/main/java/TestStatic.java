import java.math.BigDecimal;

public class TestStatic {
    public static BigDecimal num;
    public String name;
    public int age;

    public TestStatic(BigDecimal num, String name){
        this.num= num;
        this.name = name;
    }

    public String toString() {
        return "TestStatic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static class Test{
        public static void main(String[] args) {
            TestStatic t1 = new TestStatic(new BigDecimal(1),"G");
            System.out.println(t1);
        }
    }
}
