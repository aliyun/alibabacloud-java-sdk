// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasDiagnosisNodeunbindruleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasDiagnosisNodeunbindruleResponseBodyResultContent resultContent;

    public static ExecHasDiagnosisNodeunbindruleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasDiagnosisNodeunbindruleResponseBody self = new ExecHasDiagnosisNodeunbindruleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasDiagnosisNodeunbindruleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasDiagnosisNodeunbindruleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasDiagnosisNodeunbindruleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasDiagnosisNodeunbindruleResponseBody setResultContent(ExecHasDiagnosisNodeunbindruleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasDiagnosisNodeunbindruleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode self = new ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason self = new ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasDiagnosisNodeunbindruleResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasDiagnosisNodeunbindruleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagnosisNodeunbindruleResponseBodyResultContent self = new ExecHasDiagnosisNodeunbindruleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContent setTopErrorCode(ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContent setTopErrorReason(ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasDiagnosisNodeunbindruleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
