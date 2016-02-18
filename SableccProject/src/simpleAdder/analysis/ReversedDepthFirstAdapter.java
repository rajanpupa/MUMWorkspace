/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import java.util.*;
import simpleAdder.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAProgram(node);
    }

    public void inAStatement(AStatement node)
    {
        defaultIn(node);
    }

    public void outAStatement(AStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatement(AStatement node)
    {
        inAStatement(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAStatement(node);
    }

    public void inAIntStatement(AIntStatement node)
    {
        defaultIn(node);
    }

    public void outAIntStatement(AIntStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntStatement(AIntStatement node)
    {
        inAIntStatement(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntStatement(node);
    }
}
