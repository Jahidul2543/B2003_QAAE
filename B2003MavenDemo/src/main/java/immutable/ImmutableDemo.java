package immutable;

public class ImmutableDemo {

    public static void main(String[] args) {
        String name = new String("John"); // String Immutable
        name = name.replace('J', 'K');
        System.out.println(name); // Kohn

        StringBuffer stringBuffer = new StringBuffer("John"); // StringBuffer is mutable
        stringBuffer.replace(0,1,"K");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("John"); // StringBuilder is mutable
        stringBuilder.replace(0,1,"V");
        System.out.println(stringBuilder);

    }

}
