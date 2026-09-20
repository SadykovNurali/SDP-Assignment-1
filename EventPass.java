
public interface EventPass {
    void printDetails();
}

class ConcertPass implements EventPass {
    private String ownerName;

    public ConcertPass(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void printDetails() {
        System.out.println("Pass for: " + ownerName);
    }
}

class ConferenceBadge implements EventPass {
    private String ownerName;

    public ConferenceBadge(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void printDetails() {
        System.out.println("Conference participant: " + ownerName);
    }
}