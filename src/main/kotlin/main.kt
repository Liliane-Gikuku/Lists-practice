fun main(){
    var list=tenNames(listOf("Angel","Kalisa","Human","Anne","Tita","Zikamwa","Wuanita","Mathai","Wilson","Gikundiro"))
    println(list)

}

fun tenNames(name:List<String>):List<String>{
    var even=mutableListOf<String>()
   name.forEachIndexed{ index, item ->
        if(index%2 == 0){
            even.add(item)
            }


    }
return even
}