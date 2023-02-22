public class BiginsWith implements IsGood<String> {
    private String string;

    public BiginsWith(String string) {
        this.string = string;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(string);
    }

}
