// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicCreateImageScanTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public PublicCreateImageScanTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static PublicCreateImageScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublicCreateImageScanTaskResponseBody self = new PublicCreateImageScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PublicCreateImageScanTaskResponseBody setData(PublicCreateImageScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PublicCreateImageScanTaskResponseBodyData getData() {
        return this.data;
    }

    public PublicCreateImageScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PublicCreateImageScanTaskResponseBodyData extends TeaModel {
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

        public static PublicCreateImageScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PublicCreateImageScanTaskResponseBodyData self = new PublicCreateImageScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PublicCreateImageScanTaskResponseBodyData setCanCreate(Boolean canCreate) {
            this.canCreate = canCreate;
            return this;
        }
        public Boolean getCanCreate() {
            return this.canCreate;
        }

        public PublicCreateImageScanTaskResponseBodyData setCollectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }
        public Long getCollectTime() {
            return this.collectTime;
        }

        public PublicCreateImageScanTaskResponseBodyData setExecTime(Long execTime) {
            this.execTime = execTime;
            return this;
        }
        public Long getExecTime() {
            return this.execTime;
        }

        public PublicCreateImageScanTaskResponseBodyData setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public PublicCreateImageScanTaskResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public PublicCreateImageScanTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public PublicCreateImageScanTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PublicCreateImageScanTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PublicCreateImageScanTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
