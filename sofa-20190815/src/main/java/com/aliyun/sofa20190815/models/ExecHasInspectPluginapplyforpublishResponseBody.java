// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPluginapplyforpublishResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasInspectPluginapplyforpublishResponseBodyResultContent resultContent;

    public static ExecHasInspectPluginapplyforpublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPluginapplyforpublishResponseBody self = new ExecHasInspectPluginapplyforpublishResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPluginapplyforpublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasInspectPluginapplyforpublishResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasInspectPluginapplyforpublishResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasInspectPluginapplyforpublishResponseBody setResultContent(ExecHasInspectPluginapplyforpublishResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasInspectPluginapplyforpublishResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode self = new ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason self = new ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasInspectPluginapplyforpublishResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasInspectPluginapplyforpublishResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectPluginapplyforpublishResponseBodyResultContent self = new ExecHasInspectPluginapplyforpublishResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContent setTopErrorCode(ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasInspectPluginapplyforpublishResponseBodyResultContent setTopErrorReason(ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasInspectPluginapplyforpublishResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
