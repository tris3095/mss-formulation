// package com.springboot.mssformulation.models;

// import java.sql.Date;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import jakarta.persistence.Temporal;
// import jakarta.persistence.TemporalType;
// import lombok.Data;

// @Data
// @Entity
// @Table(name = "day", schema = "public")
// public class Day {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Integer day_id;
// private String name;
// @Temporal(TemporalType.DATE)
// private Date date;
// private Integer week_id;
// private Integer month;
// private Integer year;
// private boolean status_pre_holiday;
// private boolean status_holiday;
// }
