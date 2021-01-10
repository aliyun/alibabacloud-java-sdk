// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellexeclogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectShellexeclogResponseBodyResultContent resultContent;

    public static GetHasInspectShellexeclogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellexeclogResponseBody self = new GetHasInspectShellexeclogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellexeclogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectShellexeclogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectShellexeclogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectShellexeclogResponseBody setResultContent(GetHasInspectShellexeclogResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectShellexeclogResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectShellexeclogResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static GetHasInspectShellexeclogResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellexeclogResponseBodyResultContentData self = new GetHasInspectShellexeclogResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellexeclogResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode self = new GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason self = new GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectShellexeclogResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectShellexeclogResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectShellexeclogResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectShellexeclogResponseBodyResultContent self = new GetHasInspectShellexeclogResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectShellexeclogResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectShellexeclogResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectShellexeclogResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectShellexeclogResponseBodyResultContent setData(GetHasInspectShellexeclogResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectShellexeclogResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectShellexeclogResponseBodyResultContent setTopErrorCode(GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectShellexeclogResponseBodyResultContent setTopErrorReason(GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectShellexeclogResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
