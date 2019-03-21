class Util {
    public static int min(int[] values) {
        int referenceValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < referenceValue){
                referenceValue = values[i];
            }
        }
        return referenceValue;
    }
}