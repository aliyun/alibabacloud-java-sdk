// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportHasDiagnosisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ImportHasDiagnosisResponseBodyResultContent resultContent;

    public static ImportHasDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportHasDiagnosisResponseBody self = new ImportHasDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportHasDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportHasDiagnosisResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportHasDiagnosisResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportHasDiagnosisResponseBody setResultContent(ImportHasDiagnosisResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ImportHasDiagnosisResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ImportHasDiagnosisResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ImportHasDiagnosisResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ImportHasDiagnosisResponseBodyResultContentTopErrorCode self = new ImportHasDiagnosisResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ImportHasDiagnosisResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ImportHasDiagnosisResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ImportHasDiagnosisResponseBodyResultContentTopErrorReason self = new ImportHasDiagnosisResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImportHasDiagnosisResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ImportHasDiagnosisResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public Boolean data;

        @NameInMap("TopErrorCode")
        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ImportHasDiagnosisResponseBodyResultContentTopErrorReason topErrorReason;

        public static ImportHasDiagnosisResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ImportHasDiagnosisResponseBodyResultContent self = new ImportHasDiagnosisResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ImportHasDiagnosisResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImportHasDiagnosisResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ImportHasDiagnosisResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ImportHasDiagnosisResponseBodyResultContent setData(Boolean data) {
            this.data = data;
            return this;
        }
        public Boolean getData() {
            return this.data;
        }

        public ImportHasDiagnosisResponseBodyResultContent setTopErrorCode(ImportHasDiagnosisResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ImportHasDiagnosisResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ImportHasDiagnosisResponseBodyResultContent setTopErrorReason(ImportHasDiagnosisResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ImportHasDiagnosisResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
