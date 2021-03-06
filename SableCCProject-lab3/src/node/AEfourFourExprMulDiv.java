/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEfourFourExprMulDiv extends PExprMulDiv
{
    private PExprUnaryOprt _exprUnaryOprt_;

    public AEfourFourExprMulDiv()
    {
        // Constructor
    }

    public AEfourFourExprMulDiv(
        @SuppressWarnings("hiding") PExprUnaryOprt _exprUnaryOprt_)
    {
        // Constructor
        setExprUnaryOprt(_exprUnaryOprt_);

    }

    @Override
    public Object clone()
    {
        return new AEfourFourExprMulDiv(
            cloneNode(this._exprUnaryOprt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEfourFourExprMulDiv(this);
    }

    public PExprUnaryOprt getExprUnaryOprt()
    {
        return this._exprUnaryOprt_;
    }

    public void setExprUnaryOprt(PExprUnaryOprt node)
    {
        if(this._exprUnaryOprt_ != null)
        {
            this._exprUnaryOprt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprUnaryOprt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprUnaryOprt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprUnaryOprt_ == child)
        {
            this._exprUnaryOprt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprUnaryOprt_ == oldChild)
        {
            setExprUnaryOprt((PExprUnaryOprt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
