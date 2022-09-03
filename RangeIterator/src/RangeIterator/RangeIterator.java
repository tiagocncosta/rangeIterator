package RangeIterator;

import java.util.*;

public class RangeIterator implements Iterable {
    public final int min;
    public final int max;
    public int current;

    public RangeIterator(int min, int max)
    {
        this.min = Math.min(min, max);
        this.max = Math.max(min, max);

    }

    @Override
    public Iterator iterator() {
        this.current = this.min-1;
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return current < max;
            }

            @Override
            public Object next() {
                    current++;
                    return current;
            }
        };
    }
}