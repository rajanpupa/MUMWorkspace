/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TBreak extends Token
{
    public TBreak()
    {
        super.setText("break");
    }

    public TBreak(int line, int pos)
    {
        super.setText("break");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBreak(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBreak(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBreak text.");
    }
}
