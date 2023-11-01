package racingcar.model;

import java.util.List;

public class RacingCars {

    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }

    public void race() {
        racingCars.forEach(RacingCar::race);
    }

    public void printCarsPosition() {
        RacingCarsCurrentPositionDisplay.displayCurrentRacingCarsPosition(List.copyOf(racingCars));
    }

    public void printWinnersName() {
        RacingReferee.printWinnersName(List.copyOf(racingCars));
    }
}
