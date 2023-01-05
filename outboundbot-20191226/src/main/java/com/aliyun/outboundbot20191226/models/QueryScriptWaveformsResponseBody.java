// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptWaveformsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScriptWaveforms")
    public java.util.List<QueryScriptWaveformsResponseBodyScriptWaveforms> scriptWaveforms;

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
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("ScriptContent")
        public String scriptContent;

        @NameInMap("ScriptId")
        public String scriptId;

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
