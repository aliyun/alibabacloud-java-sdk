// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateContainerScanTaskResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
        @NameInMap("CanCreate")
        public Boolean canCreate;

        @NameInMap("CollectTime")
        public Long collectTime;

        @NameInMap("ExecTime")
        public Long execTime;

        @NameInMap("FinishCount")
        public Integer finishCount;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

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
