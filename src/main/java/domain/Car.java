package domain;

public class Car {
    private final String name;
    private int position;

    private static final int MAX_CAR_NAME_LENGTH = 5;

    public Car(String name, int position) {
        checkNameBlank(name);
        validateNameLength(name);
        this.name = name;
        this.position = 0;
    }

    public void move(int number) {
        position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void checkNameBlank(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름에 공백이 있습니다.");
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
