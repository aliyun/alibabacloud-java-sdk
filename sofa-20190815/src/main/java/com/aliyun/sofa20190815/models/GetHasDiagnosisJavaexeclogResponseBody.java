// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisJavaexeclogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasDiagnosisJavaexeclogResponseBodyResultContent resultContent;

    public static GetHasDiagnosisJavaexeclogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisJavaexeclogResponseBody self = new GetHasDiagnosisJavaexeclogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisJavaexeclogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasDiagnosisJavaexeclogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasDiagnosisJavaexeclogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasDiagnosisJavaexeclogResponseBody setResultContent(GetHasDiagnosisJavaexeclogResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasDiagnosisJavaexeclogResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasDiagnosisJavaexeclogResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static GetHasDiagnosisJavaexeclogResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisJavaexeclogResponseBodyResultContentData self = new GetHasDiagnosisJavaexeclogResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode self = new GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason self = new GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasDiagnosisJavaexeclogResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasDiagnosisJavaexeclogResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasDiagnosisJavaexeclogResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisJavaexeclogResponseBodyResultContent self = new GetHasDiagnosisJavaexeclogResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContent setData(GetHasDiagnosisJavaexeclogResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasDiagnosisJavaexeclogResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContent setTopErrorCode(GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasDiagnosisJavaexeclogResponseBodyResultContent setTopErrorReason(GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasDiagnosisJavaexeclogResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
