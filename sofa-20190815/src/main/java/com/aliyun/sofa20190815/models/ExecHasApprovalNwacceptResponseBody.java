// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwacceptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasApprovalNwacceptResponseBodyResultContent resultContent;

    public static ExecHasApprovalNwacceptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwacceptResponseBody self = new ExecHasApprovalNwacceptResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwacceptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasApprovalNwacceptResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasApprovalNwacceptResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasApprovalNwacceptResponseBody setResultContent(ExecHasApprovalNwacceptResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasApprovalNwacceptResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode self = new ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason self = new ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasApprovalNwacceptResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasApprovalNwacceptResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasApprovalNwacceptResponseBodyResultContent self = new ExecHasApprovalNwacceptResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasApprovalNwacceptResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContent setTopErrorCode(ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasApprovalNwacceptResponseBodyResultContent setTopErrorReason(ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasApprovalNwacceptResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
