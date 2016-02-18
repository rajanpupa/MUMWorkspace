/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TKstatic extends Token
{
    public TKstatic()
    {
        super.setText("static");
    }

    public TKstatic(int line, int pos)
    {
        super.setText("static");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKstatic(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKstatic(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKstatic text.");
    }
}
