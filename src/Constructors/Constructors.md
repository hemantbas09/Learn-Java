# Java Constructors —

## 1. Constructor

A constructor is a special method used to initialize an object when it is created.

### Rules

* Same name as the class
* Has no return type, not even `void`
* Runs automatically when an object is created
* Can be overloaded

**Interview point:** A method with the same name as the class but with a return type is a normal method, not a constructor.

---

## 2. Default Constructor

A default constructor is a **no-argument constructor automatically provided by the compiler when you declare no constructor in the class**.

### Important

* Takes no parameters
* Compiler provides it
* It performs normal object initialization
* Fields receive their normal default values

---

## 3. Golden Rule ⭐

> **If you declare any constructor yourself, the compiler does not provide the default constructor.**

Therefore:

* No constructor declared → compiler provides default no-arg constructor
* At least one constructor declared → compiler does not provide the default constructor

If a no-argument constructor is still required, you must declare it yourself.

---

## 4. Default Constructor vs Explicit No-Arg Constructor

### Default Constructor

* Created by the compiler
* Exists only when no constructor is declared
* No custom initialization logic

### Explicit No-Arg Constructor

* Written by the programmer
* Exists because you explicitly declare it
* Can contain initialization logic and assign meaningful starting values

**Important:** Both have zero parameters, but they are not the same concept.

---

## 9. Common Interview Traps ⭐

**Does every class have a default constructor?**
No. Only when no constructor is declared.

**Does Java provide a no-arg constructor after I write a parameterized constructor?**
No.

**Can a constructor have `void` as its return type?**
No. Then it becomes a method.

**Can constructors be overloaded?**
Yes.

**Can a constructor be inherited?**
No. Constructors are not inherited.

**Can a constructor be overridden?**
No. Constructors are not inherited, so they cannot be overridden.

---

## 10. Must Remember

> **No constructor written → compiler provides a default no-arg constructor.**

> **Any constructor written → compiler stops providing the default constructor.**

> **Fields automatically get default values; local variables do not.**

> **Default constructor and explicit no-arg constructor are different concepts.**

> **Constructor = same class name + no return type + used during object creation.**
