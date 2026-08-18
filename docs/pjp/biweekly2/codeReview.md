# Code Review

## Original Method

```java
public double x(double a, double b, int c) {
    double r = 1;
    for(int i=0;i<c;i++) {
        r = r*(1+b);
    }
    return a*r;
}
```

## Five Clean-Code Problems

1. **Poor method name**  
   The name `x` does not explain what the method does.

2. **Poor variable names**  
   Names like `a`, `b`, `c`, `r`, and `i` do not clearly explain what the values represent.

3. **Magic numbers**  
   The value `1` is used directly without explaining its purpose.

4. **Poor formatting**  
   The loop is compressed into a few lines, which makes the code harder to read.

5. **Missing documentation**  
   The method does not explain its purpose, parameters, or return value.

## Cleaned Method

```java
/**
 * Calculates compound growth on a principal amount.
 *
 * @param principalAmount initial amount
 * @param growthRate growth rate per period
 * @param numberOfPeriods number of periods
 * @return final amount after applying compound growth
 */
public double calculateCompoundGrowth(
        double principalAmount,
        double growthRate,
        int numberOfPeriods) {

    double finalAmount = principalAmount;

    for (int period = 0; period < numberOfPeriods; period++) {
        finalAmount *= (1 + growthRate);
    }

    return finalAmount;
}
```