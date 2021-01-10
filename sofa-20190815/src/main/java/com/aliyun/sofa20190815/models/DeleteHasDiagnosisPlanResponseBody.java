// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteHasDiagnosisPlanResponseBodyResultContent resultContent;

    public static DeleteHasDiagnosisPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisPlanResponseBody self = new DeleteHasDiagnosisPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHasDiagnosisPlanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteHasDiagnosisPlanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteHasDiagnosisPlanResponseBody setResultContent(DeleteHasDiagnosisPlanResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteHasDiagnosisPlanResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode self = new DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason self = new DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DeleteHasDiagnosisPlanResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason topErrorReason;

        public static DeleteHasDiagnosisPlanResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasDiagnosisPlanResponseBodyResultContent self = new DeleteHasDiagnosisPlanResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContent setTopErrorCode(DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteHasDiagnosisPlanResponseBodyResultContent setTopErrorReason(DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public DeleteHasDiagnosisPlanResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
