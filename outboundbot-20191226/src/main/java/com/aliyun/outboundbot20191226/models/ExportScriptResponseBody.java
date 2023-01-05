// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ExportScriptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DownloadParams")
    public ExportScriptResponseBodyDownloadParams downloadParams;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExportScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportScriptResponseBody self = new ExportScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportScriptResponseBody setDownloadParams(ExportScriptResponseBodyDownloadParams downloadParams) {
        this.downloadParams = downloadParams;
        return this;
    }
    public ExportScriptResponseBodyDownloadParams getDownloadParams() {
        return this.downloadParams;
    }

    public ExportScriptResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportScriptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportScriptResponseBodyDownloadParams extends TeaModel {
        @NameInMap("SignatureUrl")
        public String signatureUrl;

        public static ExportScriptResponseBodyDownloadParams build(java.util.Map<String, ?> map) throws Exception {
            ExportScriptResponseBodyDownloadParams self = new ExportScriptResponseBodyDownloadParams();
            return TeaModel.build(map, self);
        }

        public ExportScriptResponseBodyDownloadParams setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

    }

}
