public final class IdentifierTransformation {

    public static String snakeCaseIdentifierToPascalCase(String identifier) {
        char[] workString = snakeCaseIdentifierToCamelCase(identifier).toCharArray();
        if (workString.length > 0) {
            workString[0] = Character.toUpperCase(workString[0]);
        }
        return new String(workString);
    }

    public static String snakeCaseIdentifierToCamelCase(String identifier) {
        char[] workString = identifier.toLowerCase().toCharArray();

        boolean firstCharacterMet = false;
        for (int charIndex = 0; charIndex < workString.length; charIndex++) {
            if (workString[charIndex] == '_' && firstCharacterMet) {
                if (charIndex < workString.length - 1) {
                    workString[charIndex + 1] = Character.toUpperCase(workString[charIndex + 1]);
                }
            } else {
                firstCharacterMet = true;
            }
        }

        return new String(workString).replace("_", "");
    }
}
