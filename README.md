# Java Comparison Guide

## 📌 Overview
This guide explains how Java handles object comparison, including:
- `String` comparisons with `==` and `.equals()`
- Integer caching and `Integer` comparison behavior
- Customizing the `equals()` method in user-defined classes

---

## 🔹 String Comparison in Java
### Example:
```java
String a = "salah";
String b = "salah";
System.out.println(a.equals(b)); // true
System.out.println(a == b);      // true
```
### Explanation:
- Java optimizes string storage using a **String Pool**.
- Since `"salah"` is a string literal, `a` and `b` point to the **same reference**.
- `.equals()` compares **contents** and returns `true`.
- `==` checks if both references point to the **same object**, which is true in this case.

#### ⚠️ Example Where `==` Returns `False`
```java
String a = new String("salah");
String b = new String("salah");
System.out.println(a == b);      // false (different objects)
System.out.println(a.equals(b)); // true (same content)
```
💡 Always use `.equals()` for **comparing string values** instead of `==`.

---

## 🔹 Integer Comparison and Caching
### Example:
```java
Integer x = 500;
Integer y = 500;
System.out.println(x == y); // false
System.out.println(x.equals(y)); // true
```
### Why does `==` return `false`?
- Java caches `Integer` values from **-128 to 127**.
- If an `Integer` is within this range, Java reuses the same object reference.
- `500` is **outside this cache**, so Java creates **two different objects**, making `x == y` return `false`.

#### ✅ Correct way to compare `Integer` values:
```java
System.out.println(x.equals(y)); // true (compares values, not references)
```
#### Example where `==` works due to caching:
```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b); // true (same reference due to caching)
```
💡 **Always use `.equals()` for object comparison instead of `==`.**

---

## 🔹 Custom `equals()` Method in Java
If you create your own class, override `equals()` for proper comparison:

### ✅ Example:
```java
public class Vehicule {
    private String fabriquant;
    private String modele;
    private int passagers;
    private int fuelcap;
    private int kmpl;

    public Vehicule(String fab, String mod, int pass, int fucp, int kmpl) {
        this.fabriquant = fab;
        this.modele = mod;
        this.passagers = pass;
        this.fuelcap = fucp;
        this.kmpl = kmpl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check

        Vehicule vehicule = (Vehicule) obj;
        return passagers == vehicule.passagers &&
               fuelcap == vehicule.fuelcap &&
               kmpl == vehicule.kmpl &&
               fabriquant.equals(vehicule.fabriquant) &&
               modele.equals(vehicule.modele);
    }
}
```

### Explanation:
1. **`this == obj`** → If both references are the same, return `true`.
2. **`obj == null || getClass() != obj.getClass()`** → If `obj` is `null` or not a `Vehicule`, return `false`.
3. **Cast `obj` to `Vehicule` and compare attributes.**

### ✅ Example Usage:
```java
Vehicule v1 = new Vehicule("BMW", "Z4", 2, 55, 8);
Vehicule v2 = new Vehicule("BMW", "Z4", 2, 55, 8);
System.out.println(v1.equals(v2)); // true (same values)
```

---

## 🔹 Conclusion
| Case | `==` Result | `.equals()` Result |
|------|------------|------------------|
| `String a = "text"; String b = "text";` | ✅ `true` (same ref) | ✅ `true` (same value) |
| `String a = new String("text");` | ❌ `false` (different ref) | ✅ `true` (same value) |
| `Integer x = 500; Integer y = 500;` | ❌ `false` (outside cache) | ✅ `true` (same value) |
| `Integer x = 100; Integer y = 100;` | ✅ `true` (within cache) | ✅ `true` (same value) |
| `Custom class without equals()` | ❌ `false` | ❌ `false` (default behavior) |
| `Custom class with equals()` | ❌ `false` | ✅ `true` (same attributes) |

📌 **Always use `.equals()` to compare object values in Java!** 🚀

