package com.joyy.neza_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Jiang Pengyong
 * @date: 2021/8/13 3:17 下午
 * @email: 56002982@qq.com
 * @des: flutter 的注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface FlutterEngine {
    String engineId();
}