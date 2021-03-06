/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMemberSecondMember extends PMember
{
    private PMethod _method_;

    public AMemberSecondMember()
    {
        // Constructor
    }

    public AMemberSecondMember(
        @SuppressWarnings("hiding") PMethod _method_)
    {
        // Constructor
        setMethod(_method_);

    }

    @Override
    public Object clone()
    {
        return new AMemberSecondMember(
            cloneNode(this._method_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMemberSecondMember(this);
    }

    public PMethod getMethod()
    {
        return this._method_;
    }

    public void setMethod(PMethod node)
    {
        if(this._method_ != null)
        {
            this._method_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._method_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._method_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._method_ == child)
        {
            this._method_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._method_ == oldChild)
        {
            setMethod((PMethod) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
