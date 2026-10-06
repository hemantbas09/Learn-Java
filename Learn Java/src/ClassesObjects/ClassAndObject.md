# Classes & Objects — OOP Concepts

## 1. What is a Class?
A **class** is a template/blueprint. It defines:
- **what data** a thing has (fields)
- **what it can do** (methods)

A class itself holds **no data** — it's just the definition.

## 2. What is an Object?
An **object** is a concrete instance created from a class.
- It occupies memory.
- It holds **real values** in its fields (its *state*).
- One class can produce any number of objects.
- Every object of the same class has the **same structure**, but **different values**.

## 3. Anatomy of a Class
| Member | Purpose |
|---|---|
| **Field** | Stores the object's state (data). |
| **Constructor** | Special method that runs automatically when an object is created; sets up initial state. |
| **Method** | Defines behavior; reads or changes fields. |

## 4. Creating an Object (Instantiation)
`new` is the keyword that:
1. allocates memory for a fresh object,
2. runs the constructor,
3. returns a **reference** (address) to that object.

A variable of a class type holds a **reference to an object**, not the object itself.

## 5. Object Identity vs State
- **Identity** = *which* object it is (its place in memory). Two `new` calls → two distinct objects even if their values look identical.
- **State** = *what* values its fields currently hold.

## 6. Two References, One Object
Assigning one reference variable to another **copies the address**, not the data:
- both variables point to the **same** object,
- changing state through one is visible through the other,
- only `new` creates a second object.

## 7. `this`
- Refers to the **current object** the method/constructor is running on.
- Needed when a field name and a parameter name collide.
- Also useful to pass the current object to another method.

## 8. Instance vs `static` Members
| | Instance | `static` |
|---|---|---|
| Belongs to | each object | the class itself |
| Copies | one per object | one for the whole class |
| Access via | object reference | class name (typical) |
| Exists when | object is created | program loads the class |

- `static` fields = shared data (e.g. a counter shared by all objects).
- `static` methods can't use `this` or instance fields directly — they don't have an object to run on.

## 9. `final`
- `final` **field** → can be assigned **only once** (usually in the constructor) → immutable state.
- `final` **method** → cannot be overridden by a subclass.
- `final` **parameter** → the reference can't be reassigned (the object's state may still change, unless it's also immutable).

## 10. `private` and Encapsulation
- `private` members are invisible outside the class.
- The class decides **how** its data can be read or changed (usually through methods).
- Why: protects internal state from being put into invalid conditions; internal implementation can change without breaking outside code.
- Principle: **state is owned by the class; behavior is exposed.**

## 11. Passing & Returning Objects
- Parameters of class types pass the **reference** — the method works on the same object.
- A method can return an **existing** object, or a **newly created** one.
- Returning a *new* object without modifying the receiver is a common way to keep original objects unchanged (immutability pattern).

## 12. Composition — Objects Containing Objects
- A field can itself be an object of another (or the same) class.
- "Has-a" relationship: a class **owns** another object and typically delegates work to it.
- This is how complex things are built from simpler ones.

## 13. Object Lifecycle
1. **Creation** — `new` + constructor → state initialized.
2. **Use** — methods read/change state.
3. **Death** — when no reference points to the object anymore, the garbage collector reclaims its memory. (You never free memory manually in Java.)

## 14. Key Takeaways
- Class = definition, Object = real thing.
- Fields = state, methods = behavior, constructor = setup.
- Variables hold **references**, not objects.
- `static` = class-level, `final` = set-once, `private` = hidden.
- Objects can be passed, returned, contained, and reused.
```