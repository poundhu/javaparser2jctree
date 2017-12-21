package stave.java.ast;

import com.sun.tools.javac.code.TypeTag;
import com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree;

//import import com.sun.tools.javac.tree.JCTree;
//import com.sun.tools.javac.util.List;
//import com.sun.tools.javac.util.Name;
//import com.sun.tools.javac.code.Scope.ImportScope;
//import com.sun.tools.javac.code.BoundKind;

public class AJCPrimitiveTypeTree extends JCPrimitiveTypeTree implements JavaParserComments {

    public String comment;

    public AJCPrimitiveTypeTree(TypeTag typetag) {
        super(typetag);
    }

    public AJCPrimitiveTypeTree(JCPrimitiveTypeTree ltree) {
        super(ltree.typetag);
    }

    public AJCPrimitiveTypeTree(JCPrimitiveTypeTree ltree, String lcomment) {
        this(ltree);
        setComment(lcomment);
    }

    public boolean hasComment() {
        return comment != null;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String lcomment) {
        comment = lcomment;
    }
}

