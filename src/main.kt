fun main(){
    var v=indices(listOf("Juana","nancy","susan","esthe","bree","conso","akuot","kamau","grace","achieng"))
    println(v)
    var w=heightMetre(listOf(9,6,4,3))
    println(w)
    var j=person("jane",21,4.6,87)
    var q=person("grace",56,7.8,43)
    var n=person("mike",65,9.5,54)
    var e=person("kt",54,3.6,67)

    var namesOfperson= listOf(j,q,n,e)
    var descending=namesOfperson.sortedByDescending {person -> person.age  }
    println(descending)

    var u=person("dad",79,4.4,67)
    var f=person("mum",34,6.4,42)
    var newList= mutableListOf(u,f)
    println(newList.plus(namesOfperson))

    var prado=Cars("kbc04",34)
    var subaru=Cars("KBM645",23)
    var toyota=Cars("KBL534",21)
    var ubah=Cars("KBC476",31)
    var mycars= listOf(prado,subaru,toyota,ubah)
    println(Car(mycars))




}
fun indices(name:List<String>):List<String>{
var names= mutableListOf<String>()
    name.forEachIndexed { index, s ->
        if (index%2==0){
            names.add(s)
        }

    }
    return  names

}
fun heightMetre(height:List<Int>):String{
    var e = height.sum()
    var n=height.average()
    var total= "$e, $n"
    return total
}
data class person(var name:String,var age:Int,var height:Double,var weight:Int){

}
fun  people(twopeople:List<Any>):List<Any>{
    return listOf()

}
fun Car(gar:List<Cars>):Int {
    var r=0
    gar.forEach { l -> l.mileage
        r+=l.mileage
    }
    var g=r/gar.count()
    return g


    }
data class Cars(var registraction:String, var mileage:Int)

















//given a list of people's height in metres.write a function that returns the average height and the total height.


//given a list of 10 string, write a function that returns a list of the strings at even indices ie index 2,4,6
//3) Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
//
//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)