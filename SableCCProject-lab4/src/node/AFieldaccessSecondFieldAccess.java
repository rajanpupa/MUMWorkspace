/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFieldaccessSecondFieldAccess extends PFieldAccess
{
    private TId _idOne_;
    private TDot _dot_;
    private TId _idTwo_;

    public AFieldaccessSecondFieldAccess()
    {
        // Constructor
    }

    public AFieldaccessSecondFieldAccess(
        @SuppressWarnings("hiding") TId _idOne_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TId _idTwo_)
    {
        // Constructor
        setIdOne(_idOne_);

        setDot(_dot_);

        setIdTwo(_idTwo_);

    }

    @Override
    public Object clone()
    {
        return new AFieldaccessSecondFieldAccess(
            cloneNode(this._idOne_),
            cloneNode(this._dot_),
            cloneNode(this._idTwo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldaccessSecondFieldAccess(this);
    }

    public TId getIdOne()
    {
        return this._idOne_;
    }

    public void setIdOne(TId node)
    {
        if(this._idOne_ != null)
        {
            this._idOne_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idOne_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public TId getIdTwo()
    {
        return this._idTwo_;
    }

    public void setIdTwo(TId node)
    {
        if(this._idTwo_ != null)
        {
            this._idTwo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idTwo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._idOne_)
            + toString(this._dot_)
            + toString(this._idTwo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._idOne_ == child)
        {
            this._idOne_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._idTwo_ == child)
        {
            this._idTwo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._idOne_ == oldChild)
        {
            setIdOne((TId) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._idTwo_ == oldChild)
        {
            setIdTwo((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
