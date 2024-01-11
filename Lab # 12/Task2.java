class BST{
    char root;
    BST left, right;
    int size;
    
    BST(char d){
        root=d;
        left=right=null;
    }

    boolean isEmpty(){
        if(this==null){
            return true;
        }
        else{
            return false;
        }
    }


    public void addNodeR(BST node,char data){
        if(isEmpty()){
           node.root = data;
        }
        else{
            if((int)data<(int)node.root){
                if(node.left!=null){
                    addNodeR(node.left, data);
                }
                else{
                    node.left=new BST(data);
                }
            }
            else{
                if(node.right!=null){
                    addNodeR(node.right, data);
                }
                else{
                    node.right=new BST(data);
                }
            }
        }
        size++;
    }

    public void preOrderTraverse(BST node){
        if(node==null)
            return;
        else{
            System.out.print(" "+node.root);
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
    }

    public void postOrderTraverse(BST node){
        if(node==null)
            return;
        else{
            postOrderTraverse(node.left);
            postOrderTraverse(node.right);
            System.out.print(" "+node.root);
        }
    }

    public void inOrderTraverse(BST node){
        if(node==null)
            return;
        else{
            inOrderTraverse(node.left);
            System.out.print(" "+node.root);
            inOrderTraverse(node.right);
        }
    }
}

class Task2{
    public static void main(String[] args) {
        char[] a={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
        BST Root=new BST(a[0]);
        for(int i=1;i<a.length;i++){
            Root.addNodeR(Root,a[i]);
        }
        System.out.print("Inorder: ");
        Root.inOrderTraverse(Root);
        System.out.print("\nPreorder: ");
        Root.preOrderTraverse(Root);
        System.out.print("\nPostorder: ");
        Root.postOrderTraverse(Root);
    }
}