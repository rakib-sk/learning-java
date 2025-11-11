# learning-java 
# ☕ Basic Java Concepts

এই README.md-তে আমরা **Java এর বেসিক কনসেপ্টগুলো** স্টেপ-বাই-স্টেপ দেখব।  
এটি নতুনদের জন্য একদম সহজ এবং প্র্যাকটিক্যাল।  

---

## Variables & Data Types

**Variables** → ডাটা সংরক্ষণের জন্য ব্যবহার হয়।  
```java
int age = 20;
double price = 99.99;
String name = "Rakib";
boolean isJavaFun = true;
```

**Common Data Types:**
- `int` → পূর্ণসংখ্যা  
- `double` → দশমিক সংখ্যা  
- `char` → একটি character  
- `String` → text  
- `boolean` → true/false  

---

##  Input in Java

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = sc.nextLine();

System.out.print("Enter your age: ");
int age = sc.nextInt();
```

> `Scanner` ব্যবহার করে ব্যবহারকারীর ইনপুট নেওয়া যায়।  

---

##  Operators

- **Arithmetic Operators:** `+ - * / %`  
- **Comparison Operators:** `== != > < >= <=`  
- **Logical Operators:** `&& || !`  

```java
int a = 10, b = 5;
System.out.println(a + b); // 15
System.out.println(a > b); // true
System.out.println(a < b && b > 0); // true
```

---

## Conditional Statements (if-else)

```java
int marks = 75;

if (marks >= 80) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

> Conditions ব্যবহার করে বিভিন্ন অবস্থার উপর ভিত্তি করে কোড execute করা যায়।  

---

##  Switch Statement

```java
int day = 3;

switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Other Day");
}
```

> Multiple conditions handle করার জন্য switch ব্যবহার করা হয়।  

---

##  Loops

### a) For Loop
```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### b) While Loop
```java
int i = 1;
while(i <= 5) {
    System.out.println(i);
    i++;
}
```

### c) Do-While Loop
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while(i <= 5);
```

> Loops ব্যবহার করে একই কাজ repeated করা যায়।  

---

# 🛠 Functions & Methods

**Function** → ফাংশন হচ্ছে একটি **block of code**, যা কিছু **input** নেয়, তার উপর কিছু **operation** করে, এবং তারপর কিছু **output** দেয়।  

---

## 📌 Java Function Syntax

```java
returnType FunctionName(type arg1, type arg2, ...) {
    // operation
}
```

---

### returnType
- `returnType` → যে ধরনের ডাটা return হবে তার টাইপ।  
- উদাহরণ: `int`, `double`, `String` ইত্যাদি।  
- **Note:** যদি `returnType` হিসেবে `void` লেখা হয়, তাহলে ওই ফাংশন কোন কিছু return করে না।  

---

###  Function Memory Allocation
**Question:** Function তৈরি করলে মেমোরিতে কী হয়?  

- Function **stack এর মতো** মেমোরিতে তৈরি হয়।  
- প্রতিটি function call হলে তার জন্য stack frame তৈরি হয়।  

---

> এইভাবে ফাংশন তৈরি এবং ব্যবহার করলে কোড modular, clean, এবং পুনঃব্যবহারযোগ্য হয়। ✅
>
> 
# 📚 Arrays

**Arrays** → হচ্ছে **list of items**, যা একই ধরনের ডাটাকে একটি single structure-এ ধরে রাখতে সাহায্য করে।  

---

## 📌 Defining an Array (Method 1)

```java
type[] arrayName = new type[size];
```

### Explanation:

- `type[]` → এখানে Array-এর type বলতে হয় (যেমন `int`, `double`, `String`)  
- `arrayName` → Array-এর নাম, যেকোনো বৈধ variable name হতে পারে  
- `new` → মেমোরিতে নতুন জায়গা তৈরি করার জন্য ব্যবহৃত হয়  
- `type[size]` → এখানে Array-এর size উল্লেখ করতে হয়  

### Example:

```java
int[] numbers = new int[3];
numbers[0] = 20;
numbers[1] = 30;
numbers[2] = 50;
```

> **Note:** Array index 0 থেকে শুরু হয়। তাই `numbers[3]` ব্যবহার করলে **ArrayIndexOutOfBoundsException** হবে।  

---

## 📌 Defining an Array (Method 2)

```java
type[] arrayName = {value1, value2, value3, ...};
```

### Example:

```java
int[] numbers = {20, 30, 50};
```

> এই পদ্ধতিতে size অটো সেট হয়ে যায় এবং values সরাসরি assign করা যায়।
