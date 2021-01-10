// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveHasUserappgroupRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public SaveHasUserappgroupRelationResponseBodyResultContent resultContent;

    public static SaveHasUserappgroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveHasUserappgroupRelationResponseBody self = new SaveHasUserappgroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveHasUserappgroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveHasUserappgroupRelationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveHasUserappgroupRelationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveHasUserappgroupRelationResponseBody setResultContent(SaveHasUserappgroupRelationResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public SaveHasUserappgroupRelationResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode self = new SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason self = new SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class SaveHasUserappgroupRelationResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason topErrorReason;

        public static SaveHasUserappgroupRelationResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            SaveHasUserappgroupRelationResponseBodyResultContent self = new SaveHasUserappgroupRelationResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public SaveHasUserappgroupRelationResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContent setTopErrorCode(SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public SaveHasUserappgroupRelationResponseBodyResultContent setTopErrorReason(SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public SaveHasUserappgroupRelationResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
