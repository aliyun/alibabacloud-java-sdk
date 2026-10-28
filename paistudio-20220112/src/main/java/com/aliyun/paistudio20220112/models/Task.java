// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    /**
     * <p>The actions performed by the task.</p>
     */
    @NameInMap("Actions")
    public java.util.List<Action> actions;

    /**
     * <p>The description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test quota</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the task was activated.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtActivatedTime")
    public String gmtActivatedTime;

    /**
     * <p>The time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <p>The time when the task was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-10T11:49:47Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The time when the task was stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    /**
     * <p>The ID of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>quotad2kd8ljpsno</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The execution rules of the task.</p>
     */
    @NameInMap("Rules")
    public Rules rules;

    /**
     * <p>The status of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Activated</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>taskxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
