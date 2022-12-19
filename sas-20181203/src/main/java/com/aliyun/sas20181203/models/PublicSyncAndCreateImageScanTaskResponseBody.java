// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskResponseBody extends TeaModel {
    // The data returned if the call is successful.
    @NameInMap("Data")
    public PublicSyncAndCreateImageScanTaskResponseBodyData data;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // Indicates whether you can create more image scan tasks. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        // 
        // >  By default, a maximum of 10 image scan tasks can be running at the same time. If 10 image scan tasks are running, you cannot create an image scan task by calling this operation. You must wait for at least one of the 10 existing image scan tasks to complete before you can create an image scan task.
        @NameInMap("CanCreate")
        public Boolean canCreate;

        // The timestamp when the image information was collected. Unit: milliseconds.
        @NameInMap("CollectTime")
        public Long collectTime;

        // The timestamp when the image scan task started to run. Unit: milliseconds.
        @NameInMap("ExecTime")
        public Long execTime;

        // The number of images that have been scanned.
        @NameInMap("FinishCount")
        public Integer finishCount;

        // The progress of the image scan task.
        @NameInMap("Progress")
        public Integer progress;

        // The result of the image scan task. Valid values:
        // 
        // *   **SUCCESS**: The task is successful.
        // *   **TASK\_NOT\_SUPPORT_REGION**: The image is deployed in a region that is not supported by container image scan.
        @NameInMap("Result")
        public String result;

        // The status of the image scan task. Valid values:
        // 
        // *   **INIT**: The task is being initialized.
        // *   **PRE_ANALYZER**: The task is being pre-processed.
        // *   **SUCCESS**: The task is successful.
        // *   **FAIL**: The task failed.
        @NameInMap("Status")
        public String status;

        // The ID of the image scan task.
        @NameInMap("TaskId")
        public String taskId;

        // The total number of images to scan.
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
