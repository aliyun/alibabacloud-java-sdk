// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaComprehensionJobResponseBody extends TeaModel {
    @NameInMap("MediaComprehensionJob")
    public GetMediaComprehensionJobResponseBodyMediaComprehensionJob mediaComprehensionJob;

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
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Result")
        public String result;

        @NameInMap("State")
        public String state;

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
