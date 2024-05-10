package com.anqi.forumbase.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "table_name")
public class UserPojo {

    //标识主键
    @TableId(value = "username", type = IdType.ASSIGN_ID)
    private String username;

    //标识每一列
    @TableField(value = "password")
    private String password;

}
