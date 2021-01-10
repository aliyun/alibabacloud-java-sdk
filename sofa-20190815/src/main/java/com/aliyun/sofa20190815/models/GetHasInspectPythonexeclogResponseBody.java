// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonexeclogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectPythonexeclogResponseBodyResultContent resultContent;

    public static GetHasInspectPythonexeclogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonexeclogResponseBody self = new GetHasInspectPythonexeclogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonexeclogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectPythonexeclogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectPythonexeclogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectPythonexeclogResponseBody setResultContent(GetHasInspectPythonexeclogResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectPythonexeclogResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectPythonexeclogResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static GetHasInspectPythonexeclogResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonexeclogResponseBodyResultContentData self = new GetHasInspectPythonexeclogResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode self = new GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason self = new GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectPythonexeclogResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectPythonexeclogResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectPythonexeclogResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectPythonexeclogResponseBodyResultContent self = new GetHasInspectPythonexeclogResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectPythonexeclogResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContent setData(GetHasInspectPythonexeclogResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectPythonexeclogResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContent setTopErrorCode(GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectPythonexeclogResponseBodyResultContent setTopErrorReason(GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectPythonexeclogResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
