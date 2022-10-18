package kr.co.ezenac.beans;

import javax.validation.constraints.*;

public class DataBean1 {

    @AssertTrue // true가 아닌 값이 들어오면 오류
    private boolean data1;

    @AssertFalse // false가 아닌 값이 들어오면 오류
    private boolean data2;

    @Max(100) // 100보다 큰 값이 들어오면 오류 
    @Min(10)  // 10보다 작은 값이 들어오면 오류
    private String data3;
    //@MIN @MAX => Value 로 int 값을, @DecimalMax @DecimalMin은 Value 로 String 값을 주어야함

    @DecimalMax(value = "100", inclusive = false) // true(생략시 기본값): 100포함,  false: 99까지
    @DecimalMin(value = "10", inclusive = false) // true(생략시 기본값): 10포함, false: 11부터
    private String data4;

    @Null // null 이 아닌 다른 값이 들어오면 오류
    private String data5;

    @NotNull // null 값이 들어오면 오류
    private String data6;

    @Digits(integer = 3, fraction = 3) // 정수 3자리, 실수 3자리 값이 아닐 경우 오류
    private String data7;

    @Size(min = 3, max = 10) // 문자열 길이
    private String data8;

    @Pattern(regexp = "[a-zA-Z]*") // 정규식 검사
    private String data9;

    public DataBean1() {

        this.data1 = true;
        this.data2 = false;
        this.data3 = "50";
        this.data4 = "50";
        this.data5 = null;
        this.data6 = "check2";
        this.data7 = "111.111";
        this.data8 = "abcd";

    }

    public boolean isData1() {
        return data1;
    }

    public void setData1(boolean data1) {
        this.data1 = data1;
    }

    public boolean isData2() {
        return data2;
    }

    public void setData2(boolean data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public String getData4() {
        return data4;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }

    public String getData5() {
        return data5;
    }

    public void setData5(String data5) {
        this.data5 = data5;
    }

    public String getData6() {
        return data6;
    }

    public void setData6(String data6) {
        this.data6 = data6;
    }

    public String getData7() {
        return data7;
    }

    public void setData7(String data7) {
        this.data7 = data7;
    }

    public String getData8() {
        return data8;
    }

    public void setData8(String data8) {
        this.data8 = data8;
    }

    public String getData9() {
        return data9;
    }

    public void setData9(String data9) {
        this.data9 = data9;
    }
}
