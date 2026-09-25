# Java Constructors — Interview Recall Guide

## 1. Constructor

A constructor is a special method used to initialize an object when it is created.

### Rules

- Same name as the class
- Has no return type, not even `void`
- Runs automatically when an object is created
- Can be overloaded

**Interview point:** A method with the same name as the class but with a return type is a normal method, not a constructor.

---

## 2. Default Constructor

A default constructor is a **no-argument constructor automatically provided by the compiler when you declare no constructor in the class**.

### Important

- Takes no parameters
- Compiler provides it
- Performs normal object initialization
- Fields receive their default values (`null`, `0`, `false`)

### Golden Rule ⭐

> **If you declare any constructor yourself, the compiler does not provide the default constructor.**

- No constructor declared → compiler provides default no-arg constructor
- At least one constructor declared → compiler does not provide the default constructor

If a no-arg constructor is still required after writing another constructor, you must declare it yourself.

### Default Constructor vs Explicit No-Arg Constructor

| Default Constructor | Explicit No-Arg Constructor |
| --- | --- |
| Created by the compiler | Written by the programmer |
| Exists only when no constructor is declared | Exists because you declared it |
| No custom initialization logic | Can assign meaningful starting values |

**Important:** Both have zero parameters, but they are not the same concept.

---

## 3. Parameterized Constructor

A constructor that accepts arguments so the object is initialized with specific values at creation time.

### Rules

- Parameters can be any number/type
- Can be combined with `this` to distinguish fields from parameters (Concept 4)
- Once you write ANY constructor, the compiler-provided default constructor disappears (ties back to the Golden Rule)

**Interview point:** *"You wrote a parameterized constructor. Can you still call `new ClassName()`?"* → No, unless you also explicitly write a no-arg constructor.

---

## 4. The `this` Keyword in Constructors

`this` refers to the current object instance. It resolves ambiguity when a parameter name is the same as a field name.

### Rules

- `this.field = parameter` → correct assignment
- `field = parameter` (without `this`, same names) → assigns the parameter to itself; the field keeps its default value
- `this` can also be used to chain constructors (see Concept 5)

**Interview trap:** *"What happens if `this` is omitted when the field and parameter share a name?"* → No compile error, but the field is never actually set — a silent logic bug, not a syntax one.

---

## 5. Constructor Overloading

Multiple constructors in the same class, differing by number/type/order of parameters.

### Rules

- Overloading is based on the parameter list, not on parameter names
- Constructors have no return type, so overloading can't be distinguished by return type (there isn't one)
- Java picks the matching constructor at compile time based on the arguments passed

**Interview trap:** *"Can two constructors differ only by parameter names, not types?"* → No — that's not overloading, and Java won't allow duplicate signatures like that.

---

## 6. Constructor Chaining with `this()`

One constructor calls another constructor in the *same* class, to avoid repeating initialization code.

### Rules

- `this(...)` must be the **first statement** in the constructor body
- A constructor cannot have both `this()` and `super()` — only one "first statement" is allowed
- Useful when overloaded constructors share common setup logic

### Golden Rule ⭐

> **`this()` must always be the first line of the constructor — no exceptions.**

**Interview trap:** *"What happens if you put a statement before `this()`?"* → Compile error.

---

## 7. Copy Constructor (User-Defined)

Java has **no built-in copy constructor** (unlike C++). You write one yourself: it takes an object of the same class and copies its field values into the new object.

### Rules

- Not a language feature — it's just a constructor you define with a matching-class parameter
- Produces an independent object for primitive/String fields
- For mutable object fields (e.g. arrays), a naive copy constructor only copies the *reference* — a shallow copy, not a deep one

**Interview trap:** *"Is a copy constructor guaranteed to make a deep copy?"* → No — only if you explicitly copy nested mutable objects field by field.

---

## 8. Constructors and Initialization Order

Java initializes members in a fixed sequence when an object is created.

### Order of Execution

1. Static blocks/fields (once, at class load — not per object)
2. Instance variable inline initializers (e.g. `int age = 5;`)
3. Instance initializer blocks (`{ ... }`)
4. Constructor body (runs last)

### Golden Rule ⭐

> **Whatever the constructor sets, wins — it always runs after inline initializers and init blocks.**

**Interview trap:** *"A field is set inline AND in the constructor — which value survives?"* → The constructor's value.

---

## 9. Constructors in Inheritance (`super()`)

A subclass constructor can — or sometimes must — call its parent's constructor using `super(...)`.

### Rules

- If you don't call `super(...)` explicitly, Java auto-inserts a no-arg `super()` as the first line
- If the parent has **no** no-arg constructor, and you don't call `super(args)` yourself → **compile error**
- `super()` must be the first statement in the constructor (same rule family as `this()`)

**Interview trap:** *"Parent class only has a parameterized constructor. Subclass constructor doesn't call `super(...)`. What happens?"* → Compile error — Java tries to insert `super()`, which doesn't exist on the parent.

---

## 10. Private Constructors

A constructor marked `private` so the class cannot be instantiated from outside — used for Singleton pattern or utility classes.

### Rules

- `new ClassName()` from another class → compile error (constructor not visible)
- A `static` method inside the class is the only way to get an instance
- Lazy initialization: instance created only on the first call to `getInstance()`, then reused

**Interview trap:** *"Is a simple lazy-initialized Singleton thread-safe?"* → No — two threads can both pass the `null` check at the same time and create two instances.

---

## 11. Common Interview Traps ⭐

- Does every class have a default constructor? → No, only when none is declared.
- Does Java provide a no-arg constructor after you write a parameterized one? → No.
- Can a constructor have `void` as its return type? → No — then it's a method.
- Can constructors be overloaded? → Yes.
- Can a constructor be inherited? → No.
- Can a constructor be overridden? → No (follows from: not inherited).
- Must `this()`/`super()` be the first line? → Yes, and only one of them can appear.

---

## 12. Must Remember

> **No constructor written → compiler provides a default no-arg constructor.**

> **Any constructor written → compiler stops providing the default constructor.**

> **Fields automatically get default values; local variables do not.**

> **Default constructor and explicit no-arg constructor are different concepts.**

> **Constructor = same class name + no return type + used during object creation.**

> **`this()` and `super()` must be the first statement, and only one can appear per constructor.**

> **Constructors are never inherited and never overridden.**

---

*Practice questions for each concept are worked through in the conversation — solve Q1/Q2 for each concept before moving to the next.*