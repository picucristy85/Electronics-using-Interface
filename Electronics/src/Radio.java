public class Radio implements Startable, Stopable, Changeable{
    String currentPost;

    public Radio(String currentPost) {
        this.currentPost = currentPost;
    }



    @Override
    public void start() {
        System.out.println("Am pornit radioul...");
    }

    @Override
    public void stop() {
        System.out.println("Am oprit radioul...");
    }

    @Override
    public void changePost(String newPost) {
        System.out.println("Am schimbat postul de radio de pe "+currentPost+" pe "+newPost);
        currentPost=newPost;
    }
}
