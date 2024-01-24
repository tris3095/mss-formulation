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
// @Table(name = "daily", schema = "public")
// public class Daily {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Integer daily_id;
// private Integer weekly_id;
// private String day_name;
// @Temporal(TemporalType.DATE)
// private Date actual_date;
// @Temporal(TemporalType.TIMESTAMP)
// private Date created_at;
// @Temporal(TemporalType.TIMESTAMP)
// private Date updated_at;
// private Integer day_id;
// }
