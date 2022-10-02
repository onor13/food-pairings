package onor.food.domain;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public boolean contains(T item1, T item2) {
        return (first.equals(item1) && second.equals(item2))
                || (first.equals(item2) && second.equals(item1));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair other = (Pair)obj;
        return (first.equals(other.first) && second.equals(other.second))
                || (first.equals(other.second) && second.equals(other.first));
    }
}
