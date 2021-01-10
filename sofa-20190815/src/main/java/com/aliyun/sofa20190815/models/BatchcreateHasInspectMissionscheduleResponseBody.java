// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateHasInspectMissionscheduleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public BatchcreateHasInspectMissionscheduleResponseBodyResultContent resultContent;

    public static BatchcreateHasInspectMissionscheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateHasInspectMissionscheduleResponseBody self = new BatchcreateHasInspectMissionscheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchcreateHasInspectMissionscheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchcreateHasInspectMissionscheduleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchcreateHasInspectMissionscheduleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateHasInspectMissionscheduleResponseBody setResultContent(BatchcreateHasInspectMissionscheduleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public BatchcreateHasInspectMissionscheduleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode self = new BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason self = new BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class BatchcreateHasInspectMissionscheduleResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason topErrorReason;

        public static BatchcreateHasInspectMissionscheduleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateHasInspectMissionscheduleResponseBodyResultContent self = new BatchcreateHasInspectMissionscheduleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContent setTopErrorCode(BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchcreateHasInspectMissionscheduleResponseBodyResultContent setTopErrorReason(BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public BatchcreateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
