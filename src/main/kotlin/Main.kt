import scala.collection.immutable.List.empty as emptyScalaList

fun main() {
    for (element in Container(emptyScalaList())) {
        println(element)
    }
}
