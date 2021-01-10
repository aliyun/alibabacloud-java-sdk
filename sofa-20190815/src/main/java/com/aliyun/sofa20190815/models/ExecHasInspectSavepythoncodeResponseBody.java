// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSavepythoncodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasInspectSavepythoncodeResponseBodyResultContent resultContent;

    public static ExecHasInspectSavepythoncodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSavepythoncodeResponseBody self = new ExecHasInspectSavepythoncodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSavepythoncodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasInspectSavepythoncodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasInspectSavepythoncodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasInspectSavepythoncodeResponseBody setResultContent(ExecHasInspectSavepythoncodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasInspectSavepythoncodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasInspectSavepythoncodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("ErrMsg")
        public String errMsg;

        public static ExecHasInspectSavepythoncodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavepythoncodeResponseBodyResultContentData self = new ExecHasInspectSavepythoncodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode self = new ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason self = new ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasInspectSavepythoncodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ExecHasInspectSavepythoncodeResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasInspectSavepythoncodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasInspectSavepythoncodeResponseBodyResultContent self = new ExecHasInspectSavepythoncodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContent setData(ExecHasInspectSavepythoncodeResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ExecHasInspectSavepythoncodeResponseBodyResultContentData getData() {
            return this.data;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContent setTopErrorCode(ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasInspectSavepythoncodeResponseBodyResultContent setTopErrorReason(ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasInspectSavepythoncodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
