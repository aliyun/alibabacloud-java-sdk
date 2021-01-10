// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopHasInspectTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public StopHasInspectTaskResponseBodyResultContent resultContent;

    public static StopHasInspectTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopHasInspectTaskResponseBody self = new StopHasInspectTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopHasInspectTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopHasInspectTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StopHasInspectTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public StopHasInspectTaskResponseBody setResultContent(StopHasInspectTaskResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public StopHasInspectTaskResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class StopHasInspectTaskResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static StopHasInspectTaskResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            StopHasInspectTaskResponseBodyResultContentTopErrorCode self = new StopHasInspectTaskResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class StopHasInspectTaskResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static StopHasInspectTaskResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            StopHasInspectTaskResponseBodyResultContentTopErrorReason self = new StopHasInspectTaskResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StopHasInspectTaskResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class StopHasInspectTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public StopHasInspectTaskResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public StopHasInspectTaskResponseBodyResultContentTopErrorReason topErrorReason;

        public static StopHasInspectTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            StopHasInspectTaskResponseBodyResultContent self = new StopHasInspectTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public StopHasInspectTaskResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StopHasInspectTaskResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopHasInspectTaskResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StopHasInspectTaskResponseBodyResultContent setTopErrorCode(StopHasInspectTaskResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public StopHasInspectTaskResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public StopHasInspectTaskResponseBodyResultContent setTopErrorReason(StopHasInspectTaskResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public StopHasInspectTaskResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
