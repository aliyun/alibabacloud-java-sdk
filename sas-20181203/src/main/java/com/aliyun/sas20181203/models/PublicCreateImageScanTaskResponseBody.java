// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicCreateImageScanTaskResponseBody extends TeaModel {
    /**
     * <p>The data returned when the operation is successful.</p>
     */
    @NameInMap("Data")
    public PublicCreateImageScanTaskResponseBodyData data;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F9353221-40F4-5F98-B73C-2803DC804033</p>
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
         * <p>Indicates whether more scan tasks can be created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: More scan tasks can be created.</li>
         * <li><strong>false</strong>: No more scan tasks can be created.</li>
         * </ul>
         * <blockquote>
         * <p>By default, up to 10 scan tasks can exist at the same time. If the number of scan tasks exceeds 10, creating a scan task by calling this operation fails. Wait until an existing scan task is completed before creating a new scan task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanCreate")
        public Boolean canCreate;

        /**
         * <p>The timestamp when image information was collected, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644286364150</p>
         */
        @NameInMap("CollectTime")
        public Long collectTime;

        /**
         * <p>The timestamp when the scan task started running, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644286364150</p>
         */
        @NameInMap("ExecTime")
        public Long execTime;

        /**
         * <p>The number of images that have been scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The progress percentage of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The execution result of the scan task. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: The scan task succeeded.</li>
         * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The image is in a region that does not support scanning.</li>
         * </ul>
         * <blockquote>
         * <p>For the regions that support image security scanning, see the table of supported regions after the response parameters table in this topic.</p>
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
         * <li><strong>INIT</strong>: Initializing.</li>
         * <li><strong>PRE_ANALYZER</strong>: Pre-analyzing.</li>
         * <li><strong>SUCCESS</strong>: Succeeded.</li>
         * <li><strong>FAIL</strong>: Failed.</li>
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
         * <p>a410bb3e68c217a3368bc0238c66886d</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of images to scan.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
