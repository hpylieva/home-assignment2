package lab;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HttpStatus {
    INFO(100, 199, new infoCodeProcessor()),
    SUCCESS(200, 299 , new successCodeProcessor()),
    REDIRECTION(300, 399, new redirectionCodeProcessor()),
    CLIENT_ERROR(400, 499, new clientErrorCodeProcessor()),
    SERVER_ERROR(500, 599,new serverErrorCodeProcessor());

    private final int min;
    private final int max;
    private CodeProcessor codeProcessor;

    public static HttpStatus findByHttpCode(int code) {
        HttpStatus[] statuses = values();
        for (HttpStatus status: statuses){
            if(code >= status.min && code <= status.max)
            {
                return status;
            }
        }
        throw new RuntimeException("Invalid Http code:" + code);
    }




}
