#  Currency Converter (Java)

Welcome! This is a simple Java project that lets you convert money from one currency to another.

If you're just starting out with Java and want to build a basic console application, this project is perfect for you. It covers:

- Taking user input
- Using `if` conditions
- Performing simple calculations
- Creating and using methods
- Formatting output

## What it Does

This program:

1. Asks the user to choose a **base currency** (the one you have).
2. Asks for a **target currency** (the one you want).
3. Takes the amount you want to convert.
4. Calculates the converted amount using a fixed exchange rate.
5. Shows the final converted value to the user.

## Supported Currencies

- USD (US Dollar)
- INR (Indian Rupee)
- EUR (Euro)

The exchange rates are **manually set** (not real-time).

##  How to Run

1. Make sure you have **Java installed** on your computer.
2. Copy the code into a file named `CurrencyConverter.java`.
3. Open your terminal or command prompt.
4. Navigate to the folder where the file is saved.
5. Run the following commands:

```
javac CurrencyConverter.java
java CurrencyConverter
```

## Example

```
Enter the base currency (USD, INR, EUR):
USD
Enter the currency you want to convert to (USD, INR, EUR):
INR
How much USD do you want to convert?
10
10.00 USD is equal to 830.00 INR
```

## Notes

- This is a basic project, great for learning.
- The exchange rates are hardcoded — they don't update automatically.
- You can improve this by connecting to a real currency exchange API in the future.

##  Future Ideas

- Add more currencies
- Fetch live exchange rates using an API
- Build a GUI (graphical interface)

Happy coding!
