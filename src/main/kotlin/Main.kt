fun main(args: Array<String>) {
    for (arg in args) {
        println("$arg => ${Anagram().makeAnagrams(arg)}")
    }
}