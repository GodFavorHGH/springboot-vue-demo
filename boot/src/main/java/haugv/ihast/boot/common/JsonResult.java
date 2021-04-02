package haugv.ihast.boot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haugv
 * @description
 * @date 2021/4/2-2:56 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult<T> {

    private int code;
    private String message;
    private T data;

    public JsonResult(int code, String message){
        this(code, message, null);
    }

}
