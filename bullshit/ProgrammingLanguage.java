package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer year;
    String creator;

    public ProgrammingLanguage(String name, Integer year, String creator) {
        this.name = name;
        this.year = year;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }
    public Integer getYear() {
        return year;
    }
    public String getCreator() {
        return creator;
    }

    public static void main(String[] args) {
        ProgrammingLanguage python = new ProgrammingLanguage("Python", 1991, "Guido van Rossum");
        ProgrammingLanguage lua = new ProgrammingLanguage("Lua", 1993, "Tecgraf");
        ProgrammingLanguage csharp = new ProgrammingLanguage("C#", 2000, "Microsoft");

        System.out.println(python.getName());
        System.out.println(lua.getName());
        System.out.println(csharp.getName());

        System.out.println(python.getYear());
        System.out.println(lua.getYear());
        System.out.println(csharp.getYear());

        System.out.println(python.getCreator());
        System.out.println(lua.getCreator());
        System.out.println(csharp.getCreator());
    }
}
