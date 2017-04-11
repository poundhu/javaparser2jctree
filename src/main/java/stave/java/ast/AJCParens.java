package stave.java.ast;

import com.sun.tools.javac.tree.JCTree.JCParens;
//import import com.sun.tools.javac.tree.JCTree;
//import com.sun.tools.javac.util.List;
//import com.sun.tools.javac.util.Name;
//import com.sun.tools.javac.code.Symbol;
//import com.sun.tools.javac.code.Scope.ImportScope;
//import com.sun.tools.javac.code.BoundKind;

public class AJCParens extends JCParens implements JavaParserComments {

    public String comment;

    public AJCParens(JCExpression expr) {
        super(expr);
    }

    public AJCParens(JCParens ltree) {
        super(ltree.expr);
    }

    public AJCParens(JCParens ltree, String lcomment) {
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

