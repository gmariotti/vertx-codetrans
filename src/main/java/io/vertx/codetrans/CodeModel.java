package io.vertx.codetrans;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CodeModel {

  private final Exception where;

  public CodeModel() {
    this.where = new Exception() {
    };
  }

  public void render(CodeWriter writer) {
    UnsupportedOperationException e = new UnsupportedOperationException(getClass().getName() + " has not implemented this method");
    e.initCause(where);
    throw e;
  }

  protected final UnsupportedOperationException unsupported(String feature) {
    return new UnsupportedOperationException(getClass().getName() + " has not implemented: " + feature);
  }
}
