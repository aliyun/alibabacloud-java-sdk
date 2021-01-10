// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisGraphnodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteHasDiagnosisGraphnodeResponseBodyResultContent resultContent;

    public static DeleteHasDiagnosisGraphnodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisGraphnodeResponseBody self = new DeleteHasDiagnosisGraphnodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisGraphnodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHasDiagnosisGraphnodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteHasDiagnosisGraphnodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteHasDiagnosisGraphnodeResponseBody setResultContent(DeleteHasDiagnosisGraphnodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteHasDiagnosisGraphnodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode self = new DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason self = new DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DeleteHasDiagnosisGraphnodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static DeleteHasDiagnosisGraphnodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisGraphnodeResponseBodyResultContent self = new DeleteHasDiagnosisGraphnodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContent setTopErrorCode(DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteHasDiagnosisGraphnodeResponseBodyResultContent setTopErrorReason(DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public DeleteHasDiagnosisGraphnodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
