# CLI Math Tool
This basic program performs basic mathematical operations with 2 numbers. Intended to be used in command line terminals such as Git Bash, PowerShell, or any Unix-based shell.
---

## How to use:
- Compile the program and run the program:
```bash
javac JCalc.java
java JCalc add|sub|mul|div num1 num2
```
- Example:
```bash
java JCalc add 5 10
```
---

## Program Exit Codes:
- 0: Executes successfully without error
- 1: Too many arguments provided
- 2: Not enough arguments were provided
- 3: User provided an invalid operation
- 4: User tried to divide by zero
- 5: User provided invalid operands
