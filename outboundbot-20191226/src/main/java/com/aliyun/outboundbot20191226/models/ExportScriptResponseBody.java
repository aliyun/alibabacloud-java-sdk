// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ExportScriptResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The signed URL that you can use to download the script. This parameter is returned only for legacy canvases.</p>
     */
    @NameInMap("DownloadParams")
    public ExportScriptResponseBodyDownloadParams downloadParams;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The download URL. This parameter is returned only for legacy canvases.</p>
         * <blockquote>
         * <p><strong>For modern canvases</strong>: After the scenario is exported, call the <strong>ListDownloadTasks</strong> operation to obtain the \<code>TaskId\\</code> (for example, \<code>5d352db754fe430xxxxxxx\\</code>) and \<code>FileId\\</code> (for example, \<code>5d000f3f6eae4228b2731427xxxxxx\\</code>). Then, call the <strong>CreateDownloadUrl</strong> operation to obtain the download URL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&OSSAccessKeyId=LTAI****cqw&Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D">http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&amp;OSSAccessKeyId=LTAI****cqw&amp;Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D</a></p>
         */
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
