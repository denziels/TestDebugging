import java.util.ArrayList;

public class SalesItem {
    private String name;
    private int price;
    private ArrayList<Comment> comments;

    public SalesItem(String name, int price) {
        this.name = name;
        this.price = price;
        comments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean addComment(String author, String text, int rating) {
        if (rating < 0 || rating > 5) {
            return false;
        }
        comments.add(new Comment(author, text, rating));
        return true;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }
}
