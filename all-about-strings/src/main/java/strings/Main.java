package strings;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String birthDate = "25/11/1999";
        int startingIndex = birthDate.indexOf("1999");
        System.out.println("startingIndex = " + startingIndex);
        System.err.println("Birth year = " + birthDate.substring(startingIndex));

        String month_index = birthDate.substring(3, 5);
        System.out.println("Month = " + month_index);

        String newString = String.join("/", "01", "31", "1999");
        System.out.println("NewString = " + newString);

        String timeString = "11:11:11";

        String dateTimeString = newString.concat(" "+ timeString);
        System.out.println("dateTimeString = "+ dateTimeString);

        String changeDateFormattingString = dateTimeString.replace("/", "-");
        System.out.println("changeDateFormattingString = " + changeDateFormattingString);
        String changeDateFormatting2String = dateTimeString.replaceAll("/", "--");
        System.out.println("changeDateFormatting2String = " + changeDateFormatting2String);

        StringBuilder builder = new StringBuilder("All the stuff");
        System.out.println("builder = " + builder);
        addToString(builder, " that we wanted");

        System.out.println("New Builder = " + builder);
        // When using string methods on "String" objects you need to assign the new string to a variable. Example: String string3 = string1.concat(string2);
        // When using a StringBuilder you do not need to do this as it behaves more like an array where you .append() onto the end of the existing string. Example: builder.append(string);

        builder.replace(4, 5, "T");
        System.out.println("Builder = " + builder);

        String nwBuilderString = builder.toString();
        StringBuilder newStringBuilder = new StringBuilder(nwBuilderString).reverse();
        System.out.println("newStringBuilder = " + newStringBuilder);
    }

    public static void addToString(StringBuilder builder, String stringToAdd) {

        builder = builder.append(stringToAdd);
        System.out.println(builder + ":" + stringToAdd);

    }
}