public class Fibonacci {
    private int[] sequence;

    public Fibonacci(int seqLen)
    {
        sequence = new int[seqLen];
        sequence[0] = 0;
        sequence[1] = 1;
        for (int i = 2; i < seqLen; i++)
        {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
    }

    public int[] getSequence()
    {
        return sequence;
    }

    public int getIndexOf(int searchVal)
    {
        for (int i = 0; i < sequence.length; i++)
        {
            if (sequence[i] == searchVal) return i;
        }
        return -1;
    }

    public void extendBy(int howManyMore)
    {
        int[] newSeq = new int[sequence.length + howManyMore];
        for (int i = 0; i < newSeq.length; i++)
        {
            if (i < sequence.length) newSeq[i] = sequence[i];
            else newSeq[i] = newSeq[i - 1] + newSeq[i - 2];
        }
        sequence = newSeq;
    }
}
