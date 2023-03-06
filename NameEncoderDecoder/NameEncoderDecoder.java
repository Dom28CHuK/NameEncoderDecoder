public class NameEncoderDecoder {
    public String encode(String name) {
        return "NOTFORYOU" + name
                        .replace("e", "1")
                        .replace("u", "2")
                        .replace("i", "3")
                        .replace("o", "4")
                        .replace("a", "5")
        + "YESNOTFORYOU";
    }

    public String decode(String name) {
        return name
                .replaceFirst("YESNOTFORYOU", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a")
                .replaceFirst("NOTFORYOU", "");
    }

    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();
        String encoder1 = names.encode("Andrii");
        System.out.println(encoder1);
        String decode1 = names.decode("\"NOTFORYOUCr5bYESNOTFORYOU\"");
        System.out.println(decode1);
        String decode2 = names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println(decode2);
    }
}
