// Sample array of strings representing numbers
var numbersAsString = ["5", "2", "8", "1", "6"];

// Sorting in descending order
numbersAsString.sort(function(a, b) {
    return Number(b) - Number(a);
});

// Output the sorted array
console.log(numbersAsString);
