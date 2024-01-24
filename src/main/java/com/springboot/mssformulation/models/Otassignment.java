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
// @Table(name = "otassignment", schema = "public")
// public class Otassignment {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Integer id;
// private Integer mssp_id;
// private Integer week_id;
// private Integer ot_id;
// private Integer unit_id;
// private Integer day_id;
// private boolean is_require_anaes;
// @Temporal(TemporalType.TIME)
// private Date opening_time;
// @Temporal(TemporalType.TIME)
// private Date closing_time;
// @Temporal(TemporalType.TIMESTAMP)
// private Date created_at;
// @Temporal(TemporalType.TIMESTAMP)
// private Date updated_at;
// private Integer daily_id;
// }
