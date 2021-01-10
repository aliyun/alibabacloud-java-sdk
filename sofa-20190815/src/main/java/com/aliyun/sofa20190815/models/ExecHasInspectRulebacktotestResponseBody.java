// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRulebacktotestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasInspectRulebacktotestResponseBodyResultContent resultContent;

    public static ExecHasInspectRulebacktotestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRulebacktotestResponseBody self = new ExecHasInspectRulebacktotestResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRulebacktotestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasInspectRulebacktotestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasInspectRulebacktotestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasInspectRulebacktotestResponseBody setResultContent(ExecHasInspectRulebacktotestResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasInspectRulebacktotestResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode self = new ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason self = new ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasInspectRulebacktotestResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasInspectRulebacktotestResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectRulebacktotestResponseBodyResultContent self = new ExecHasInspectRulebacktotestResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContent setTopErrorCode(ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasInspectRulebacktotestResponseBodyResultContent setTopErrorReason(ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasInspectRulebacktotestResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
