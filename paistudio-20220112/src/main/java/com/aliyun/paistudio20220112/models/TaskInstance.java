// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class TaskInstance extends TeaModel {
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    @NameInMap("GmtEndTime")
    public String gmtEndTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskInstanceId")
    public String taskInstanceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    public static TaskInstance build(java.util.Map<String, ?> map) throws Exception {
        TaskInstance self = new TaskInstance();
        return TeaModel.build(map, self);
    }

    public TaskInstance setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public TaskInstance setGmtEndTime(String gmtEndTime) {
        this.gmtEndTime = gmtEndTime;
        return this;
    }
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    public TaskInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskInstance setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TaskInstance setTaskInstanceId(String taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

    public TaskInstance setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TaskInstance setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
