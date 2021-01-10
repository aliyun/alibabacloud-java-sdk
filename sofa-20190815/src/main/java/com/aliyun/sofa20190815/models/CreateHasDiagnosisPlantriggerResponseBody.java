// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasDiagnosisPlantriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasDiagnosisPlantriggerResponseBodyResultContent resultContent;

    public static CreateHasDiagnosisPlantriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasDiagnosisPlantriggerResponseBody self = new CreateHasDiagnosisPlantriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasDiagnosisPlantriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasDiagnosisPlantriggerResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasDiagnosisPlantriggerResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasDiagnosisPlantriggerResponseBody setResultContent(CreateHasDiagnosisPlantriggerResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasDiagnosisPlantriggerResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode self = new CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason self = new CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasDiagnosisPlantriggerResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasDiagnosisPlantriggerResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasDiagnosisPlantriggerResponseBodyResultContent self = new CreateHasDiagnosisPlantriggerResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContent setTopErrorCode(CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasDiagnosisPlantriggerResponseBodyResultContent setTopErrorReason(CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
