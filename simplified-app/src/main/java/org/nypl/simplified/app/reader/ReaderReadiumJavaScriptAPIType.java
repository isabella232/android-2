package org.nypl.simplified.app.reader;

import com.io7m.jfunctional.OptionType;

/**
 * The type of the JavaScript API exposed by Readium.
 */

public interface ReaderReadiumJavaScriptAPIType
{
  /**
   * Retrieve the current page.
   */

  void getCurrentPage(
    ReaderCurrentPageListenerType l);

  /**
   * Open a book.
   *
   * @param p
   *          The package
   * @param vs
   *          The current reader viewer settings
   * @param r
   *          A request for a specific page, if any
   */

  void openBook(
    org.readium.sdk.android.Package p,
    ReaderReadiumViewerSettings vs,
    OptionType<ReaderOpenPageRequestType> r);

  /**
   * Go to the specific location in the book.
   *
   * @param r
   *          The page request
   */

  void openContentURL(
    String content_ref,
    String source_href);

  /**
   * Go to the next page in the current book.
   */

  void pageNext();

  /**
   * Go to the previous page in the current book.
   */

  void pagePrevious();

  /**
   * Configure the page style based on the given settings.
   *
   * @param r
   *          The settings
   */

  void setPageStyleSettings(
    ReaderSettingsType r);
}