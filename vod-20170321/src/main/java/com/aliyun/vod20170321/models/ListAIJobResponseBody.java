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
     * 
     * <strong>example:</strong>
     * <p>8233A0E4-E112-44*****58-2BCED1B88173</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-28T02:04:47Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-28T02:04:32Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The returned data. The value is a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/89863.html">AITemplateConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OrigASRData&quot;:{&quot;AsrTextList&quot;:[{&quot;EndTime&quot;:700,&quot;StartTime&quot;:0,&quot;Text&quot;:&quot;Yes.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:85},{&quot;EndTime&quot;:3750,&quot;StartTime&quot;:1630,&quot;Text&quot;:&quot;No.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:28},{&quot;EndTime&quot;:5910,&quot;StartTime&quot;:4020,&quot;Text&quot;:&quot;Of course.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:95},{&quot;EndTime&quot;:12750,&quot;StartTime&quot;:10090,&quot;Text&quot;:&quot;Message.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:45},{&quot;EndTime&quot;:25230,&quot;StartTime&quot;:13590,&quot;Text&quot;:&quot;Hello, good afternoon.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:20},{&quot;EndTime&quot;:30000,&quot;StartTime&quot;:28220,&quot;Text&quot;:&quot;Yes.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:33}],&quot;Duration&quot;:&quot;30016&quot;}}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a718a3a1e8bb42ee3bc88921e94****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the video file.</p>
         * 
         * <strong>example:</strong>
         * <p>3D3D12340d9401fab46a0b847****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The error message. This parameter is returned if the value of Status is fail.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The job is successful.</li>
         * <li><strong>fail</strong>: The job failed.</li>
         * <li><strong>init</strong>: The job is being initialized.</li>
         * <li><strong>Processing</strong>: The job is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the job. Valid values:</p>
         * <ul>
         * <li><strong>AIMediaDNA</strong>: video fingerprinting</li>
         * <li><strong>AIVideoTag</strong>: smart tagging</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AIVideoTag</p>
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
