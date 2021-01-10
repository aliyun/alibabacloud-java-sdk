// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncHasBaselineSyncfortenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public SyncHasBaselineSyncfortenantResponseBodyResultContent resultContent;

    public static SyncHasBaselineSyncfortenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncHasBaselineSyncfortenantResponseBody self = new SyncHasBaselineSyncfortenantResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncHasBaselineSyncfortenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncHasBaselineSyncfortenantResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncHasBaselineSyncfortenantResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SyncHasBaselineSyncfortenantResponseBody setResultContent(SyncHasBaselineSyncfortenantResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public SyncHasBaselineSyncfortenantResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode self = new SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason self = new SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class SyncHasBaselineSyncfortenantResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason topErrorReason;

        public static SyncHasBaselineSyncfortenantResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            SyncHasBaselineSyncfortenantResponseBodyResultContent self = new SyncHasBaselineSyncfortenantResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContent setTopErrorCode(SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public SyncHasBaselineSyncfortenantResponseBodyResultContent setTopErrorReason(SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public SyncHasBaselineSyncfortenantResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
