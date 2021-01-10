// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDingtalkRobotupdateauthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UpdateHasDingtalkRobotupdateauthResponseBodyResultContent resultContent;

    public static UpdateHasDingtalkRobotupdateauthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDingtalkRobotupdateauthResponseBody self = new UpdateHasDingtalkRobotupdateauthResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHasDingtalkRobotupdateauthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHasDingtalkRobotupdateauthResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateHasDingtalkRobotupdateauthResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateHasDingtalkRobotupdateauthResponseBody setResultContent(UpdateHasDingtalkRobotupdateauthResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateHasDingtalkRobotupdateauthResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode self = new UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason self = new UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateHasDingtalkRobotupdateauthResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason topErrorReason;

        public static UpdateHasDingtalkRobotupdateauthResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasDingtalkRobotupdateauthResponseBodyResultContent self = new UpdateHasDingtalkRobotupdateauthResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContent setTopErrorCode(UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContent setTopErrorReason(UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UpdateHasDingtalkRobotupdateauthResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
