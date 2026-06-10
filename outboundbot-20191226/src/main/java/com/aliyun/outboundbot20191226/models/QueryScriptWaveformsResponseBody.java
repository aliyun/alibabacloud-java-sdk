// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptWaveformsResponseBody extends TeaModel {
    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Recording list of scenario voices</p>
     * <blockquote>
     * <p>Recording data is returned only when the voice type is recording. It is not returned when the voice is speech synthesis.</p>
     * </blockquote>
     */
    @NameInMap("ScriptWaveforms")
    public java.util.List<QueryScriptWaveformsResponseBodyScriptWaveforms> scriptWaveforms;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryScriptWaveformsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptWaveformsResponseBody self = new QueryScriptWaveformsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScriptWaveformsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryScriptWaveformsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryScriptWaveformsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryScriptWaveformsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScriptWaveformsResponseBody setScriptWaveforms(java.util.List<QueryScriptWaveformsResponseBodyScriptWaveforms> scriptWaveforms) {
        this.scriptWaveforms = scriptWaveforms;
        return this;
    }
    public java.util.List<QueryScriptWaveformsResponseBodyScriptWaveforms> getScriptWaveforms() {
        return this.scriptWaveforms;
    }

    public QueryScriptWaveformsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryScriptWaveformsResponseBodyScriptWaveforms extends TeaModel {
        /**
         * <p>File key in OSS</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOADED/RECORDING/a8xxxxx-2b26-4b6d-a54f-696b95xxx1/a6bf591a-cf6d-4xxxxxx.wav</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>Recording file name</p>
         * 
         * <strong>example:</strong>
         * <p>SHUKE_ZA_ol_32_邀约.wav</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Scenario voice name</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("ScriptContent")
        public String scriptContent;

        /**
         * <p>Scenario ID</p>
         * 
         * <strong>example:</strong>
         * <p>25b26ce1-009c-4791-a720-e7ac4f9821a1</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>Scenario voice recording ID</p>
         * 
         * <strong>example:</strong>
         * <p>444df4-009c-4791-a720-e7ac4f9821a1</p>
         */
        @NameInMap("ScriptWaveformId")
        public String scriptWaveformId;

        public static QueryScriptWaveformsResponseBodyScriptWaveforms build(java.util.Map<String, ?> map) throws Exception {
            QueryScriptWaveformsResponseBodyScriptWaveforms self = new QueryScriptWaveformsResponseBodyScriptWaveforms();
            return TeaModel.build(map, self);
        }

        public QueryScriptWaveformsResponseBodyScriptWaveforms setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryScriptWaveformsResponseBodyScriptWaveforms setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryScriptWaveformsResponseBodyScriptWaveforms setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

        public QueryScriptWaveformsResponseBodyScriptWaveforms setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public QueryScriptWaveformsResponseBodyScriptWaveforms setScriptWaveformId(String scriptWaveformId) {
            this.scriptWaveformId = scriptWaveformId;
            return this;
        }
        public String getScriptWaveformId() {
            return this.scriptWaveformId;
        }

    }

}
