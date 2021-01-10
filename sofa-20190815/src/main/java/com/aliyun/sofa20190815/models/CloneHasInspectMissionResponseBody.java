// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasInspectMissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CloneHasInspectMissionResponseBodyResultContent resultContent;

    public static CloneHasInspectMissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneHasInspectMissionResponseBody self = new CloneHasInspectMissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneHasInspectMissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneHasInspectMissionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CloneHasInspectMissionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CloneHasInspectMissionResponseBody setResultContent(CloneHasInspectMissionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CloneHasInspectMissionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CloneHasInspectMissionResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CloneHasInspectMissionResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CloneHasInspectMissionResponseBodyResultContentTopErrorCode self = new CloneHasInspectMissionResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CloneHasInspectMissionResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CloneHasInspectMissionResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CloneHasInspectMissionResponseBodyResultContentTopErrorReason self = new CloneHasInspectMissionResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CloneHasInspectMissionResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CloneHasInspectMissionResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CloneHasInspectMissionResponseBodyResultContentTopErrorReason topErrorReason;

        public static CloneHasInspectMissionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CloneHasInspectMissionResponseBodyResultContent self = new CloneHasInspectMissionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CloneHasInspectMissionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CloneHasInspectMissionResponseBodyResultContent setTopErrorCode(CloneHasInspectMissionResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CloneHasInspectMissionResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CloneHasInspectMissionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CloneHasInspectMissionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CloneHasInspectMissionResponseBodyResultContent setTopErrorReason(CloneHasInspectMissionResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CloneHasInspectMissionResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
