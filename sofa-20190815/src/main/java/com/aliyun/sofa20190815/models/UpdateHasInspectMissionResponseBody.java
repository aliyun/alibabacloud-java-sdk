// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectMissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UpdateHasInspectMissionResponseBodyResultContent resultContent;

    public static UpdateHasInspectMissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectMissionResponseBody self = new UpdateHasInspectMissionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectMissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHasInspectMissionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateHasInspectMissionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateHasInspectMissionResponseBody setResultContent(UpdateHasInspectMissionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateHasInspectMissionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UpdateHasInspectMissionResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static UpdateHasInspectMissionResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectMissionResponseBodyResultContentTopErrorCode self = new UpdateHasInspectMissionResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateHasInspectMissionResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UpdateHasInspectMissionResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectMissionResponseBodyResultContentTopErrorReason self = new UpdateHasInspectMissionResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasInspectMissionResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateHasInspectMissionResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UpdateHasInspectMissionResponseBodyResultContentTopErrorReason topErrorReason;

        public static UpdateHasInspectMissionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectMissionResponseBodyResultContent self = new UpdateHasInspectMissionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectMissionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasInspectMissionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateHasInspectMissionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateHasInspectMissionResponseBodyResultContent setTopErrorCode(UpdateHasInspectMissionResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UpdateHasInspectMissionResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UpdateHasInspectMissionResponseBodyResultContent setTopErrorReason(UpdateHasInspectMissionResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UpdateHasInspectMissionResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
