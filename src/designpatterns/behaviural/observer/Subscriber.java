package designpatterns.behaviural.observer;

public interface Subscriber<T> {

    public void listen(T type ,Order o);
}
