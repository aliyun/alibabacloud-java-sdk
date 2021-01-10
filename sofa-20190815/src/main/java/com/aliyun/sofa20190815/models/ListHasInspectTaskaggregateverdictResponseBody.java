// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskaggregateverdictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectTaskaggregateverdictResponseBodyResultContent resultContent;

    public static ListHasInspectTaskaggregateverdictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskaggregateverdictResponseBody self = new ListHasInspectTaskaggregateverdictResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskaggregateverdictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectTaskaggregateverdictResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectTaskaggregateverdictResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectTaskaggregateverdictResponseBody setResultContent(ListHasInspectTaskaggregateverdictResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectTaskaggregateverdictResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectTaskaggregateverdictResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static ListHasInspectTaskaggregateverdictResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskaggregateverdictResponseBodyResultContentData self = new ListHasInspectTaskaggregateverdictResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode self = new ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason self = new ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectTaskaggregateverdictResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectTaskaggregateverdictResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectTaskaggregateverdictResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskaggregateverdictResponseBodyResultContent self = new ListHasInspectTaskaggregateverdictResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContent setData(java.util.List<ListHasInspectTaskaggregateverdictResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectTaskaggregateverdictResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContent setTopErrorCode(ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectTaskaggregateverdictResponseBodyResultContent setTopErrorReason(ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectTaskaggregateverdictResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
