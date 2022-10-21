package kr.co.ezenac.validator;

import kr.co.ezenac.beans.UserBean;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return UserBean.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserBean userBean = (UserBean) target;

        if(!userBean.getUser_pw().equals(userBean.getUser_pw2())){
            errors.rejectValue("user_pw", "NotEquals");
            errors.rejectValue("user_pw2", "NotEquals");
        }
    }

}
