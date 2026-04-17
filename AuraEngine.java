public class AuraEngine {
    private final int maxDepth;
    private final int squares = 64;

    public AuraEngine(int maxDepth) {
        this.maxDepth = maxDepth;
    }
    public int getDepth() {
        return maxDepth;
    }
}
