// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DownloadParams")
    public DownloadRecordingResponseBodyDownloadParams downloadParams;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("FileName")
        public String fileName;

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
