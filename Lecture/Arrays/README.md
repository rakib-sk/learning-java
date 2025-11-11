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