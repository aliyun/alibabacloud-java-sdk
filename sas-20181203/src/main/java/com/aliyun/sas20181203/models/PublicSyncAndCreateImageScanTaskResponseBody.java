// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskResponseBody extends TeaModel {
    /**
     * <p>The total number of images to scan.</p>
     */
    @NameInMap("Data")
    public PublicSyncAndCreateImageScanTaskResponseBodyData data;

    /**
     * <p>The data returned if the call is successful.</p>
     */
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

        /**
         * <p>PublicSyncAndCreateImageScanTask</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Adds images to Security Center and creates an image scan task to scan the images.</p>
         */
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
