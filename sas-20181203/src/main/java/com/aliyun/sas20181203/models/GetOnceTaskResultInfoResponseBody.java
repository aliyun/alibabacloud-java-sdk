// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOnceTaskResultInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the task.</p>
     */
    @NameInMap("CollectTime")
    public Long collectTime;

    @NameInMap("FinishCount")
    public Integer finishCount;

    /**
     * <p>The status of the task. Valid values:</p>
     * <br>
     * <p>*   **INIT**: The task is not started.</p>
     * <p>*   **START**: The task is started.</p>
     * <p>*   **SUCCESS**: The task is complete.</p>
     * <p>*   **TIMEOUT**: The task times out.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskInfo")
    public GetOnceTaskResultInfoResponseBodyTaskInfo taskInfo;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetOnceTaskResultInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnceTaskResultInfoResponseBody self = new GetOnceTaskResultInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnceTaskResultInfoResponseBody setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }
    public Long getCollectTime() {
        return this.collectTime;
    }

    public GetOnceTaskResultInfoResponseBody setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
        return this;
    }
    public Integer getFinishCount() {
        return this.finishCount;
    }

    public GetOnceTaskResultInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnceTaskResultInfoResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetOnceTaskResultInfoResponseBody setTaskInfo(GetOnceTaskResultInfoResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetOnceTaskResultInfoResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public GetOnceTaskResultInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetOnceTaskResultInfoResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static GetOnceTaskResultInfoResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOnceTaskResultInfoResponseBodyTaskInfo self = new GetOnceTaskResultInfoResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetOnceTaskResultInfoResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
