package controller;

import domain.Car;
import service.RacingCarService;

import java.util.List;
import java.util.stream.Collectors;

import static view.InputView.inputCarNames;
import static view.InputView.inputTryCount;
import static view.OutputView.printResult;
import static view.OutputView.printWinners;

public class RacingCarController {
    private final RacingCarService racingCarService;

    public RacingCarController(RacingCarService racingCarService) {
        this.racingCarService = racingCarService;
    }

    public void run() {
        List<String> carNames = inputCarNames();
        List<Car> cars = carNames.stream()
                .map(name -> new Car(name, 0))
                .collect(Collectors.toList());
        int rounds = inputTryCount();

        for (int i=0; i<rounds; i++) {
            racingCarService.moveAllCars(cars);
            printResult(cars);
        }

        List<Car> winners = racingCarService.getWinners(cars);
        printWinners(winners);
    }
}
