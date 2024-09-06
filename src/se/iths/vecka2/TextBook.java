package vecka2;

public class TextBook {
    private final String[] pages;
    private int pageCount;

    public TextBook() {
        pages = new String[10];
        pageCount = 0;
    }

    public TextBook(int pages) {
        if (pages > 0) {
            this.pages = new String[pages];
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addPage(String text) {
        this.pages[pageCount] = text;
        pageCount++;
    }

    public void getPage(int page){
        if (page < 0 || page >= pages.length - 1) {
            System.out.println("Invalid page number");
        } else {
            System.out.println(pages[page]);
        }
    }

    public String[] getPages(){
        return getPages(0, this.pages.length -1);
    }

    public String[] getPages(int page){
        return getPages(page, this.pages.length -1);
    }

    public String[] getPages(int page, int count){
        
        for ( int i = page; i <= count; i++) {}
        return pages;
    }

}
