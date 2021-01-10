// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskstatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectTaskstatusResponseBodyResultContent resultContent;

    public static ListHasInspectTaskstatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskstatusResponseBody self = new ListHasInspectTaskstatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskstatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectTaskstatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectTaskstatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectTaskstatusResponseBody setResultContent(ListHasInspectTaskstatusResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectTaskstatusResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectTaskstatusResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static ListHasInspectTaskstatusResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskstatusResponseBodyResultContentData self = new ListHasInspectTaskstatusResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskstatusResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode self = new ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason self = new ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectTaskstatusResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectTaskstatusResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectTaskstatusResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskstatusResponseBodyResultContent self = new ListHasInspectTaskstatusResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskstatusResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskstatusResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectTaskstatusResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectTaskstatusResponseBodyResultContent setData(java.util.List<ListHasInspectTaskstatusResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectTaskstatusResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectTaskstatusResponseBodyResultContent setTopErrorCode(ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectTaskstatusResponseBodyResultContent setTopErrorReason(ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectTaskstatusResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
