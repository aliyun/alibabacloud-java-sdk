// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserappcellResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectUserappcellResponseBodyResultContent resultContent;

    public static ListHasInspectUserappcellResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserappcellResponseBody self = new ListHasInspectUserappcellResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserappcellResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectUserappcellResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectUserappcellResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectUserappcellResponseBody setResultContent(ListHasInspectUserappcellResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectUserappcellResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectUserappcellResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectUserappcellResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectUserappcellResponseBodyResultContentTopErrorCode self = new ListHasInspectUserappcellResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectUserappcellResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectUserappcellResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectUserappcellResponseBodyResultContentTopErrorReason self = new ListHasInspectUserappcellResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectUserappcellResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectUserappcellResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectUserappcellResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectUserappcellResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectUserappcellResponseBodyResultContent self = new ListHasInspectUserappcellResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectUserappcellResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectUserappcellResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectUserappcellResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectUserappcellResponseBodyResultContent setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public ListHasInspectUserappcellResponseBodyResultContent setTopErrorCode(ListHasInspectUserappcellResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectUserappcellResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectUserappcellResponseBodyResultContent setTopErrorReason(ListHasInspectUserappcellResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectUserappcellResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
