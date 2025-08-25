// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAsyncJobResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>43A0AEB6-45F4-4138-8E89-E1A5D63200E3</p>
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
         * <p>{\&quot;VideoUrl\&quot;:\&quot;<a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-super-resolution/2020-03-26-02/55%3A59-XFLsuEKpPxleHl4n.mp4?Expires=1585193159&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=OqsxMwAKsFVjPO%2Brgw%2BpXHIm6v****%5C%5C%22%7D">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-super-resolution/2020-03-26-02/55%3A59-XFLsuEKpPxleHl4n.mp4?Expires=1585193159&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=OqsxMwAKsFVjPO%2Brgw%2BpXHIm6v****\\&quot;}</a></p>
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
