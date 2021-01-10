// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchIaasakemetadataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasCloudarchIaasakemetadataResponseBodyResultContent resultContent;

    public static CreateHasCloudarchIaasakemetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchIaasakemetadataResponseBody self = new CreateHasCloudarchIaasakemetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchIaasakemetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasCloudarchIaasakemetadataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasCloudarchIaasakemetadataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasCloudarchIaasakemetadataResponseBody setResultContent(CreateHasCloudarchIaasakemetadataResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasCloudarchIaasakemetadataResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode self = new CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason self = new CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasCloudarchIaasakemetadataResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasCloudarchIaasakemetadataResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasCloudarchIaasakemetadataResponseBodyResultContent self = new CreateHasCloudarchIaasakemetadataResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContent setTopErrorCode(CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasCloudarchIaasakemetadataResponseBodyResultContent setTopErrorReason(CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasCloudarchIaasakemetadataResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
