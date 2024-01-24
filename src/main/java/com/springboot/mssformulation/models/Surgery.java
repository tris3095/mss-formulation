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
// @Table(name = "surgery", schema = "public")
// public class Surgery {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Integer id;
// private String mrn;
// private Integer unit_id;
// @Temporal(TemporalType.DATE)
// private Date booking_date;
// private Integer estimated_duration;
// private Integer procedure_name_id;
// }
