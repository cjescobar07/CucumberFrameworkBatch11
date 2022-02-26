package utils;

public class APIPayloadConstants {

    public static String createEmployeePayload(){
        String createEmployeePayload = "{\n" +
                "  \"emp_firstname\": \"chizgul\",\n" +
                "  \"emp_lastname\": \"tata\",\n" +
                "  \"emp_middle_name\": \"noma\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"1988-02-28\",\n" +
                "  \"emp_status\": \"Employee\",\n" +
                "  \"emp_job_title\": \"QA\"\n" +
                "}";

        return createEmployeePayload;
    }

}
