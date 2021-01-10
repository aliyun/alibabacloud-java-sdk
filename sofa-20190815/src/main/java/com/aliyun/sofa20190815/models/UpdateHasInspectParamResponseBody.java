// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectParamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UpdateHasInspectParamResponseBodyResultContent resultContent;

    public static UpdateHasInspectParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectParamResponseBody self = new UpdateHasInspectParamResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHasInspectParamResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateHasInspectParamResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateHasInspectParamResponseBody setResultContent(UpdateHasInspectParamResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateHasInspectParamResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UpdateHasInspectParamResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static UpdateHasInspectParamResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectParamResponseBodyResultContentTopErrorCode self = new UpdateHasInspectParamResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateHasInspectParamResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UpdateHasInspectParamResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectParamResponseBodyResultContentTopErrorReason self = new UpdateHasInspectParamResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasInspectParamResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateHasInspectParamResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UpdateHasInspectParamResponseBodyResultContentTopErrorReason topErrorReason;

        public static UpdateHasInspectParamResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectParamResponseBodyResultContent self = new UpdateHasInspectParamResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectParamResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasInspectParamResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateHasInspectParamResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateHasInspectParamResponseBodyResultContent setTopErrorCode(UpdateHasInspectParamResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UpdateHasInspectParamResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UpdateHasInspectParamResponseBodyResultContent setTopErrorReason(UpdateHasInspectParamResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UpdateHasInspectParamResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
