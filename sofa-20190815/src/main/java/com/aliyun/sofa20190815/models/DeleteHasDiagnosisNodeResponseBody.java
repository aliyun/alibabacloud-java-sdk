// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteHasDiagnosisNodeResponseBodyResultContent resultContent;

    public static DeleteHasDiagnosisNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisNodeResponseBody self = new DeleteHasDiagnosisNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHasDiagnosisNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteHasDiagnosisNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteHasDiagnosisNodeResponseBody setResultContent(DeleteHasDiagnosisNodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteHasDiagnosisNodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Level")
        public String level;

        @NameInMap("Scene")
        public String scene;

        public static DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode self = new DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason self = new DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DeleteHasDiagnosisNodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static DeleteHasDiagnosisNodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisNodeResponseBodyResultContent self = new DeleteHasDiagnosisNodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContent setTopErrorCode(DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteHasDiagnosisNodeResponseBodyResultContent setTopErrorReason(DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public DeleteHasDiagnosisNodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
