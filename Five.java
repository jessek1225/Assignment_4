
    public class Five {
        public static void main(String[] args) {
            String DNA = "TTTTTTTTTTGGCGCG";
            String RNA = DNAtoRNA(DNA);
            System.out.println(RNA);
        }

        public static String DNAtoRNA(String DNA) {
            char[] RNA = new char[DNA.length()];

            for (int i = 0; i < DNA.length(); i++) {
                char nucleotide = DNA.charAt(i);
                if (nucleotide == 'T') {
                    RNA[i] = 'U';  // Replace 'T' with 'U'
                } else {
                    RNA[i] = nucleotide;  // Keep other nucleotides unchanged
                }
            }

            return new String(RNA);  // Convert char array to String
        }
    }
