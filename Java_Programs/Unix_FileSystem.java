public class Main {
    public static String absolutePath(String path) {
        String[] components = path.split("/");
        
        String[] resultArray = new String[components.length];
        int index = 0;
        
        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                continue;
            } else if (component.equals("..")) {
                if (index > 0) {
                    index--;
                }
            } else {
                resultArray[index++] = component;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append("/").append(resultArray[i]);
        }
        
        return result.length() > 0 ? result.toString() : "/";
    }
    
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String result = absolutePath(path);
        System.out.println(result);
    }
}
