// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadScriptRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DownloadParams")
    public DownloadScriptRecordingResponseBodyDownloadParams downloadParams;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadScriptRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadScriptRecordingResponseBody self = new DownloadScriptRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadScriptRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadScriptRecordingResponseBody setDownloadParams(DownloadScriptRecordingResponseBodyDownloadParams downloadParams) {
        this.downloadParams = downloadParams;
        return this;
    }
    public DownloadScriptRecordingResponseBodyDownloadParams getDownloadParams() {
        return this.downloadParams;
    }

    public DownloadScriptRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadScriptRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadScriptRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadScriptRecordingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadScriptRecordingResponseBodyDownloadParams extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("SignatureUrl")
        public String signatureUrl;

        public static DownloadScriptRecordingResponseBodyDownloadParams build(java.util.Map<String, ?> map) throws Exception {
            DownloadScriptRecordingResponseBodyDownloadParams self = new DownloadScriptRecordingResponseBodyDownloadParams();
            return TeaModel.build(map, self);
        }

        public DownloadScriptRecordingResponseBodyDownloadParams setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DownloadScriptRecordingResponseBodyDownloadParams setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

    }

}
