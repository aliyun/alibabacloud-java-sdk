// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisShellexeclogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasDiagnosisShellexeclogResponseBodyResultContent resultContent;

    public static GetHasDiagnosisShellexeclogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisShellexeclogResponseBody self = new GetHasDiagnosisShellexeclogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisShellexeclogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasDiagnosisShellexeclogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasDiagnosisShellexeclogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasDiagnosisShellexeclogResponseBody setResultContent(GetHasDiagnosisShellexeclogResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasDiagnosisShellexeclogResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasDiagnosisShellexeclogResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static GetHasDiagnosisShellexeclogResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisShellexeclogResponseBodyResultContentData self = new GetHasDiagnosisShellexeclogResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode self = new GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason self = new GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasDiagnosisShellexeclogResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasDiagnosisShellexeclogResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasDiagnosisShellexeclogResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisShellexeclogResponseBodyResultContent self = new GetHasDiagnosisShellexeclogResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContent setData(GetHasDiagnosisShellexeclogResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasDiagnosisShellexeclogResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContent setTopErrorCode(GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasDiagnosisShellexeclogResponseBodyResultContent setTopErrorReason(GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasDiagnosisShellexeclogResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
