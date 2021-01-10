// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskrunningstatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectTaskrunningstatusResponseBodyResultContent resultContent;

    public static ListHasInspectTaskrunningstatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskrunningstatusResponseBody self = new ListHasInspectTaskrunningstatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskrunningstatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectTaskrunningstatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectTaskrunningstatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectTaskrunningstatusResponseBody setResultContent(ListHasInspectTaskrunningstatusResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectTaskrunningstatusResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectTaskrunningstatusResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndStatus")
        public Boolean endStatus;

        public static ListHasInspectTaskrunningstatusResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskrunningstatusResponseBodyResultContentData self = new ListHasInspectTaskrunningstatusResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentData setEndStatus(Boolean endStatus) {
            this.endStatus = endStatus;
            return this;
        }
        public Boolean getEndStatus() {
            return this.endStatus;
        }

    }

    public static class ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode self = new ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason self = new ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectTaskrunningstatusResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectTaskrunningstatusResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectTaskrunningstatusResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTaskrunningstatusResponseBodyResultContent self = new ListHasInspectTaskrunningstatusResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContent setData(java.util.List<ListHasInspectTaskrunningstatusResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectTaskrunningstatusResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContent setTopErrorCode(ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectTaskrunningstatusResponseBodyResultContent setTopErrorReason(ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectTaskrunningstatusResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
