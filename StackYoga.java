public class StackYoga<YP> {
    public YP[] Data;
    public int rumus = 0;

    public StackYoga(int a) {
        Data = (YP[]) new Object[a];
    }
    public boolean isEmpty() {
        return rumus == 0;
    }
    public boolean isFull() {
        return rumus == Data.length;
    }
    public void push(YP value) {
        if ( !isFull() ) {
            Data[rumus] = value;
            rumus = rumus + 1;
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public YP pop() {
        if ( !isEmpty() ) {
            rumus = rumus - 1;
            YP r = Data[rumus];
            return r;
        } else {
            return null;
        }
    }
    public YP peek() {
        if ( !isEmpty() ) {
            return Data[rumus - 1];
        } else {
            return null;
        }
    }
}