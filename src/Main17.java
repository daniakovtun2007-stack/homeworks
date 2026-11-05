public class Main17 {
    public static void main(String[] args) {
        String dnaSequence = "AAAAGCCCTTAAAC";
        StringBuilder sb = new StringBuilder();

        if (dnaSequence != null && !dnaSequence.isEmpty()) {
            char currentSymbol = dnaSequence.charAt(0);
            int counter = 1;

            for (int i = 1; i < dnaSequence.length(); i++) {
                char s = dnaSequence.charAt(i);
                if (currentSymbol == s) {
                    counter++;
                } else {
                    sb.append(currentSymbol).append(counter);
                    currentSymbol = s;
                    counter = 1;
                }
            }
            sb.append(currentSymbol).append(counter);
        }

        String result = sb.toString();
        System.out.println("Сжатая строка:   " + result);

        String text = "A4G1C3T2A3C1";
        StringBuilder result1 = new StringBuilder();

        if (text != null && !text.isEmpty()) {
            char currentSymbol1 = text.charAt(0);
            String count = "";

            for (int i = 1; i < text.length(); i++) {
                char s = text.charAt(i);

                if (s >= '0' && s <= '9') {
                    count += s;
                } else {
                    int repeatCount = Integer.parseInt(count);
                    for (int j = 0; j < repeatCount; j++) {
                        result1.append(currentSymbol1);
                    }

                    currentSymbol1 = s;
                    count = "";
                }
            }

            int lastCount = Integer.parseInt(count);
            for (int j = 0; j < lastCount; j++) {
                result1.append(currentSymbol1);
            }
        }

        String dnaSequence1 = result1.toString();
        System.out.println("Исходная строка: " + dnaSequence1);

        String text1 = "Hello";
        String tagedText = "b h1";

        StringBuilder resultHtml = new StringBuilder();
        resultHtml.append(text1);
        String[] tages = tagedText.split(" ");
        for (String tag : tages){
            resultHtml.insert(0, "<" + tag + ">");
            resultHtml.append("</" + tag + ">");
        }
        System.out.println(resultHtml.toString());
        }
    }
