// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicCreateImageScanTaskResponseBody extends TeaModel {
    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public PublicCreateImageScanTaskResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>Indicates whether you can create more image scan tasks. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>> By default, a maximum of 10 image scan tasks can be running at the same time. If 10 image scan tasks are running, you cannot create an image scan task by calling this operation. You must wait for at least one of the 10 existing image scan tasks to complete before you can create an image scan task.</p>
         */
        @NameInMap("CanCreate")
        public Boolean canCreate;

        /**
         * <p>The timestamp when the image information was collected. Unit: milliseconds.</p>
         */
        @NameInMap("CollectTime")
        public Long collectTime;

        /**
         * <p>The timestamp when the image scan task started to run. Unit: milliseconds.</p>
         */
        @NameInMap("ExecTime")
        public Long execTime;

        /**
         * <p>The number of images that have been scanned.</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The progress of the image scan task in percentage.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The result of the image scan task. Valid values:</p>
         * <br>
         * <p>*   **SUCCESS**: The task is successful.</p>
         * <p>*   **TASK_NOT_SUPPORT_REGION**: The images are deployed in a region that is not supported by container image scan.</p>
         * <br>
         * <p>> For more information about the regions supported by container image scan, see the "Regions supported by container image scan" section in this topic.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the image scan task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **PRE_ANALYZER**: The task is being pre-processed.</p>
         * <p>*   **SUCCESS**: The task is successful.</p>
         * <p>*   **FAIL**: The task fails.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the image scan task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of images to scan.</p>
         */
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
