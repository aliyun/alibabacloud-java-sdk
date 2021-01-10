// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncHasCloudarchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public SyncHasCloudarchResponseBodyResultContent resultContent;

    public static SyncHasCloudarchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncHasCloudarchResponseBody self = new SyncHasCloudarchResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncHasCloudarchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncHasCloudarchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncHasCloudarchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SyncHasCloudarchResponseBody setResultContent(SyncHasCloudarchResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public SyncHasCloudarchResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class SyncHasCloudarchResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static SyncHasCloudarchResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            SyncHasCloudarchResponseBodyResultContentTopErrorCode self = new SyncHasCloudarchResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SyncHasCloudarchResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static SyncHasCloudarchResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            SyncHasCloudarchResponseBodyResultContentTopErrorReason self = new SyncHasCloudarchResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SyncHasCloudarchResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class SyncHasCloudarchResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public SyncHasCloudarchResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public SyncHasCloudarchResponseBodyResultContentTopErrorReason topErrorReason;

        public static SyncHasCloudarchResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            SyncHasCloudarchResponseBodyResultContent self = new SyncHasCloudarchResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public SyncHasCloudarchResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SyncHasCloudarchResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SyncHasCloudarchResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SyncHasCloudarchResponseBodyResultContent setTopErrorCode(SyncHasCloudarchResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public SyncHasCloudarchResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public SyncHasCloudarchResponseBodyResultContent setTopErrorReason(SyncHasCloudarchResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public SyncHasCloudarchResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
