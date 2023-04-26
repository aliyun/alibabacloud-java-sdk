// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIJobResponseBody extends TeaModel {
    /**
     * <p>The list of job IDs. You can obtain the job ID from the PlayInfo parameter in the response to the [GetPlayInfo](~~56124~~) operation.</p>
     * <br>
     * <p>>  You can specify a maximum of 10 job IDs in a request. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("AIJobList")
    public ListAIJobResponseBodyAIJobList AIJobList;

    /**
     * <p>The error code. This parameter is returned if the value of Status is fail.</p>
     */
    @NameInMap("NonExistAIJobIds")
    public ListAIJobResponseBodyNonExistAIJobIds nonExistAIJobIds;

    /**
     * <p>The ID of the job.</p>
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
         * <p>Queries AI jobs. After a job is submitted, ApsaraVideo VOD asynchronously processes the job. You can call this operation to query the job information in real time.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **success**: The job is complete.</p>
         * <p>*   **fail**: The job failed.</p>
         * <p>*   **init**: The job is being initialized.</p>
         * <p>*   **Processing**: The job is in progress.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>{"OrigASRData":{"AsrTextList":\[{"EndTime":700,"StartTime":0,"Text":"Yes.","ChannelId":0,"SpeechRate":85},{"EndTime":3750,"StartTime":1630,"Text":"No.","ChannelId":0,"SpeechRate":28},{"EndTime":5910,"StartTime":4020,"Text":"Of course.","ChannelId":0,"SpeechRate":95},{"EndTime":12750,"StartTime":10090,"Text":"Message.","ChannelId":0,"SpeechRate":45},{"EndTime":25230,"StartTime":13590,"Text":"Hello, good afternoon.","ChannelId":0,"SpeechRate":20},{"EndTime":30000,"StartTime":28220,"Text":"Yes.","ChannelId":0,"SpeechRate":33}],"Duration":"30016"}}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The ID of the video.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Message")
        public String message;

        /**
         * <p>The error message. This parameter is returned if the value of Status is fail.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The returned data. The value is a JSON string.</p>
         * <br>
         * <p>For more information, see [AITemplateConfig](~~89863~~).</p>
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
