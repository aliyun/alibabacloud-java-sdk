// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasInspectRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CloneHasInspectRuleResponseBodyResultContent resultContent;

    public static CloneHasInspectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneHasInspectRuleResponseBody self = new CloneHasInspectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneHasInspectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneHasInspectRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CloneHasInspectRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CloneHasInspectRuleResponseBody setResultContent(CloneHasInspectRuleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CloneHasInspectRuleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CloneHasInspectRuleResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CloneHasInspectRuleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CloneHasInspectRuleResponseBodyResultContentTopErrorCode self = new CloneHasInspectRuleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CloneHasInspectRuleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CloneHasInspectRuleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CloneHasInspectRuleResponseBodyResultContentTopErrorReason self = new CloneHasInspectRuleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CloneHasInspectRuleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CloneHasInspectRuleResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CloneHasInspectRuleResponseBodyResultContentTopErrorReason topErrorReason;

        public static CloneHasInspectRuleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CloneHasInspectRuleResponseBodyResultContent self = new CloneHasInspectRuleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CloneHasInspectRuleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CloneHasInspectRuleResponseBodyResultContent setTopErrorCode(CloneHasInspectRuleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CloneHasInspectRuleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CloneHasInspectRuleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CloneHasInspectRuleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CloneHasInspectRuleResponseBodyResultContent setTopErrorReason(CloneHasInspectRuleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CloneHasInspectRuleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
