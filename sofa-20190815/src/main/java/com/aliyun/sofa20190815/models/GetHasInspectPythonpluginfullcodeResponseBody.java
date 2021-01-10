// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonpluginfullcodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectPythonpluginfullcodeResponseBodyResultContent resultContent;

    public static GetHasInspectPythonpluginfullcodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonpluginfullcodeResponseBody self = new GetHasInspectPythonpluginfullcodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonpluginfullcodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectPythonpluginfullcodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectPythonpluginfullcodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectPythonpluginfullcodeResponseBody setResultContent(GetHasInspectPythonpluginfullcodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectPythonpluginfullcodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectPythonpluginfullcodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static GetHasInspectPythonpluginfullcodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonpluginfullcodeResponseBodyResultContentData self = new GetHasInspectPythonpluginfullcodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode self = new GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason self = new GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectPythonpluginfullcodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectPythonpluginfullcodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonpluginfullcodeResponseBodyResultContent self = new GetHasInspectPythonpluginfullcodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContent setData(GetHasInspectPythonpluginfullcodeResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContent setTopErrorCode(GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectPythonpluginfullcodeResponseBodyResultContent setTopErrorReason(GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectPythonpluginfullcodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
