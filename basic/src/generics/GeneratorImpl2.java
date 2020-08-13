package generics;

// 实现泛型接口，指定类型
public class GeneratorImpl2<T> implements Generator<String> {
    @Override
    public String method() {
        return "Hello Generator";
    }
}
