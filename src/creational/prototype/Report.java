package creational.prototype;

public interface Report extends Cloneable {
    Report clone();
    void export(String format);
}
