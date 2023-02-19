import controller.RacingCarController;
import service.RacingCarService;

public class Application {
    public static void main(String[] args) {
        RacingCarService racingCarService = new RacingCarService();
        RacingCarController racingCarController = new RacingCarController(racingCarService);

        racingCarController.run();
    }
}
