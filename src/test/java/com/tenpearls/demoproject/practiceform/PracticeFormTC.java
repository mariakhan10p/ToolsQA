package com.tenpearls.demoproject.practiceform;

import org.testng.annotations.Test;

public class PracticeFormTC {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void UserSubmitsRequiredFields(){
        practiceFormPage.openHome();
        practiceFormPage.clickForm();
        practiceFormPage.clickPracticeForm();
        Student student = new Student("Maria", "Khan", "Female", "03001111111");
        practiceFormPage.enterRequiredStudentData(student);
        practiceFormPage.clickSubmitButton();
        practiceFormPage.assertSubmissionModal();
    }

    @Test
    void UserSubmitsEmptyForm(){
        practiceFormPage.openHome();
        practiceFormPage.clickForm();
        practiceFormPage.clickPracticeForm();
        practiceFormPage.clickSubmitButton();
        practiceFormPage.assertRequiredFields();
    }
}
