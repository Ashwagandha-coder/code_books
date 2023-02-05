class BinaryTree {

    private var root: Node? = null


    fun add(value: Int) {

        if (root == null) {
            root = Node(value)
        } else {
            var currentNode = root
            var parentNode: Node

            while (true) {
                parentNode = currentNode!!

                if (value == root?.getValue()) {
                    return
                } else if (value < root?.getValue()!!) {

                    currentNode = currentNode.isLeft()
                    if (currentNode == null) {

                        val node = Node(value)
                        parentNode.left(node)
                        return
                    }

                } else {

                    currentNode = currentNode.isRight()

                    if (currentNode == null) {

                        val node = Node(value)
                        parentNode.right(node)
                        return
                    }

                }


            }

        }

    }


    fun obtain(value: Int): Boolean {

        var current = root
        if (root?.getValue() == value) return true

        while (true) {

            if (current?.getValue() == value) return true

            if (value < current?.getValue()!!) {

                current = current.isLeft()
            } else {
                current = current.isRight()
            }

            if (current == null) return false

        }


    }

    override fun toString(): String {
        return "BinaryTree(root=$root)"
    }


    private class Node(
        private var value: Int = 0,
        private var left: Node? = null,
        private var right: Node? = null
    ) {

        fun left(node: Node) {
            this.left = node
        }

        fun right(node: Node) {
            this.right = node
        }

        fun value(value: Int) {
            this.value = value
        }

        fun getValue() = value


        fun isLeft() = left

        fun isRight() = right


        override fun toString(): String {
            return "Node(value=$value, left=$left, right=$right)"
        }


    }


}