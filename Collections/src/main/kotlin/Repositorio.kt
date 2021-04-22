package one.digitalinnovation.collections



class Repositorio<T> {
    private val map= mutableMapOf<String,T>()

         fun create(id:String, value:T) {
             map[id]=value
         }

    fun findBy(id:String)=map[id]
    fun findAll()=map.values
    fun remover(id: String)=map.remove(id)

}