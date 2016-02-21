/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEtwoOneExprLogical extends PExprLogical
{
    private PExprLogical _ethreeOne_;
    private TLt _lt_;
    private PExprAddSub _ethreeTwo_;

    public AEtwoOneExprLogical()
    {
        // Constructor
    }

    public AEtwoOneExprLogical(
        @SuppressWarnings("hiding") PExprLogical _ethreeOne_,
        @SuppressWarnings("hiding") TLt _lt_,
        @SuppressWarnings("hiding") PExprAddSub _ethreeTwo_)
    {
        // Constructor
        setEthreeOne(_ethreeOne_);

        setLt(_lt_);

        setEthreeTwo(_ethreeTwo_);

    }

    @Override
    public Object clone()
    {
        return new AEtwoOneExprLogical(
            cloneNode(this._ethreeOne_),
            cloneNode(this._lt_),
            cloneNode(this._ethreeTwo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEtwoOneExprLogical(this);
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

    public TLt getLt()
    {
        return this._lt_;
    }

    public void setLt(TLt node)
    {
        if(this._lt_ != null)
        {
            this._lt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lt_ = node;
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
            + toString(this._lt_)
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

        if(this._lt_ == child)
        {
            this._lt_ = null;
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

        if(this._lt_ == oldChild)
        {
            setLt((TLt) newChild);
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
