// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaComprehensionJobResponseBody extends TeaModel {
    @NameInMap("MediaComprehensionJob")
    public GetMediaComprehensionJobResponseBodyMediaComprehensionJob mediaComprehensionJob;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaComprehensionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaComprehensionJobResponseBody self = new GetMediaComprehensionJobResponseBody();
        return TeaModel.build(map, self);
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

    public static class GetMediaComprehensionJobResponseBodyMediaComprehensionJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>The specified product does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p><strong><strong><strong>afaa6f37457</strong></strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p><strong><strong><strong>307e9971f1</strong></strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;source_video_url\&quot;:\&quot;<a href="http://xxx.mp4%5C%5C%22,%5C%5C%22narrative_overview%5C%5C%22:%7B******%7D%7D">http://xxx.mp4\\&quot;,\\&quot;narrative_overview\\&quot;:{******}}</a>&quot;</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("State")
        public String state;

        /**
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
