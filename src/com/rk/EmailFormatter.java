package com.rk;

import javax.swing.*;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFormatter extends JFormattedTextField.AbstractFormatter {

    Pattern RegExP = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");

    @Override
    public Object stringToValue(String string) throws ParseException {
        Matcher matcher = RegExP.matcher(string);

        if (matcher.matches()){
            return string;
        } else {
            return "Format Email Salah!";
        }
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        return (String) value;
    }
}
