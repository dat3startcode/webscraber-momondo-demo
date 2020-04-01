package webscraper;


import java.util.concurrent.Callable;


public class TagCounterCallable implements Callable<TagCounter> {

  TagCounter tc;

  public TagCounterCallable(String url) {
    tc = new TagCounter(url);
  }

  @Override
  public TagCounter call() throws Exception {
    tc.doWork();
    return tc;
  }

}