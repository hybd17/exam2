package com.example.exam2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("second_round")
public class SecondRound {
    @TableId(type = IdType.AUTO)
    private long id;
    private long counselorId;
    private String drawNumber;
}
