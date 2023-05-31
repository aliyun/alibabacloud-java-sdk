// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The time at which the task was run.</p>
     */
    @NameInMap("CollectTime")
    public Long collectTime;

    /**
     * <p>The number of tasks that have been completed.</p>
     */
    @NameInMap("FinishCount")
    public Integer finishCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the latest scan task.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The information about the latest task.</p>
     */
    @NameInMap("TaskInfo")
    public GetLastOnceTaskInfoResponseBodyTaskInfo taskInfo;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetLastOnceTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLastOnceTaskInfoResponseBody self = new GetLastOnceTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLastOnceTaskInfoResponseBody setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }
    public Long getCollectTime() {
        return this.collectTime;
    }

    public GetLastOnceTaskInfoResponseBody setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
        return this;
    }
    public Integer getFinishCount() {
        return this.finishCount;
    }

    public GetLastOnceTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLastOnceTaskInfoResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetLastOnceTaskInfoResponseBody setTaskInfo(GetLastOnceTaskInfoResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetLastOnceTaskInfoResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public GetLastOnceTaskInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetLastOnceTaskInfoResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The progress of the task in percentage.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The result of the scan task. Valid values:</p>
         * <br>
         * <p>*   **SUCCESS**: The task is successful.</p>
         * <p>*   **TASK\_NOT\_SUPPORT_REGION**: The images are deployed in a region that is not supported by container image scan.</p>
         * <p>*   **TASK\_NOT_EXISTS**: The task does not exist.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is not started.</p>
         * <p>*   **START**: The task is started.</p>
         * <p>*   **SUCCESS**: The task is complete.</p>
         * <p>*   **TIMEOUT**: The task timed out.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetLastOnceTaskInfoResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLastOnceTaskInfoResponseBodyTaskInfo self = new GetLastOnceTaskInfoResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetLastOnceTaskInfoResponseBodyTaskInfo setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetLastOnceTaskInfoResponseBodyTaskInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetLastOnceTaskInfoResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
