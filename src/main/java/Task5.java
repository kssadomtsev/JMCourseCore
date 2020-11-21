package main.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task5 {

    public static String printTextPerRoleWithMap(String[] roles, String[] textLines) {
        Map<String, StringBuilder> rolesLine = new LinkedHashMap<>();
        for (String role : roles) {
            rolesLine.put(role, new StringBuilder("\n"));
        }
        for (int i = 0; i < textLines.length; i++) {
            String currentRole = textLines[i].substring(0, textLines[i].indexOf(':'));
            String speech = textLines[i].substring(textLines[i].indexOf(':') + 1, textLines[i].length());
            rolesLine.put(currentRole, rolesLine.get(currentRole).append(i + 1).append(")").append(speech).append("\n"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, StringBuilder> entry : rolesLine.entrySet()) {
            stringBuilder.append(entry.getKey()).append(":").append(entry.getValue()).append("\n");
        }
        return String.valueOf(stringBuilder);
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String role : roles) {
            stringBuilder.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    stringBuilder.append(i + 1).append(')').append(textLines[i].substring(textLines[i].indexOf(':') + 1)).append('\n');
                }
            }
            stringBuilder.append('\n');
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        String text = """
                Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
                Аммос Федорович: Как ревизор?
                Артемий Филиппович: Как ревизор?
                Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
                Аммос Федорович: Вот те на!
                Артемий Филиппович: Вот не было заботы, так подай!
                Лука Лукич: Господи боже! еще и с секретным предписаньем!""";
        String roles = """
                Городничий
                Аммос Федорович
                Артемий Филиппович
                Лука Лукич""";

        System.out.println(printTextPerRole(roles.split("\n"), text.split("\n")));
        System.out.println(printTextPerRoleWithMap(roles.split("\n"), text.split("\n")));
    }


}
