// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskByAppNameResponseBody extends TeaModel {
    /**
     * <p>The data returned if the request was successful.</p>
     */
    @NameInMap("Data")
    public CreateContainerScanTaskByAppNameResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateContainerScanTaskByAppNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerScanTaskByAppNameResponseBody self = new CreateContainerScanTaskByAppNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContainerScanTaskByAppNameResponseBody setData(CreateContainerScanTaskByAppNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateContainerScanTaskByAppNameResponseBodyData getData() {
        return this.data;
    }

    public CreateContainerScanTaskByAppNameResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateContainerScanTaskByAppNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateContainerScanTaskByAppNameResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether you can create more scan tasks. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("CanCreate")
        public Boolean canCreate;

        /**
         * <p>The timestamp generated when the image information was collected. Unit: milliseconds.</p>
         */
        @NameInMap("CollectTime")
        public Long collectTime;

        /**
         * <p>The timestamp generated when the scan task started. Unit: milliseconds.</p>
         */
        @NameInMap("ExecTime")
        public Long execTime;

        /**
         * <p>The number of container applications that are scanned.</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The progress of the scan task in percentage.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The result of the scan task. Valid values:</p>
         * <br>
         * <p>*   **SUCCESS**: The task is successful.</p>
         * <p>*   **TASK_NOT_SUPPORT_REGION**: The task is not supported in the region where the image is deployed.</p>
         * <br>
         * <p>></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the scan task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **PRE_ANALYZER**: The task is being pre-processed.</p>
         * <p>*   **SUCCESS**: The task succeeds.</p>
         * <p>*   **FAIL**: The task fails.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the scan task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of container applications that you want to scan.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static CreateContainerScanTaskByAppNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerScanTaskByAppNameResponseBodyData self = new CreateContainerScanTaskByAppNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setCanCreate(Boolean canCreate) {
            this.canCreate = canCreate;
            return this;
        }
        public Boolean getCanCreate() {
            return this.canCreate;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setCollectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }
        public Long getCollectTime() {
            return this.collectTime;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setExecTime(Long execTime) {
            this.execTime = execTime;
            return this;
        }
        public Long getExecTime() {
            return this.execTime;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateContainerScanTaskByAppNameResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
