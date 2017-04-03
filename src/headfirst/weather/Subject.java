package headfirst.observer.weather;

public interface Subject { //�ڹ� observerable Ŭ���� ��밡��
 public void registerObserver(Observer o);
 public void removeObserver(Observer o);
 public void notifyObservers();
}