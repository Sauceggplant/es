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
@Table(name = "t_test")
public class TestEntity implements Serializable {

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
    @Column(name = "create_tm")
    private Date createTime;

    /**
     * 创建账户
     */
    @CreatedBy
    @Column(name = "create_account")
    private String createAccount;

    /**
     * 更新时间
     */
    @UpdateTimestamp
    @Column(name = "update_tm")
    private Date updateTime;

    /**
     * 更新账户
     */
    @LastModifiedBy
    @Column(name = "update_account")
    private String updateAccount;

    /**
     * 版本号
     */
    @Version
    @Column(name = "version")
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
