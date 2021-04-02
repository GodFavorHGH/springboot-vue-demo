package haugv.ihast.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author haugv
 * @description
 * @date 2021/4/2-2:54 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private int id;
    private String loginId;
    private String password;

}
