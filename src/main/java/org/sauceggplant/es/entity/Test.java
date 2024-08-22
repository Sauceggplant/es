package org.sauceggplant.es.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.io.Serializable;
import java.util.Date;

/**
 * 试题
 */
@Entity
@Table
public class Test implements Serializable {

    /**
     * 唯一ID
     */
    @Id
    private String id;

    /**
     * 题目
     */
    @Column(nullable = false)
    private String title;

    /**
     * 类别
     */
    @Column(nullable = false)
    private String category;

    /**
     * 详细描述
     */
    @Column(nullable = false)
    private String content;

    /**
     * 答案
     */
    @Column(nullable = false)
    private String answer;

    /**
     * 创建时间
     */
    @CreationTimestamp
    private Date createTm;

    /**
     * 创建账户
     */
    @CreatedBy
    private String createAccount;

    /**
     * 更新时间
     */
    @UpdateTimestamp
    private Date updateTm;

    /**
     * 更新账户
     */
    @LastModifiedBy
    private String updateAccount;

    /**
     * 版本号
     */
    @Version
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
    }

    public Date getUpdateTm() {
        return updateTm;
    }

    public void setUpdateTm(Date updateTm) {
        this.updateTm = updateTm;
    }

    public String getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
