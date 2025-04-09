// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadRecordingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DownloadParams")
    public DownloadRecordingResponseBodyDownloadParams downloadParams;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DownloadRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingResponseBody self = new DownloadRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadRecordingResponseBody setDownloadParams(DownloadRecordingResponseBodyDownloadParams downloadParams) {
        this.downloadParams = downloadParams;
        return this;
    }
    public DownloadRecordingResponseBodyDownloadParams getDownloadParams() {
        return this.downloadParams;
    }

    public DownloadRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadRecordingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadRecordingResponseBodyDownloadParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>281eb174-3865-41c1-9274-7b6813edadab.wav</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&OSSAccessKeyId=LTAI****cqw&Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D">http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&amp;OSSAccessKeyId=LTAI****cqw&amp;Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D</a></p>
         */
        @NameInMap("SignatureUrl")
        public String signatureUrl;

        @NameInMap("VoiceSliceRecordingListJson")
        public String voiceSliceRecordingListJson;

        public static DownloadRecordingResponseBodyDownloadParams build(java.util.Map<String, ?> map) throws Exception {
            DownloadRecordingResponseBodyDownloadParams self = new DownloadRecordingResponseBodyDownloadParams();
            return TeaModel.build(map, self);
        }

        public DownloadRecordingResponseBodyDownloadParams setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DownloadRecordingResponseBodyDownloadParams setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

        public DownloadRecordingResponseBodyDownloadParams setVoiceSliceRecordingListJson(String voiceSliceRecordingListJson) {
            this.voiceSliceRecordingListJson = voiceSliceRecordingListJson;
            return this;
        }
        public String getVoiceSliceRecordingListJson() {
            return this.voiceSliceRecordingListJson;
        }

    }

}
