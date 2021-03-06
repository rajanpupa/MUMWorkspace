/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AClassdeclFirstClassDecl extends PClassDecl
{
    private PClassHdr _classHdr_;
    private TLBrace _lBrace_;
    private TRBrace _rBrace_;

    public AClassdeclFirstClassDecl()
    {
        // Constructor
    }

    public AClassdeclFirstClassDecl(
        @SuppressWarnings("hiding") PClassHdr _classHdr_,
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setClassHdr(_classHdr_);

        setLBrace(_lBrace_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new AClassdeclFirstClassDecl(
            cloneNode(this._classHdr_),
            cloneNode(this._lBrace_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassdeclFirstClassDecl(this);
    }

    public PClassHdr getClassHdr()
    {
        return this._classHdr_;
    }

    public void setClassHdr(PClassHdr node)
    {
        if(this._classHdr_ != null)
        {
            this._classHdr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classHdr_ = node;
    }

    public TLBrace getLBrace()
    {
        return this._lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(this._lBrace_ != null)
        {
            this._lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrace_ = node;
    }

    public TRBrace getRBrace()
    {
        return this._rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(this._rBrace_ != null)
        {
            this._rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classHdr_)
            + toString(this._lBrace_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classHdr_ == child)
        {
            this._classHdr_ = null;
            return;
        }

        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._rBrace_ == child)
        {
            this._rBrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classHdr_ == oldChild)
        {
            setClassHdr((PClassHdr) newChild);
            return;
        }

        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
