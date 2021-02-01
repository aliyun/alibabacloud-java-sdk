// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAsyncJobResultResponseBodyData data;

    public static GetAsyncJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultResponseBody self = new GetAsyncJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncJobResultResponseBody setData(GetAsyncJobResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncJobResultResponseBodyData getData() {
        return this.data;
    }

    public static class GetAsyncJobResultResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Result")
        public String result;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("JobId")
        public String jobId;

        public static GetAsyncJobResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncJobResultResponseBodyData self = new GetAsyncJobResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncJobResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAsyncJobResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAsyncJobResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAsyncJobResultResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetAsyncJobResultResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
