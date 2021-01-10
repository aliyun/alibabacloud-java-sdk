// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectExectaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasInspectExectaskResponseBodyResultContent resultContent;

    public static CreateHasInspectExectaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectExectaskResponseBody self = new CreateHasInspectExectaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectExectaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasInspectExectaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasInspectExectaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasInspectExectaskResponseBody setResultContent(CreateHasInspectExectaskResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasInspectExectaskResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasInspectExectaskResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasInspectExectaskResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectExectaskResponseBodyResultContentTopErrorCode self = new CreateHasInspectExectaskResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasInspectExectaskResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasInspectExectaskResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectExectaskResponseBodyResultContentTopErrorReason self = new CreateHasInspectExectaskResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectExectaskResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasInspectExectaskResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasInspectExectaskResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasInspectExectaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectExectaskResponseBodyResultContent self = new CreateHasInspectExectaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectExectaskResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateHasInspectExectaskResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasInspectExectaskResponseBodyResultContent setTopErrorCode(CreateHasInspectExectaskResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasInspectExectaskResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasInspectExectaskResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectExectaskResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasInspectExectaskResponseBodyResultContent setTopErrorReason(CreateHasInspectExectaskResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasInspectExectaskResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
