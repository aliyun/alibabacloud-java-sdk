// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasDiagPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasDiagPlanResponseBodyResultContent resultContent;

    public static ExecHasDiagPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasDiagPlanResponseBody self = new ExecHasDiagPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasDiagPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasDiagPlanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasDiagPlanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasDiagPlanResponseBody setResultContent(ExecHasDiagPlanResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasDiagPlanResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasDiagPlanResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasDiagPlanResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagPlanResponseBodyResultContentTopErrorCode self = new ExecHasDiagPlanResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasDiagPlanResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasDiagPlanResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagPlanResponseBodyResultContentTopErrorReason self = new ExecHasDiagPlanResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasDiagPlanResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasDiagPlanResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasDiagPlanResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasDiagPlanResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagPlanResponseBodyResultContent self = new ExecHasDiagPlanResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagPlanResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasDiagPlanResponseBodyResultContent setTopErrorCode(ExecHasDiagPlanResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasDiagPlanResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasDiagPlanResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasDiagPlanResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasDiagPlanResponseBodyResultContent setTopErrorReason(ExecHasDiagPlanResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasDiagPlanResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
