---
title: "Java Practice Problems"
output: github_document
---

# Java Practice Problems

This repository contains Java programs that solve basic programming exercises.  
The problems are divided into **Assisted Problems** (guided examples) and **Self Problems** (practice exercises).  
Each problem is implemented as a **separate Java file** for better readability and testing.

## 📂 Project Structure

```
JavaPracticeProblems/
│
├── Assisted Problems/
│   ├── Welcome.java
│   ├── AddTwoNumbers.java
│   ├── CelsiusToFahrenheit.java
│   ├── AreaOfCircle.java
│   └── VolumeOfCylinder.java
│
├── Self Problems/
│   ├── SimpleInterest.java
│   ├── PerimeterOfRectangle.java
│   ├── PowerCalculation.java
│   ├── AverageOfThreeNumbers.java
│   └── KmToMiles.java
│
└── README.rmd
```

## 💻 Problems Overview

### Assisted Problems
1. **Welcome to Bridgelabz!**  
   Prints `"Welcome to Bridgelabz!"` to the console.

2. **Add Two Numbers**  
   Takes two numbers from the user and prints their sum.

3. **Celsius to Fahrenheit Conversion**  
   Converts temperature from Celsius to Fahrenheit using:  
   `Fahrenheit = (Celsius * 9/5) + 32`

4. **Area of a Circle**  
   Calculates area:  
   `Area = π * radius²`

5. **Volume of a Cylinder**  
   Calculates volume:  
   `Volume = π * radius² * height`

### Self Problems
1. **Calculate Simple Interest**  
   Formula: `(Principal * Rate * Time) / 100`

2. **Perimeter of a Rectangle**  
   Formula: `2 * (length + width)`

3. **Power Calculation**  
   Calculates `base^exponent` using `Math.pow()`.

4. **Average of Three Numbers**  
   Finds the average of three input numbers.

5. **Convert Kilometers to Miles**  
   Formula: `Miles = Kilometers * 0.621371`

## ⚙️ How to Run

### 1. Compile the Java File
Navigate to the folder where your `.java` file is stored and run:
```sh
javac FileName.java
```

### 2. Run the Compiled Program
```sh
java FileName
```

**Example:**
```sh
javac AddTwoNumbers.java
java AddTwoNumbers
```

## 🛠 Requirements
- **Java JDK 8+**  
- Any IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java extension  
- Terminal/Command Prompt for running programs

## 📚 Learning Goals
- Basic Java syntax  
- User input handling with `Scanner`  
- Arithmetic operations and formulas  
- Using Java's `Math` library functions  
- Writing modular, single-purpose programs

## 🚀 Next Steps
- Combine all problems into **one menu-driven application**  
- Add **unit tests** for automated checking  
- Refactor into **object-oriented** versions
