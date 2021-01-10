// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSavejavacodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasInspectSavejavacodeResponseBodyResultContent resultContent;

    public static ExecHasInspectSavejavacodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSavejavacodeResponseBody self = new ExecHasInspectSavejavacodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSavejavacodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasInspectSavejavacodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasInspectSavejavacodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasInspectSavejavacodeResponseBody setResultContent(ExecHasInspectSavejavacodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasInspectSavejavacodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasInspectSavejavacodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("ErrMsg")
        public String errMsg;

        public static ExecHasInspectSavejavacodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavejavacodeResponseBodyResultContentData self = new ExecHasInspectSavejavacodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode self = new ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason self = new ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasInspectSavejavacodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ExecHasInspectSavejavacodeResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasInspectSavejavacodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavejavacodeResponseBodyResultContent self = new ExecHasInspectSavejavacodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContent setData(ExecHasInspectSavejavacodeResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ExecHasInspectSavejavacodeResponseBodyResultContentData getData() {
            return this.data;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContent setTopErrorCode(ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasInspectSavejavacodeResponseBodyResultContent setTopErrorReason(ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasInspectSavejavacodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
