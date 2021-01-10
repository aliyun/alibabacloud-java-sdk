// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportHasInspectPluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ImportHasInspectPluginResponseBodyResultContent resultContent;

    public static ImportHasInspectPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportHasInspectPluginResponseBody self = new ImportHasInspectPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportHasInspectPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportHasInspectPluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportHasInspectPluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportHasInspectPluginResponseBody setResultContent(ImportHasInspectPluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ImportHasInspectPluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ImportHasInspectPluginResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ImportHasInspectPluginResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ImportHasInspectPluginResponseBodyResultContentTopErrorCode self = new ImportHasInspectPluginResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ImportHasInspectPluginResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ImportHasInspectPluginResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ImportHasInspectPluginResponseBodyResultContentTopErrorReason self = new ImportHasInspectPluginResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImportHasInspectPluginResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ImportHasInspectPluginResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public Boolean data;

        @NameInMap("TopErrorCode")
        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ImportHasInspectPluginResponseBodyResultContentTopErrorReason topErrorReason;

        public static ImportHasInspectPluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ImportHasInspectPluginResponseBodyResultContent self = new ImportHasInspectPluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ImportHasInspectPluginResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImportHasInspectPluginResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ImportHasInspectPluginResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ImportHasInspectPluginResponseBodyResultContent setData(Boolean data) {
            this.data = data;
            return this;
        }
        public Boolean getData() {
            return this.data;
        }

        public ImportHasInspectPluginResponseBodyResultContent setTopErrorCode(ImportHasInspectPluginResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ImportHasInspectPluginResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ImportHasInspectPluginResponseBodyResultContent setTopErrorReason(ImportHasInspectPluginResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ImportHasInspectPluginResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
