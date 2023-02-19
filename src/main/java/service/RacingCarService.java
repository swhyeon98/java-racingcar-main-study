package service;

import domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RacingCarService {
    public void moveAllCars(List<Car> cars) {
        for (Car car : cars) {
            car.move(ThreadLocalRandom.current().nextInt(10));
        }
    }

    public List<Car> getWinners(List<Car> cars) {
        List<Car> winners = new ArrayList<>();
        int maxPosition = getMaxPosition(cars);
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car);
            }
        }
        return winners;
    }

    private int getMaxPosition(List<Car> cars) {
        int maxPosition = Integer.MIN_VALUE;
        for (Car car : cars) {
            int position = car.getPosition();
            if (position > maxPosition) {
                maxPosition = position;
            }
        }
        return maxPosition;
    }
}
