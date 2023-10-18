// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIJobResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("AIJobList")
    public ListAIJobResponseBodyAIJobList AIJobList;

    /**
     * <p>The IDs of the jobs that do not exist.</p>
     */
    @NameInMap("NonExistAIJobIds")
    public ListAIJobResponseBodyNonExistAIJobIds nonExistAIJobIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIJobResponseBody self = new ListAIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIJobResponseBody setAIJobList(ListAIJobResponseBodyAIJobList AIJobList) {
        this.AIJobList = AIJobList;
        return this;
    }
    public ListAIJobResponseBodyAIJobList getAIJobList() {
        return this.AIJobList;
    }

    public ListAIJobResponseBody setNonExistAIJobIds(ListAIJobResponseBodyNonExistAIJobIds nonExistAIJobIds) {
        this.nonExistAIJobIds = nonExistAIJobIds;
        return this;
    }
    public ListAIJobResponseBodyNonExistAIJobIds getNonExistAIJobIds() {
        return this.nonExistAIJobIds;
    }

    public ListAIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIJobResponseBodyAIJobListAIJob extends TeaModel {
        /**
         * <p>The error code. This parameter is returned if the value of Status is fail.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The returned data. The value is a JSON string. For more information, see [AITemplateConfig](~~89863~~).</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The job ID.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the video file.</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The error message. This parameter is returned if the value of Status is fail.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **success**: The job is successful.</p>
         * <p>*   **fail**: The job failed.</p>
         * <p>*   **init**: The job is being initialized.</p>
         * <p>*   **Processing**: The job is in progress.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the job. Valid values:</p>
         * <br>
         * <p>*   **AIMediaDNA**: video fingerprinting</p>
         * <p>*   **AIVideoTag**: smart tagging</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAIJobResponseBodyAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseBodyAIJobListAIJob self = new ListAIJobResponseBodyAIJobListAIJob();
            return TeaModel.build(map, self);
        }

        public ListAIJobResponseBodyAIJobListAIJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIJobResponseBodyAIJobListAIJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListAIJobResponseBodyAIJobListAIJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIJobResponseBodyAIJobListAIJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIJobResponseBodyAIJobListAIJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIJobResponseBodyAIJobListAIJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIJobResponseBodyAIJobListAIJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIJobResponseBodyAIJobListAIJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAIJobResponseBodyAIJobListAIJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAIJobResponseBodyAIJobList extends TeaModel {
        @NameInMap("AIJob")
        public java.util.List<ListAIJobResponseBodyAIJobListAIJob> AIJob;

        public static ListAIJobResponseBodyAIJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseBodyAIJobList self = new ListAIJobResponseBodyAIJobList();
            return TeaModel.build(map, self);
        }

        public ListAIJobResponseBodyAIJobList setAIJob(java.util.List<ListAIJobResponseBodyAIJobListAIJob> AIJob) {
            this.AIJob = AIJob;
            return this;
        }
        public java.util.List<ListAIJobResponseBodyAIJobListAIJob> getAIJob() {
            return this.AIJob;
        }

    }

    public static class ListAIJobResponseBodyNonExistAIJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIJobResponseBodyNonExistAIJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseBodyNonExistAIJobIds self = new ListAIJobResponseBodyNonExistAIJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIJobResponseBodyNonExistAIJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
