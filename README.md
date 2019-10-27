# codewars-kotlin
simple maven project for codewars katas, see https://www.codewars.com/

## Notes

some notes for myself

### LeapYear

`When{}` block is essentially an advanced form of the switch-case statement

`When{}` as an Expression with Default Case

```kotlin
return when {
    year % 400 == 0 -> true
    year % 100 == 0 -> false
    else -> year % 4 == 0
}
```

### VowelCount

```kotlin
// count splits the string into chars
// then check only if the char is contained in base string
// sum is done by count 
str.count{x->"aeiou".contains(x)}
```
