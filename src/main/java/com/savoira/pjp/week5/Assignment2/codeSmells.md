# Code Smells

## 1. Poor Naming

The method name `process` and parameter name `l` do not clearly explain
what the method does.

## 2. Repeated and Hard-to-Read Expressions

The code repeatedly uses `l.get(i).principal` and `l.get(i).loanId`.
An enhanced for-loop makes the code easier to read.

## Refactored Method

```java
public static void processLoans(List<Loan> loans) {

    for (Loan loan : loans) {

        if (loan.principal > 500000
                && loan.principal < 2000000) {

            System.out.println(loan.loanId);
        }
    }
}