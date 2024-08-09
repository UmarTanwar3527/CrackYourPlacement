public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder output = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');
            columnNumber /= 26;
            output.append(c);
        }

        return output.reverse().toString();
    }

}
