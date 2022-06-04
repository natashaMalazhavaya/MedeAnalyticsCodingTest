package com.ua.learning.project.implementation.submit_registration;

import com.ua.learning.project.model.entity.RegistrationForm;
import com.ua.learning.project.implementation.BaseTest;
import com.ua.learning.project.utils.test_constants.TestConstants;
import org.testng.annotations.Test;

public class SubmitRegistrationTest extends BaseTest {

    @Test
    public void printRegistrationForm1() {
        RegistrationForm person = new RegistrationForm(
                "Ivan", "Petrov", "25/05/1998", 25);
        System.out.println(person);
    }

    @Test
    public void printRegistrationForm2() {
        RegistrationForm person = new RegistrationForm.Builder()
                .withFirstName(TestConstants.FIRST_NAME)
                .withLastName(TestConstants.LAST_NAME)
                .withBirthday(TestConstants.BIRTHDAY)
                .withAge(TestConstants.AGE)
                .build();
        System.out.println(person);
    }

    @Test
    public void printHashCode() {
        RegistrationForm registrationForm = new RegistrationForm.Builder()
                .withFirstName(TestConstants.LAST_NAME)
                .build();
        registrationForm.printHashCode(registrationForm);
    }

}
