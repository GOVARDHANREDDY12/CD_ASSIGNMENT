function reverse_words(sentence) {
    var words = sentence.split(" ");
    var reversed_words = words.map(function(word) {
        return word.split("").reverse().join("");
    });
    var reversed_sentence = reversed_words.join(" ");
    return reversed_sentence;
}

var input_sentence = "This is a sunny day";
var result = reverse_words(input_sentence);
console.log("The reversed sentence is: " + result);

