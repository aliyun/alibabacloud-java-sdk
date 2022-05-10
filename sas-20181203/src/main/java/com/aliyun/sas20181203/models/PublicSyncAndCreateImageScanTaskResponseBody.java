// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public PublicSyncAndCreateImageScanTaskResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static PublicSyncAndCreateImageScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublicSyncAndCreateImageScanTaskResponseBody self = new PublicSyncAndCreateImageScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PublicSyncAndCreateImageScanTaskResponseBody setData(PublicSyncAndCreateImageScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PublicSyncAndCreateImageScanTaskResponseBodyData getData() {
        return this.data;
    }

    public PublicSyncAndCreateImageScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PublicSyncAndCreateImageScanTaskResponseBodyData extends TeaModel {
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

        public static PublicSyncAndCreateImageScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PublicSyncAndCreateImageScanTaskResponseBodyData self = new PublicSyncAndCreateImageScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setCanCreate(Boolean canCreate) {
            this.canCreate = canCreate;
            return this;
        }
        public Boolean getCanCreate() {
            return this.canCreate;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setCollectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }
        public Long getCollectTime() {
            return this.collectTime;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setExecTime(Long execTime) {
            this.execTime = execTime;
            return this;
        }
        public Long getExecTime() {
            return this.execTime;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
