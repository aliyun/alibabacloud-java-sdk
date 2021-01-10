// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisPythonexeclogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasDiagnosisPythonexeclogResponseBodyResultContent resultContent;

    public static GetHasDiagnosisPythonexeclogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisPythonexeclogResponseBody self = new GetHasDiagnosisPythonexeclogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisPythonexeclogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasDiagnosisPythonexeclogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasDiagnosisPythonexeclogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasDiagnosisPythonexeclogResponseBody setResultContent(GetHasDiagnosisPythonexeclogResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasDiagnosisPythonexeclogResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasDiagnosisPythonexeclogResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static GetHasDiagnosisPythonexeclogResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisPythonexeclogResponseBodyResultContentData self = new GetHasDiagnosisPythonexeclogResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode self = new GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason self = new GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasDiagnosisPythonexeclogResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasDiagnosisPythonexeclogResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasDiagnosisPythonexeclogResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisPythonexeclogResponseBodyResultContent self = new GetHasDiagnosisPythonexeclogResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContent setData(GetHasDiagnosisPythonexeclogResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasDiagnosisPythonexeclogResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContent setTopErrorCode(GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasDiagnosisPythonexeclogResponseBodyResultContent setTopErrorReason(GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasDiagnosisPythonexeclogResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
