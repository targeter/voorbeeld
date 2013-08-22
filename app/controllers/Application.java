package controllers;

import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import models.Book;
import play.mvc.Controller;
import play.mvc.Result;

import static com.google.common.base.Predicates.equalTo;
import static models.Book.BOOK_TO_ISBN;

public class Application extends Controller {

    public static Result index() {
        return redirect(routes.Application.list());
    }

    public static Result list() {
        final String joined = Joiner.on(",\n").join(Book.LIBRARY);
        return ok(joined);
    }

    public static Result details(String isbn) {
        final Book book = Iterables.find(Book.LIBRARY, Predicates.compose(equalTo(isbn), BOOK_TO_ISBN));
        return ok(book.toString());

    }



}
