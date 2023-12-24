public class Main {
    public static void main(String[] args) {
        String name = String.format("My Name is %s %s","MohammadReza", "Aghalar");
        System.out.println(name);
        String str = "Fanap";
        name = name.replace("MohammadReza",str);
        System.out.println(name);
        name = name.substring(0,name.indexOf(str)+str.length());
        System.out.println(name);
    }
}