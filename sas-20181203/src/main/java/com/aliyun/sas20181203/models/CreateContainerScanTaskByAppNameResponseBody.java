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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
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
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanCreate")
        public Boolean canCreate;

        /**
         * <p>The timestamp generated when the image information was collected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644286364150</p>
         */
        @NameInMap("CollectTime")
        public Long collectTime;

        /**
         * <p>The timestamp generated when the scan task started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644286364150</p>
         */
        @NameInMap("ExecTime")
        public Long execTime;

        /**
         * <p>The number of container applications that are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The progress of the scan task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The result of the scan task. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: The task is successful.</li>
         * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The task is not supported in the region where the image is deployed.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the scan task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is being initialized.</li>
         * <li><strong>PRE_ANALYZER</strong>: The task is being pre-processed.</li>
         * <li><strong>SUCCESS</strong>: The task succeeds.</li>
         * <li><strong>FAIL</strong>: The task fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>fc98d58eb56f699d49bf7ebbd6d7****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of container applications that you want to scan.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
