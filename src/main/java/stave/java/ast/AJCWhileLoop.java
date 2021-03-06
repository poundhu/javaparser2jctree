package stave.java.ast;

import com.sun.tools.javac.tree.JCTree.JCWhileLoop;
//import import com.sun.tools.javac.tree.JCTree;
//import com.sun.tools.javac.util.List;
//import com.sun.tools.javac.util.Name;
//import com.sun.tools.javac.code.Symbol;
//import com.sun.tools.javac.code.Scope.ImportScope;
//import com.sun.tools.javac.code.BoundKind;

public class AJCWhileLoop extends JCWhileLoop implements JavaParserComments {

    public String comment;

    public AJCWhileLoop(JCExpression cond, JCStatement body) {
        super(cond, body);
    }

    public AJCWhileLoop(JCWhileLoop ltree) {
        super(ltree.cond, ltree.body);
    }

    public AJCWhileLoop(JCWhileLoop ltree, String lcomment) {
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

