package com.creation.anindya.espressotestingbyanindya;

import android.test.ActivityInstrumentationTestCase2;

import com.creation.anindya.espressotestingbyanindya.activities.CustomListActivity;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.creation.anindya.espressotestingbyanindya.matchers.CustomMatchers.withBookAuthor;
import static com.creation.anindya.espressotestingbyanindya.matchers.CustomMatchers.withBookId;
import static com.creation.anindya.espressotestingbyanindya.matchers.CustomMatchers.withBookTitle;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anything;



public class CustomListTest extends ActivityInstrumentationTestCase2<CustomListActivity> {

    private static final String BOOK_TITLE = "Java Concurrency in Practice";
    private static final String BOOK_AUTHOR = "Brian Goetz";

    public CustomListTest() {
        super(CustomListActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testOpenBookById() {
        // Click on the Book with ID 5
        onData(withBookId(5)).perform(click());

        // Check the correct book title is displayed
        onView(withId(R.id.book_title)).check(matches(withText(BOOK_TITLE)));

        // Check the correct author is displayed
        onView(withId(R.id.book_author)).check(matches(withText(BOOK_AUTHOR)));
    }

    public void testOpenBookByTitleAndAuthor() {
        // Match a book with a specific title and author name
        onData(allOf(withBookTitle(BOOK_TITLE), withBookAuthor(BOOK_AUTHOR))).perform(click());

        // Check the correct book title is displayed
        onView(withId(R.id.book_title)).check(matches(withText(BOOK_TITLE)));

        // Check the correct author is displayed
        onView(withId(R.id.book_author)).check(matches(withText(BOOK_AUTHOR)));
    }

    public void testClickOnBookByPosition(){
        onData(anything()).atPosition(5).perform(click());
        onView(withId(R.id.book_title)).check(matches(withText(BOOK_TITLE)));
        onView(withId(R.id.book_author)).check(matches(withText(BOOK_AUTHOR)));
    }
}
