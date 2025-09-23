// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAsyncJobResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>87FC80D2-2571-4BBD-BD61-AFF7912C556D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAsyncJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultResponseBody self = new GetAsyncJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultResponseBody setData(GetAsyncJobResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncJobResultResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAsyncJobResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>paramsIllegal</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>35B11E1B-800C-4598-B5AA-577E3BDBD917</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;inputFile\&quot;:\&quot;oss://public-vigen-video/guotian.xgt/test_images/test_video\&quot;,\&quot;width\&quot;:1280,\&quot;height\&quot;:720,\&quot;frames\&quot;:[{\&quot;time\&quot;:6124533574,\&quot;elements\&quot;:[{\&quot;type\&quot;:\&quot;PERSON\&quot;,\&quot;score\&quot;:0.7812,\&quot;x\&quot;:289,\&quot;y\&quot;:271,\&quot;width\&quot;:100,\&quot;height\&quot;:156},{\&quot;type\&quot;:\&quot;PERSON\&quot;,\&quot;score\&quot;:0.4377,\&quot;x\&quot;:917,\&quot;y\&quot;:267,\&quot;width\&quot;:34,\&quot;height\&quot;:51}]}]}]}&quot;}</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>PROCESS_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAsyncJobResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncJobResultResponseBodyData self = new GetAsyncJobResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncJobResultResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetAsyncJobResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAsyncJobResultResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAsyncJobResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAsyncJobResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
