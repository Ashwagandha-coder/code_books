interface MyList<E> {

    fun add(elem: E): Boolean

    fun remove(elem: E): Boolean

    fun getElem(index: E): E

    fun obtain(elem: E)


}