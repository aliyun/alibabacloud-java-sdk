// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSaveshellcodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasInspectSaveshellcodeResponseBodyResultContent resultContent;

    public static ExecHasInspectSaveshellcodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSaveshellcodeResponseBody self = new ExecHasInspectSaveshellcodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSaveshellcodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasInspectSaveshellcodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasInspectSaveshellcodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasInspectSaveshellcodeResponseBody setResultContent(ExecHasInspectSaveshellcodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasInspectSaveshellcodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasInspectSaveshellcodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("ErrMsg")
        public String errMsg;

        public static ExecHasInspectSaveshellcodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSaveshellcodeResponseBodyResultContentData self = new ExecHasInspectSaveshellcodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode self = new ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason self = new ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasInspectSaveshellcodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ExecHasInspectSaveshellcodeResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasInspectSaveshellcodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSaveshellcodeResponseBodyResultContent self = new ExecHasInspectSaveshellcodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContent setData(ExecHasInspectSaveshellcodeResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ExecHasInspectSaveshellcodeResponseBodyResultContentData getData() {
            return this.data;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContent setTopErrorCode(ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasInspectSaveshellcodeResponseBodyResultContent setTopErrorReason(ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasInspectSaveshellcodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
