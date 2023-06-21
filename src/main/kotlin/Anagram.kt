import java.util.regex.Pattern

class Anagram {
    fun makeAnagrams(inputSentence: String): String {
        val wordDelimiterRegexp = "(?=[\\n\\r\\t\\u0020])"
        val inputWords: List<String> = inputSentence.split(Pattern.compile(wordDelimiterRegexp), 0)
        val outputWords: Array<String> = Array(inputWords.size){""}

        for (i in inputWords.indices) {
            outputWords[i] = reverseWord(inputWords[i]).toString()
        }
        return outputWords.joinToString("")
    }

    private fun reverseWord(word: String): StringBuilder {
        val reverseWord: StringBuilder = StringBuilder()
        var endIndex = word.length - 1
        var startIndex = 0

        while (startIndex < word.length) {
            if (Character.isLetter(word[startIndex])) {
                while (!Character.isLetter(word[endIndex])) {
                    endIndex--
                }
                reverseWord.append(word[endIndex--])
            } else {
                reverseWord.append(word[startIndex])
            }
            startIndex++
        }
        return reverseWord
    }
}