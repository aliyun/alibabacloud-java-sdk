// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOnceTaskResultInfoResponseBody extends TeaModel {
    /**
     * <p>The time when the task was executed.</p>
     * 
     * <strong>example:</strong>
     * <p>1671184531000</p>
     */
    @NameInMap("CollectTime")
    public Long collectTime;

    /**
     * <p>The number of tasks that have been completed.</p>
     * 
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("FinishCount")
    public Integer finishCount;

    /**
     * <p>The ID of the request. This uniquely identifies the request and can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the one-time task.</p>
     * 
     * <strong>example:</strong>
     * <p>e7b70a4b030db086db52231f1b58****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>Details of the task.</p>
     */
    @NameInMap("TaskInfo")
    public GetOnceTaskResultInfoResponseBodyTaskInfo taskInfo;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
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
        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p><strong>INIT</strong>: The task is pending start.</p>
         * </li>
         * <li><p><strong>START</strong>: The task is running.</p>
         * </li>
         * <li><p><strong>SUCCESS</strong>: The task is completed.</p>
         * </li>
         * <li><p><strong>TIMEOUT</strong>: The task has timed out.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>START</p>
         */
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
