// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasDiagnosisNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CloneHasDiagnosisNodeResponseBodyResultContent resultContent;

    public static CloneHasDiagnosisNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneHasDiagnosisNodeResponseBody self = new CloneHasDiagnosisNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneHasDiagnosisNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneHasDiagnosisNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CloneHasDiagnosisNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CloneHasDiagnosisNodeResponseBody setResultContent(CloneHasDiagnosisNodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CloneHasDiagnosisNodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode self = new CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason self = new CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CloneHasDiagnosisNodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static CloneHasDiagnosisNodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CloneHasDiagnosisNodeResponseBodyResultContent self = new CloneHasDiagnosisNodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CloneHasDiagnosisNodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContent setTopErrorCode(CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CloneHasDiagnosisNodeResponseBodyResultContent setTopErrorReason(CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CloneHasDiagnosisNodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
