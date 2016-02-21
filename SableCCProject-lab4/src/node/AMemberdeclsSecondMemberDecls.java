/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMemberdeclsSecondMemberDecls extends PMemberDecls
{
    private PMember _member_;

    public AMemberdeclsSecondMemberDecls()
    {
        // Constructor
    }

    public AMemberdeclsSecondMemberDecls(
        @SuppressWarnings("hiding") PMember _member_)
    {
        // Constructor
        setMember(_member_);

    }

    @Override
    public Object clone()
    {
        return new AMemberdeclsSecondMemberDecls(
            cloneNode(this._member_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMemberdeclsSecondMemberDecls(this);
    }

    public PMember getMember()
    {
        return this._member_;
    }

    public void setMember(PMember node)
    {
        if(this._member_ != null)
        {
            this._member_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._member_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._member_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._member_ == child)
        {
            this._member_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._member_ == oldChild)
        {
            setMember((PMember) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
