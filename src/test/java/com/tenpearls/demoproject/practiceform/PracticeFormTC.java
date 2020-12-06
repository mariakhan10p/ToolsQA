package com.tenpearls.demoproject.practiceform;

import org.testng.annotations.Test;

public class PracticeFormTC {

    PracticeForm practiceForm = new PracticeForm();

    @Test
    void UserSubmitsRequiredFields(){
        practiceForm.openHome();
        practiceForm.clickForm();
        practiceForm.clickPracticeForm();
        Student student = new Student("Maria", "Khan", "Female", "03001111111");
        practiceForm.enterRequiredStudentData(student);
        practiceForm.clickSubmitButton();
        practiceForm.assertSubmissionModal();
    }

    @Test
    void UserSubmitsEmptyForm(){
        practiceForm.openHome();
        practiceForm.clickForm();
        practiceForm.clickPracticeForm();
        practiceForm.clickSubmitButton();
        practiceForm.assertRequiredFields();
    }
}
