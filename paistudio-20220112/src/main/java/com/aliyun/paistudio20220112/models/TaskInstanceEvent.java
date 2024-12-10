// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class TaskInstanceEvent extends TeaModel {
    @NameInMap("GmtEndTime")
    public String gmtEndTime;

    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    @NameInMap("Message")
    public String message;

    @NameInMap("PodName")
    public String podName;

    @NameInMap("Status")
    public String status;

    @NameInMap("WorkloadType")
    public String workloadType;

    public static TaskInstanceEvent build(java.util.Map<String, ?> map) throws Exception {
        TaskInstanceEvent self = new TaskInstanceEvent();
        return TeaModel.build(map, self);
    }

    public TaskInstanceEvent setGmtEndTime(String gmtEndTime) {
        this.gmtEndTime = gmtEndTime;
        return this;
    }
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    public TaskInstanceEvent setGmtStartTime(String gmtStartTime) {
        this.gmtStartTime = gmtStartTime;
        return this;
    }
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    public TaskInstanceEvent setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskInstanceEvent setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public TaskInstanceEvent setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskInstanceEvent setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

}
