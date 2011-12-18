/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library.business;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import library.domain.Book;
/**
 *
 * @author trentonknight
 */
public class BookSort {
        List<String> list = new ArrayList<String>();

 public void sortBooks(Book book)  {
        Collections.sort(list);
    }
}
