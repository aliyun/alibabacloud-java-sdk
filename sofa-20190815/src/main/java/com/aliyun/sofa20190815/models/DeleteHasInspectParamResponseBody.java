// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectParamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteHasInspectParamResponseBodyResultContent resultContent;

    public static DeleteHasInspectParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectParamResponseBody self = new DeleteHasInspectParamResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHasInspectParamResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteHasInspectParamResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteHasInspectParamResponseBody setResultContent(DeleteHasInspectParamResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteHasInspectParamResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class DeleteHasInspectParamResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static DeleteHasInspectParamResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasInspectParamResponseBodyResultContentTopErrorCode self = new DeleteHasInspectParamResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class DeleteHasInspectParamResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static DeleteHasInspectParamResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasInspectParamResponseBodyResultContentTopErrorReason self = new DeleteHasInspectParamResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasInspectParamResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DeleteHasInspectParamResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public DeleteHasInspectParamResponseBodyResultContentTopErrorReason topErrorReason;

        public static DeleteHasInspectParamResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasInspectParamResponseBodyResultContent self = new DeleteHasInspectParamResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteHasInspectParamResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteHasInspectParamResponseBodyResultContent setTopErrorCode(DeleteHasInspectParamResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public DeleteHasInspectParamResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public DeleteHasInspectParamResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasInspectParamResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteHasInspectParamResponseBodyResultContent setTopErrorReason(DeleteHasInspectParamResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public DeleteHasInspectParamResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
