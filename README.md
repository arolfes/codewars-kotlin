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

### EnoughIsEnough
```kotlin
// returns result of compare counts.value for given key with maxOccurences
// inside it increases the value for given key 
fun countFilter(x: Int) = counts.compute(x, { _, count -> count?.plus(1) ?: 1 })!! <= maxOcurrences
```

### Mumbling

`string.mapIndexed` converts a string into a char list with index, do what you want on char
`char.toString().toLowerCase().repeat(index)` when index is 0 then it return `""` :-)

```kotlin
// this would be like
"Hello".mapIndexed { index, char -> char.toUpperCase() + char.toString().toLowerCase().repeat(index) }
/*
resultList[0] = "H"
resultList[1] = "Ee"
resultList[2] = "Lll"
resultList[3] = "Llll"
resultList[4] = "Ooooo"
*/
``` 