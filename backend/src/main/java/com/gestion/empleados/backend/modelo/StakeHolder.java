package com.gestion.empleados.backend.modelo;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "stakeholder")
public class StakeHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "b_docucument_type", length = 60, nullable = false)
    private Character b_docucument_type;

    @Column(name = "b_docucument_number", length = 60, nullable = false)
    private Character b_docucument_number;

    @Column(name = "v_first_name", length = 60, nullable = false, unique = true)
    private Character v_first_name;

    @Column(name = "v_second_name", length = 60, nullable = false)
    private Character second_name;

    @Column(name = "v_first_surname", length = 60, nullable = false)
    private Character v_first_surname;

    @Column(name = "v_second_surname", length = 60, nullable = false, unique = true)
    private Character _second_surname;

    @Column(name = "v_full_name", length = 60, nullable = false)
    private Character v_full_name;

    @Column(name = "d_date_birth", length = 60, nullable = false)
    private Date d_date_birth;

    @Column(name = "v_city", length = 60, nullable = false, unique = true)
    private Character v_city;

    @Column(name = "i_sex", length = 60, nullable = false)
    private Integer i_sex;

    @Column(name = "i_enable", length = 60, nullable = false)
    private Integer i_enable;

    @Column(name = "i_creation_user", length = 60, nullable = false, unique = true)
    private Integer i_creation_user;

    @Column(name = "t_creation_date", length = 60, nullable = false)
    private Timestamp t_creation_date;

    public StakeHolder(){
    }

    public StakeHolder(Long id, Character b_docucument_type, Character b_docucument_number, Character v_first_name, Character second_name, Character v_first_surname, Character _second_surname, Character v_full_name, Date d_date_birth, Character v_city, Integer i_sex, Integer i_enable, Integer i_creation_user, Timestamp t_creation_date) {
        this.id = id;
        this.b_docucument_type = b_docucument_type;
        this.b_docucument_number = b_docucument_number;
        this.v_first_name = v_first_name;
        this.second_name = second_name;
        this.v_first_surname = v_first_surname;
        this._second_surname = _second_surname;
        this.v_full_name = v_full_name;
        this.d_date_birth = d_date_birth;
        this.v_city = v_city;
        this.i_sex = i_sex;
        this.i_enable = i_enable;
        this.i_creation_user = i_creation_user;
        this.t_creation_date = t_creation_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getB_docucument_type() {
        return b_docucument_type;
    }

    public void setB_docucument_type(Character b_docucument_type) {
        this.b_docucument_type = b_docucument_type;
    }

    public Character getB_docucument_number() {
        return b_docucument_number;
    }

    public void setB_docucument_number(Character b_docucument_number) {
        this.b_docucument_number = b_docucument_number;
    }

    public Character getV_first_name() {
        return v_first_name;
    }

    public void setV_first_name(Character v_first_name) {
        this.v_first_name = v_first_name;
    }

    public Character getSecond_name() {
        return second_name;
    }

    public void setSecond_name(Character second_name) {
        this.second_name = second_name;
    }

    public Character getV_first_surname() {
        return v_first_surname;
    }

    public void setV_first_surname(Character v_first_surname) {
        this.v_first_surname = v_first_surname;
    }

    public Character get_second_surname() {
        return _second_surname;
    }

    public void set_second_surname(Character _second_surname) {
        this._second_surname = _second_surname;
    }

    public Character getV_full_name() {
        return v_full_name;
    }

    public void setV_full_name(Character v_full_name) {
        this.v_full_name = v_full_name;
    }

    public Date getD_date_birth() {
        return d_date_birth;
    }

    public void setD_date_birth(Date d_date_birth) {
        this.d_date_birth = d_date_birth;
    }

    public Character getV_city() {
        return v_city;
    }

    public void setV_city(Character v_city) {
        this.v_city = v_city;
    }

    public Integer getI_sex() {
        return i_sex;
    }

    public void setI_sex(Integer i_sex) {
        this.i_sex = i_sex;
    }

    public Integer getI_enable() {
        return i_enable;
    }

    public void setI_enable(Integer i_enable) {
        this.i_enable = i_enable;
    }

    public Integer getI_creation_user() {
        return i_creation_user;
    }

    public void setI_creation_user(Integer i_creation_user) {
        this.i_creation_user = i_creation_user;
    }

    public Timestamp getT_creation_date() {
        return t_creation_date;
    }

    public void setT_creation_date(Timestamp t_creation_date) {
        this.t_creation_date = t_creation_date;
    }
}
