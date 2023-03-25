// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateContainerScanTaskResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateContainerScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerScanTaskResponseBody self = new CreateContainerScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContainerScanTaskResponseBody setData(CreateContainerScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateContainerScanTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateContainerScanTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateContainerScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateContainerScanTaskResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether you can create more scan tasks.</p>
         */
        @NameInMap("CanCreate")
        public Boolean canCreate;

        /**
         * <p>The collection time.</p>
         */
        @NameInMap("CollectTime")
        public Long collectTime;

        /**
         * <p>The execution time of the task.</p>
         */
        @NameInMap("ExecTime")
        public Long execTime;

        /**
         * <p>The number of scan tasks that are complete.</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The progress of the task.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The execution result of the task.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the task.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of scan tasks.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static CreateContainerScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerScanTaskResponseBodyData self = new CreateContainerScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateContainerScanTaskResponseBodyData setCanCreate(Boolean canCreate) {
            this.canCreate = canCreate;
            return this;
        }
        public Boolean getCanCreate() {
            return this.canCreate;
        }

        public CreateContainerScanTaskResponseBodyData setCollectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }
        public Long getCollectTime() {
            return this.collectTime;
        }

        public CreateContainerScanTaskResponseBodyData setExecTime(Long execTime) {
            this.execTime = execTime;
            return this;
        }
        public Long getExecTime() {
            return this.execTime;
        }

        public CreateContainerScanTaskResponseBodyData setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public CreateContainerScanTaskResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreateContainerScanTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CreateContainerScanTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateContainerScanTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateContainerScanTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
