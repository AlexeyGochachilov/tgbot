package com.ag.tgbot.dto;

import lombok.Data;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/указать значение поля
@XmlRootElement(name = "ValuteCursOnDate") //Корневой элемент
@Data //Генерируем геттеры и сеттеры
public class ValuteCursOnDate {

    @XmlElement(name = "Vname") //Название XML тэга
    private String name;

    @XmlElement(name = "Vnom") //Название XML тэга
    private int nominal;

    @XmlElement(name = "Vcurs") //Название XML тэга
    private double course;

    @XmlElement(name = "Vcode") //Название XML тэга
    private String code;

    @XmlElement(name = "VchCode") //Название XML тэга
    private String chCode;
}
