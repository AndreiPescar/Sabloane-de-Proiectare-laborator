public class main {
    public static void main(String[] args) {
        book discoTitanic = new book("DiscoTitanic");
        author rpGheo = new author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("SubCapitolul 1.1");
        subchapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);


        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");

        discoTitanic.print();
    }
}