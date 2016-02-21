/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEthreeTwoExprAddSub extends PExprAddSub
{
    private PExprAddSub _exprAddSub_;
    private TMinus _minus_;
    private PExprMulDiv _exprMulDiv_;

    public AEthreeTwoExprAddSub()
    {
        // Constructor
    }

    public AEthreeTwoExprAddSub(
        @SuppressWarnings("hiding") PExprAddSub _exprAddSub_,
        @SuppressWarnings("hiding") TMinus _minus_,
        @SuppressWarnings("hiding") PExprMulDiv _exprMulDiv_)
    {
        // Constructor
        setExprAddSub(_exprAddSub_);

        setMinus(_minus_);

        setExprMulDiv(_exprMulDiv_);

    }

    @Override
    public Object clone()
    {
        return new AEthreeTwoExprAddSub(
            cloneNode(this._exprAddSub_),
            cloneNode(this._minus_),
            cloneNode(this._exprMulDiv_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEthreeTwoExprAddSub(this);
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

    public TMinus getMinus()
    {
        return this._minus_;
    }

    public void setMinus(TMinus node)
    {
        if(this._minus_ != null)
        {
            this._minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minus_ = node;
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
            + toString(this._minus_)
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

        if(this._minus_ == child)
        {
            this._minus_ = null;
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

        if(this._minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
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
