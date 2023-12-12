package marketing;

interface ContentAdvertiser extends ContentMarketing, EmailMarketing {
    void createContentForEmail();
}