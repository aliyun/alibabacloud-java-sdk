// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskverdictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectTaskverdictResponseBodyResultContent resultContent;

    public static ListHasInspectTaskverdictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskverdictResponseBody self = new ListHasInspectTaskverdictResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskverdictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectTaskverdictResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectTaskverdictResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectTaskverdictResponseBody setResultContent(ListHasInspectTaskverdictResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectTaskverdictResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectTaskverdictResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("Terminated")
        public Boolean terminated;

        public static ListHasInspectTaskverdictResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskverdictResponseBodyResultContentData self = new ListHasInspectTaskverdictResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskverdictResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentData setTerminated(Boolean terminated) {
            this.terminated = terminated;
            return this;
        }
        public Boolean getTerminated() {
            return this.terminated;
        }

    }

    public static class ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode self = new ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason self = new ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectTaskverdictResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectTaskverdictResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectTaskverdictResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskverdictResponseBodyResultContent self = new ListHasInspectTaskverdictResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskverdictResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskverdictResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectTaskverdictResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectTaskverdictResponseBodyResultContent setData(java.util.List<ListHasInspectTaskverdictResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectTaskverdictResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectTaskverdictResponseBodyResultContent setTopErrorCode(ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectTaskverdictResponseBodyResultContent setTopErrorReason(ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectTaskverdictResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
