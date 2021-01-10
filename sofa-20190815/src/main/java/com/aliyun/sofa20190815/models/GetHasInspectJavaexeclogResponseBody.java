// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJavaexeclogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectJavaexeclogResponseBodyResultContent resultContent;

    public static GetHasInspectJavaexeclogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJavaexeclogResponseBody self = new GetHasInspectJavaexeclogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJavaexeclogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectJavaexeclogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectJavaexeclogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectJavaexeclogResponseBody setResultContent(GetHasInspectJavaexeclogResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectJavaexeclogResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectJavaexeclogResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static GetHasInspectJavaexeclogResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJavaexeclogResponseBodyResultContentData self = new GetHasInspectJavaexeclogResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode self = new GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason self = new GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectJavaexeclogResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectJavaexeclogResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectJavaexeclogResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJavaexeclogResponseBodyResultContent self = new GetHasInspectJavaexeclogResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJavaexeclogResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContent setData(GetHasInspectJavaexeclogResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectJavaexeclogResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContent setTopErrorCode(GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectJavaexeclogResponseBodyResultContent setTopErrorReason(GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectJavaexeclogResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
