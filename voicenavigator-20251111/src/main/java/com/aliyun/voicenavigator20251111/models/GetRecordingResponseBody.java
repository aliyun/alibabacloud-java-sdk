// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRecordingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRecordingResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F132DDBA-66C4-5BD3-BF7E-9642FE877158</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordingResponseBody self = new GetRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRecordingResponseBody setData(GetRecordingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRecordingResponseBodyData getData() {
        return this.data;
    }

    public GetRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordingResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRecordingResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>61f7f225-3a2e-4b6e-8a1d-888f1862590f.wav</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bgc-us-east.oss-accelerate.aliyuncs.com/intellidocs/2025-08-27/bc84ce11-f110-436d-af70-382ce7c5690a.pdf">https://bgc-us-east.oss-accelerate.aliyuncs.com/intellidocs/2025-08-27/bc84ce11-f110-436d-af70-382ce7c5690a.pdf</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>f814f3ae-b2a7-44fb-883c-771221274673</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static GetRecordingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordingResponseBodyData self = new GetRecordingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecordingResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetRecordingResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetRecordingResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
