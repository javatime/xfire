package org.codehaus.xfire.demo;

/**
 * @author <a href="mailto:dan@envoisolutions.com">Dan Diephouse</a>
 */
//START SNIPPET: book
public class BookService implements IBook
{
    private Book onlyBook;
    
    public BookService()
    {
        onlyBook = new Book();
        onlyBook.setAuthor("Dan Diephouse");
        onlyBook.setTitle("Using XFire");
        onlyBook.setIsbn("0123456789");
    }

    public Book[] getBooks()
    {
        return new Book[] { onlyBook };
    }
    
    public Book findBook(String isbn)
    {
        if (isbn.equals(onlyBook.getIsbn()))
            return onlyBook;
        
        return null;
    }
}
//END SNIPPET: book