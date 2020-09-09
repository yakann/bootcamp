package Interfaceses;
import Exception.CountExceedException;
public interface ITariff {
    void DebtCalculate(int quota) throws CountExceedException;
}
