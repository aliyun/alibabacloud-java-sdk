// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<Action> actions;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtActivatedTime")
    public String gmtActivatedTime;

    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("Rules")
    public Rules rules;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static Task build(java.util.Map<String, ?> map) throws Exception {
        Task self = new Task();
        return TeaModel.build(map, self);
    }

    public Task setActions(java.util.List<Action> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<Action> getActions() {
        return this.actions;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Task setGmtActivatedTime(String gmtActivatedTime) {
        this.gmtActivatedTime = gmtActivatedTime;
        return this;
    }
    public String getGmtActivatedTime() {
        return this.gmtActivatedTime;
    }

    public Task setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public Task setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Task setGmtStoppedTime(String gmtStoppedTime) {
        this.gmtStoppedTime = gmtStoppedTime;
        return this;
    }
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    public Task setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public Task setRules(Rules rules) {
        this.rules = rules;
        return this;
    }
    public Rules getRules() {
        return this.rules;
    }

    public Task setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Task setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public Task setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public Task setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Task setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
