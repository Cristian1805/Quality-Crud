package com.gestion.empleados.backend.modelo;

import jakarta.persistence.*;

import java.io.Serial;
import java.sql.Timestamp;

@Entity
@Table (name = "t_user")


public class t_user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;

    @Column(name = "v_user", length = 60, nullable = false, unique = true)
    private Character v_user;

    @Column(name = "v_name", length = 60, nullable = false, unique = true)
    private Character v_name;

    @Column(name = "v_pass", length = 60, nullable = false)
    private Character v_pass;

    @Column(name = "i_enable", length = 60, nullable = false)
    private Integer i_enable;

    @Column(name = "v_email", length = 60, nullable = false, unique = true)
    private Character v_email;

    @Column(name = "i_profile", length = 60, nullable = false)
    private Integer i_profile;

    @Column(name = "v_email", length = 60, nullable = false, unique = true)
    private Timestamp t_creation_date;

    public t_user(){
    }

    public t_user(Serial id, Character v_user, Character v_name, Character v_pass, Integer i_enable, Character v_email, Integer i_profile, Timestamp t_creation_date) {
        this.id = id;
        this.v_user = v_user;
        this.v_name = v_name;
        this.v_pass = v_pass;
        this.i_enable = i_enable;
        this.v_email = v_email;
        this.i_profile = i_profile;
        this.t_creation_date = t_creation_date;
    }

    public Serial getId() {
        return id;
    }

    public void setId(Serial id) {
        this.id = id;
    }

    public Character getV_user() {
        return v_user;
    }

    public void setV_user(Character v_user) {
        this.v_user = v_user;
    }

    public Character getV_name() {
        return v_name;
    }

    public void setV_name(Character v_name) {
        this.v_name = v_name;
    }

    public Character getV_pass() {
        return v_pass;
    }

    public void setV_pass(Character v_pass) {
        this.v_pass = v_pass;
    }

    public Integer getI_enable() {
        return i_enable;
    }

    public void setI_enable(Integer i_enable) {
        this.i_enable = i_enable;
    }

    public Character getV_email() {
        return v_email;
    }

    public void setV_email(Character v_email) {
        this.v_email = v_email;
    }

    public Integer getI_profile() {
        return i_profile;
    }

    public void setI_profile(Integer i_profile) {
        this.i_profile = i_profile;
    }

    public Timestamp getT_creation_date() {
        return t_creation_date;
    }

    public void setT_creation_date(Timestamp t_creation_date) {
        this.t_creation_date = t_creation_date;
    }
}
