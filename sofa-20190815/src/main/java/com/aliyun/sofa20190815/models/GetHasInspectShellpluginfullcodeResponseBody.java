// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellpluginfullcodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectShellpluginfullcodeResponseBodyResultContent resultContent;

    public static GetHasInspectShellpluginfullcodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellpluginfullcodeResponseBody self = new GetHasInspectShellpluginfullcodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellpluginfullcodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectShellpluginfullcodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectShellpluginfullcodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectShellpluginfullcodeResponseBody setResultContent(GetHasInspectShellpluginfullcodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectShellpluginfullcodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectShellpluginfullcodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static GetHasInspectShellpluginfullcodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellpluginfullcodeResponseBodyResultContentData self = new GetHasInspectShellpluginfullcodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode self = new GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason self = new GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectShellpluginfullcodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectShellpluginfullcodeResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectShellpluginfullcodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellpluginfullcodeResponseBodyResultContent self = new GetHasInspectShellpluginfullcodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContent setData(GetHasInspectShellpluginfullcodeResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectShellpluginfullcodeResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContent setTopErrorCode(GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectShellpluginfullcodeResponseBodyResultContent setTopErrorReason(GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectShellpluginfullcodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
