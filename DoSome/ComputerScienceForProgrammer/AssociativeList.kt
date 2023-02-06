class AssociativeList<K,V>(): MyMap<K,V> {

    override fun put(key: K, value: V) {
        TODO("Not yet implemented")
    }

    override fun getElem() {
        TODO("Not yet implemented")
    }

    override fun remove(key: K) {
        TODO("Not yet implemented")
    }

    override fun obtain(key: K) {
        TODO("Not yet implemented")
    }
}



interface MyMap<K,V> {

    fun put(key: K, value: V)

    fun getElem()

    fun remove(key: K)

    fun obtain(key: K)

}