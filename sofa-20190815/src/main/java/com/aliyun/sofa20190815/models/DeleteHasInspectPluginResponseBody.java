// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectPluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteHasInspectPluginResponseBodyResultContent resultContent;

    public static DeleteHasInspectPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectPluginResponseBody self = new DeleteHasInspectPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHasInspectPluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteHasInspectPluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteHasInspectPluginResponseBody setResultContent(DeleteHasInspectPluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteHasInspectPluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class DeleteHasInspectPluginResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static DeleteHasInspectPluginResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasInspectPluginResponseBodyResultContentTopErrorCode self = new DeleteHasInspectPluginResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class DeleteHasInspectPluginResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static DeleteHasInspectPluginResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasInspectPluginResponseBodyResultContentTopErrorReason self = new DeleteHasInspectPluginResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasInspectPluginResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DeleteHasInspectPluginResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public DeleteHasInspectPluginResponseBodyResultContentTopErrorReason topErrorReason;

        public static DeleteHasInspectPluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteHasInspectPluginResponseBodyResultContent self = new DeleteHasInspectPluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteHasInspectPluginResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteHasInspectPluginResponseBodyResultContent setTopErrorCode(DeleteHasInspectPluginResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public DeleteHasInspectPluginResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public DeleteHasInspectPluginResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteHasInspectPluginResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteHasInspectPluginResponseBodyResultContent setTopErrorReason(DeleteHasInspectPluginResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public DeleteHasInspectPluginResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
