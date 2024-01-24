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
// @Table(name = "weekly", schema = "public")
// public class Weekly {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Integer weekly_id;
// private Integer monthly_id;
// private String week_number;
// @Temporal(TemporalType.TIMESTAMP)
// private Date created_at;
// @Temporal(TemporalType.TIMESTAMP)
// private Date updated_at;
// private Integer week_id;
// }
