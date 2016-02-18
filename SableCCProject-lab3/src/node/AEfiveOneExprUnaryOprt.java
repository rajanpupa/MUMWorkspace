/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEfiveOneExprUnaryOprt extends PExprUnaryOprt
{
    private TExclMark _exclMark_;
    private PExprUnaryOprt _exprUnaryOprt_;

    public AEfiveOneExprUnaryOprt()
    {
        // Constructor
    }

    public AEfiveOneExprUnaryOprt(
        @SuppressWarnings("hiding") TExclMark _exclMark_,
        @SuppressWarnings("hiding") PExprUnaryOprt _exprUnaryOprt_)
    {
        // Constructor
        setExclMark(_exclMark_);

        setExprUnaryOprt(_exprUnaryOprt_);

    }

    @Override
    public Object clone()
    {
        return new AEfiveOneExprUnaryOprt(
            cloneNode(this._exclMark_),
            cloneNode(this._exprUnaryOprt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEfiveOneExprUnaryOprt(this);
    }

    public TExclMark getExclMark()
    {
        return this._exclMark_;
    }

    public void setExclMark(TExclMark node)
    {
        if(this._exclMark_ != null)
        {
            this._exclMark_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exclMark_ = node;
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
            + toString(this._exclMark_)
            + toString(this._exprUnaryOprt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exclMark_ == child)
        {
            this._exclMark_ = null;
            return;
        }

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
        if(this._exclMark_ == oldChild)
        {
            setExclMark((TExclMark) newChild);
            return;
        }

        if(this._exprUnaryOprt_ == oldChild)
        {
            setExprUnaryOprt((PExprUnaryOprt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}