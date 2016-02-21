/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEthreeOneExprAddSub extends PExprAddSub
{
    private PExprAddSub _exprAddSub_;
    private TPlus _plus_;
    private PExprMulDiv _exprMulDiv_;

    public AEthreeOneExprAddSub()
    {
        // Constructor
    }

    public AEthreeOneExprAddSub(
        @SuppressWarnings("hiding") PExprAddSub _exprAddSub_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PExprMulDiv _exprMulDiv_)
    {
        // Constructor
        setExprAddSub(_exprAddSub_);

        setPlus(_plus_);

        setExprMulDiv(_exprMulDiv_);

    }

    @Override
    public Object clone()
    {
        return new AEthreeOneExprAddSub(
            cloneNode(this._exprAddSub_),
            cloneNode(this._plus_),
            cloneNode(this._exprMulDiv_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEthreeOneExprAddSub(this);
    }

    public PExprAddSub getExprAddSub()
    {
        return this._exprAddSub_;
    }

    public void setExprAddSub(PExprAddSub node)
    {
        if(this._exprAddSub_ != null)
        {
            this._exprAddSub_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprAddSub_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public PExprMulDiv getExprMulDiv()
    {
        return this._exprMulDiv_;
    }

    public void setExprMulDiv(PExprMulDiv node)
    {
        if(this._exprMulDiv_ != null)
        {
            this._exprMulDiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprMulDiv_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprAddSub_)
            + toString(this._plus_)
            + toString(this._exprMulDiv_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprAddSub_ == child)
        {
            this._exprAddSub_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._exprMulDiv_ == child)
        {
            this._exprMulDiv_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprAddSub_ == oldChild)
        {
            setExprAddSub((PExprAddSub) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._exprMulDiv_ == oldChild)
        {
            setExprMulDiv((PExprMulDiv) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}