public class BiginsWithA implements IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return item.startsWith("A");
    }

}