// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class SyncPodInfoRequest extends TeaModel {
    @NameInMap("PodName")
    public String podName;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SideCarType")
    public String sideCarType;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("TaskId")
    public Long taskId;

    public static SyncPodInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncPodInfoRequest self = new SyncPodInfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncPodInfoRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public SyncPodInfoRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncPodInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncPodInfoRequest setSideCarType(String sideCarType) {
        this.sideCarType = sideCarType;
        return this;
    }
    public String getSideCarType() {
        return this.sideCarType;
    }

    public SyncPodInfoRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public SyncPodInfoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
