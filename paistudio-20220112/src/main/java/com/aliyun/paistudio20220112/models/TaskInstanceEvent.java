// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class TaskInstanceEvent extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:02:00Z</p>
     */
    @NameInMap("GmtEndTime")
    public String gmtEndTime;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    /**
     * <p>The message content.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the pod involved in the task.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PodName")
    public String podName;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The sub-product type involved in the task.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc</p>
     */
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
