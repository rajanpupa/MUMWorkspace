/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEtwoFiveExprLogical extends PExprLogical
{
    private PExprLogical _ethreeOne_;
    private TEq _eq_;
    private PExprAddSub _ethreeTwo_;

    public AEtwoFiveExprLogical()
    {
        // Constructor
    }

    public AEtwoFiveExprLogical(
        @SuppressWarnings("hiding") PExprLogical _ethreeOne_,
        @SuppressWarnings("hiding") TEq _eq_,
        @SuppressWarnings("hiding") PExprAddSub _ethreeTwo_)
    {
        // Constructor
        setEthreeOne(_ethreeOne_);

        setEq(_eq_);

        setEthreeTwo(_ethreeTwo_);

    }

    @Override
    public Object clone()
    {
        return new AEtwoFiveExprLogical(
            cloneNode(this._ethreeOne_),
            cloneNode(this._eq_),
            cloneNode(this._ethreeTwo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEtwoFiveExprLogical(this);
    }

    public PExprLogical getEthreeOne()
    {
        return this._ethreeOne_;
    }

    public void setEthreeOne(PExprLogical node)
    {
        if(this._ethreeOne_ != null)
        {
            this._ethreeOne_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ethreeOne_ = node;
    }

    public TEq getEq()
    {
        return this._eq_;
    }

    public void setEq(TEq node)
    {
        if(this._eq_ != null)
        {
            this._eq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eq_ = node;
    }

    public PExprAddSub getEthreeTwo()
    {
        return this._ethreeTwo_;
    }

    public void setEthreeTwo(PExprAddSub node)
    {
        if(this._ethreeTwo_ != null)
        {
            this._ethreeTwo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ethreeTwo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ethreeOne_)
            + toString(this._eq_)
            + toString(this._ethreeTwo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ethreeOne_ == child)
        {
            this._ethreeOne_ = null;
            return;
        }

        if(this._eq_ == child)
        {
            this._eq_ = null;
            return;
        }

        if(this._ethreeTwo_ == child)
        {
            this._ethreeTwo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ethreeOne_ == oldChild)
        {
            setEthreeOne((PExprLogical) newChild);
            return;
        }

        if(this._eq_ == oldChild)
        {
            setEq((TEq) newChild);
            return;
        }

        if(this._ethreeTwo_ == oldChild)
        {
            setEthreeTwo((PExprAddSub) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
