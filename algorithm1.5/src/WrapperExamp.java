public class WrapperExamp {
    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.set(new Integer(123));
        Integer wrapperVal = (Integer) m.get();
        int val = wrapperVal.intValue();
        System.out.println("Contents are:" + val);
    }
}
