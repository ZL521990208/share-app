package com.soft1851.gateway;

import lombok.Data;

import java.time.LocalTime;

/**
 * @author zhengliang
 * @description TODO
 * @Data 2020/10/9
 */
@Data
public class TimeBetweenConfig {
    private LocalTime start;
    private LocalTime end;
}