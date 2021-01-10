// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportHasInspectEnvResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ImportHasInspectEnvResponseBodyResultContent resultContent;

    public static ImportHasInspectEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportHasInspectEnvResponseBody self = new ImportHasInspectEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportHasInspectEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportHasInspectEnvResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportHasInspectEnvResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportHasInspectEnvResponseBody setResultContent(ImportHasInspectEnvResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ImportHasInspectEnvResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ImportHasInspectEnvResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static ImportHasInspectEnvResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ImportHasInspectEnvResponseBodyResultContentTopErrorCode self = new ImportHasInspectEnvResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ImportHasInspectEnvResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ImportHasInspectEnvResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ImportHasInspectEnvResponseBodyResultContentTopErrorReason self = new ImportHasInspectEnvResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImportHasInspectEnvResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ImportHasInspectEnvResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public Boolean data;

        @NameInMap("TopErrorCode")
        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ImportHasInspectEnvResponseBodyResultContentTopErrorReason topErrorReason;

        public static ImportHasInspectEnvResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ImportHasInspectEnvResponseBodyResultContent self = new ImportHasInspectEnvResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ImportHasInspectEnvResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImportHasInspectEnvResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ImportHasInspectEnvResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ImportHasInspectEnvResponseBodyResultContent setData(Boolean data) {
            this.data = data;
            return this;
        }
        public Boolean getData() {
            return this.data;
        }

        public ImportHasInspectEnvResponseBodyResultContent setTopErrorCode(ImportHasInspectEnvResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ImportHasInspectEnvResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ImportHasInspectEnvResponseBodyResultContent setTopErrorReason(ImportHasInspectEnvResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ImportHasInspectEnvResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
