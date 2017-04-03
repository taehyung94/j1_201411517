package headfirst.observer.weather;

public interface Subject { //자바 observerable 클래스 사용가능
 public void registerObserver(Observer o);
 public void removeObserver(Observer o);
 public void notifyObservers();
}