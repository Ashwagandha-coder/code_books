class OneLinkList<T>() : MyList<T> {

    var head: Node<T>? = null
    private var tail: Node<T>? = null
    var test: Node<T>? = null
    private var size = 0


    override fun add(elem: T): Boolean {

        if (head == null) {
            head = Node<T>(elem = elem)
            test = head
            size++
            return true
        } else if (head?.next == null) {

            val current = Node<T>(elem = elem)
            head?.next = current
            tail = current
            test = current

            size++
            return true
        }

        var preLast = tail
        var newNode = Node<T>(elem = elem)
        tail = newNode
        preLast?.next = newNode
        size++

        return true

    }

    private fun linkage(preSaveNode: Node<T>?, postSaveNode: Node<T>?): Boolean {

        var current = head

        while (current?.next != null)
            current = current.next

        current?.next = postSaveNode
        return true


    }



    override fun remove(elem: T): Boolean {

        var save: Node<T>?
        var bufferNode: Node<T>? = null

        if (head?.elem == elem) {
            //linkage(head?.next)
            return true
        }

        var current = head?.next

        while (current?.elem != elem) {
            bufferNode = current?.node()
            current = current?.next
        }

        println(bufferNode?.elem)
        bufferNode?.next = current?.next
        current?.next = null
        current = null
        return true

    }



    override fun getElem(elem: T) {

    }

    override fun obtain(elem: T) {

    }


    inner class Node<T>(
        var next: Node<T>? = null,
        var elem: T? = null,
    ) {

        fun node() = this

        override fun toString(): String {
            return "Node(next=$next, elem=$elem)"
        }
    }


}