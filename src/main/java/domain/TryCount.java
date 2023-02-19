package domain;

public class TryCount {
    private int tryCount;

    public TryCount(int tryCount) {
        validateZero(tryCount);
        validateNegativeNumber(tryCount);
        this.tryCount = tryCount;
    }

    private void validateNegativeNumber(int tryCount) {
        if (tryCount < 0) {
           throw new IllegalArgumentException("[ERROR] 시도 횟수는 양수여야 합니다.");
        }
    }

    private void validateZero(int tryCount) {
        if (tryCount == 0) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 1 이상이어야 합니다.");
        }
    }
}
