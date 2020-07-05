package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String began_at_error = _validateBegan_at(r.getBegan_at());
        if(!began_at_error.equals("")) {
            errors.add(began_at_error);
        }

        String finished_at_error = _validateFinished_at(r.getFinished_at());
        if(!finished_at_error.equals("")) {
            errors.add(finished_at_error);
        }

        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }

    private static String _validateBegan_at(String began_at) {
        if(began_at == null || began_at.equals("")) {
            return "出勤時間を入力してください。";
        }

        return "";
    }

    private static String _validateFinished_at(String finished_at) {
        if(finished_at == null || finished_at.equals("")) {
            return "退勤時間を入力してください。";
        }

        return "";
    }
}
