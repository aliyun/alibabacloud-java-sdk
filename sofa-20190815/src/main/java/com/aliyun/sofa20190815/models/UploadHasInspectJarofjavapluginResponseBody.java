// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadHasInspectJarofjavapluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UploadHasInspectJarofjavapluginResponseBodyResultContent resultContent;

    public static UploadHasInspectJarofjavapluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadHasInspectJarofjavapluginResponseBody self = new UploadHasInspectJarofjavapluginResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadHasInspectJarofjavapluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadHasInspectJarofjavapluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadHasInspectJarofjavapluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UploadHasInspectJarofjavapluginResponseBody setResultContent(UploadHasInspectJarofjavapluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UploadHasInspectJarofjavapluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode self = new UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason self = new UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UploadHasInspectJarofjavapluginResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public Boolean data;

        @NameInMap("TopErrorCode")
        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason topErrorReason;

        public static UploadHasInspectJarofjavapluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UploadHasInspectJarofjavapluginResponseBodyResultContent self = new UploadHasInspectJarofjavapluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContent setData(Boolean data) {
            this.data = data;
            return this;
        }
        public Boolean getData() {
            return this.data;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContent setTopErrorCode(UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UploadHasInspectJarofjavapluginResponseBodyResultContent setTopErrorReason(UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UploadHasInspectJarofjavapluginResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
