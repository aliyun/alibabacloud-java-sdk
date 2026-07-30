// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaComprehensionJobResponseBody extends TeaModel {
    /**
     * <p>The media asset content understanding result object.</p>
     */
    @NameInMap("Job")
    public GetMediaComprehensionJobResponseBodyJob job;

    /**
     * <p>The media asset content understanding object. This parameter is deprecated.</p>
     */
    @NameInMap("MediaComprehensionJob")
    public GetMediaComprehensionJobResponseBodyMediaComprehensionJob mediaComprehensionJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaComprehensionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaComprehensionJobResponseBody self = new GetMediaComprehensionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaComprehensionJobResponseBody setJob(GetMediaComprehensionJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetMediaComprehensionJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetMediaComprehensionJobResponseBody setMediaComprehensionJob(GetMediaComprehensionJobResponseBodyMediaComprehensionJob mediaComprehensionJob) {
        this.mediaComprehensionJob = mediaComprehensionJob;
        return this;
    }
    public GetMediaComprehensionJobResponseBodyMediaComprehensionJob getMediaComprehensionJob() {
        return this.mediaComprehensionJob;
    }

    public GetMediaComprehensionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaComprehensionJobResponseBodyJob extends TeaModel {
        /**
         * <p>The error code. This parameter is returned when the job is in the Failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. This parameter is returned when the job is in the Failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified product does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The list of media asset IDs. If the input is a URL, the media asset ID registered after input is returned.</p>
         */
        @NameInMap("MediaIds")
        public java.util.List<String> mediaIds;

        /**
         * <p>The URL of the analysis result file. The file content is in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.json">http://xxxx.json</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The file status. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong>: Created.</li>
         * <li><strong>Executing</strong>: Executing.</li>
         * <li><strong>Finished</strong>: Finished.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Deleted</strong>: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user-defined parameter, which is a JSON-formatted string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetMediaComprehensionJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetMediaComprehensionJobResponseBodyJob self = new GetMediaComprehensionJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetMediaComprehensionJobResponseBodyJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMediaComprehensionJobResponseBodyJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetMediaComprehensionJobResponseBodyJob setMediaIds(java.util.List<String> mediaIds) {
            this.mediaIds = mediaIds;
            return this;
        }
        public java.util.List<String> getMediaIds() {
            return this.mediaIds;
        }

        public GetMediaComprehensionJobResponseBodyJob setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetMediaComprehensionJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaComprehensionJobResponseBodyJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class GetMediaComprehensionJobResponseBodyMediaComprehensionJob extends TeaModel {
        /**
         * <p>The error code. This parameter is returned when the job is in the <code>Failed</code> state.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. This parameter is returned when the job is in the Failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified product does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>afaa6f37457</strong></strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>307e9971f1</strong></strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The analysis result, which is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;source_video_url\&quot;:\&quot;<a href="http://xxx.mp4%5C%5C%22,%5C%5C%22narrative_overview%5C%5C%22:%7B******%7D%7D">http://xxx.mp4\\&quot;,\\&quot;narrative_overview\\&quot;:{******}}</a>&quot;</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The file status. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong>: Created.</li>
         * <li><strong>Executing</strong>: Executing.</li>
         * <li><strong>Finished</strong>: Finished.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Deleted</strong>: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The user-defined parameter, which is a JSON-formatted string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetMediaComprehensionJobResponseBodyMediaComprehensionJob build(java.util.Map<String, ?> map) throws Exception {
            GetMediaComprehensionJobResponseBodyMediaComprehensionJob self = new GetMediaComprehensionJobResponseBodyMediaComprehensionJob();
            return TeaModel.build(map, self);
        }

        public GetMediaComprehensionJobResponseBodyMediaComprehensionJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMediaComprehensionJobResponseBodyMediaComprehensionJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetMediaComprehensionJobResponseBodyMediaComprehensionJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetMediaComprehensionJobResponseBodyMediaComprehensionJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaComprehensionJobResponseBodyMediaComprehensionJob setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetMediaComprehensionJobResponseBodyMediaComprehensionJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMediaComprehensionJobResponseBodyMediaComprehensionJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
