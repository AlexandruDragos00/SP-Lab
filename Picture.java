public interface Picture {

    public default String url() {
        throw new java.lang.UnsupportedOperationException();
    }

    public default Dimension dim() {
        throw new java.lang.UnsupportedOperationException();
    }

}
