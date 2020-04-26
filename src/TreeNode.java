public class TreeNode< E extends Comparable<E>>  {

    class Node<E>{
        public Node<E> right;
        public Node<E> left;
        public E data;
        public Node(E data){
            this.data=data;
        }
    }
    private int size=0;
    private Node<E> root;
    public boolean add(E data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node<E> current = root;
            Node<E> parent = null;
            while (current != null) {
                if (data.compareTo(current.data)<0 ) {
                    parent = current;
                    current = current.left;
                } else if (data.compareTo(current.data)>0 ) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (data.compareTo(parent.data)<0) {
                parent.left = new Node(data);

            } else if (data.compareTo(parent.data)>0) {
                parent.right = new Node(data);
            }
        }
        size++;
        return  true;
    }

    public boolean search(E e){
        Node<E> current= root;
        if (current==null){
            return false;
        }else {
            while(current!=null){
                if(current.data.compareTo(e)<0){
                    current=current.left;
                }
                else if (current.data.compareTo(e)>0){
                    current=current.right;
                }
                else return false;
            }
        }
        return true;
    }

}
