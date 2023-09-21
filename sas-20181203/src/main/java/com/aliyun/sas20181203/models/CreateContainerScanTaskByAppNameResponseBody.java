// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskByAppNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateContainerScanTaskByAppNameResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
