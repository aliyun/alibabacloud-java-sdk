// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAsyncJobResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>6BD843FB-E7B9-45B6-ADE1-9AB1FF450148</p>
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
         * <p>49E2CC28-ED1D-4CC5-854D-7D0AE2B20976</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;VideoUrl\&quot;:\&quot;<a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/film-summary/49E2CC28-ED1D-4CC5-854D-7D0AE2B20976_rf8mv0.mp4?Expires=1585111875&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=7uE0ppt6uwkdwAFz73PPZN4KG7****%5C%5C%22%7D">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/film-summary/49E2CC28-ED1D-4CC5-854D-7D0AE2B20976_rf8mv0.mp4?Expires=1585111875&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=7uE0ppt6uwkdwAFz73PPZN4KG7****\\&quot;}</a></p>
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
