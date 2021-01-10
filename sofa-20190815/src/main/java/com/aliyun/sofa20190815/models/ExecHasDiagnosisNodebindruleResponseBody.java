// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasDiagnosisNodebindruleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasDiagnosisNodebindruleResponseBodyResultContent resultContent;

    public static ExecHasDiagnosisNodebindruleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasDiagnosisNodebindruleResponseBody self = new ExecHasDiagnosisNodebindruleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasDiagnosisNodebindruleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasDiagnosisNodebindruleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasDiagnosisNodebindruleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasDiagnosisNodebindruleResponseBody setResultContent(ExecHasDiagnosisNodebindruleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasDiagnosisNodebindruleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode self = new ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason self = new ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasDiagnosisNodebindruleResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasDiagnosisNodebindruleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasDiagnosisNodebindruleResponseBodyResultContent self = new ExecHasDiagnosisNodebindruleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContent setTopErrorCode(ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasDiagnosisNodebindruleResponseBodyResultContent setTopErrorReason(ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasDiagnosisNodebindruleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
