package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;
@MappedSuperclass
@Data
public class BaseEntity {
    @Column(updatable = false)
    private LocalDateTime createTime;
    @Column(updatable = false)
    private String createBy;
    @Column(insertable = false)
    private LocalDateTime updateAt;
    @Column(insertable = false)
    private String updateBy;
}
