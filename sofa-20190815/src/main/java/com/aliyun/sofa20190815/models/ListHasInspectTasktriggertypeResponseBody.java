// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTasktriggertypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectTasktriggertypeResponseBodyResultContent resultContent;

    public static ListHasInspectTasktriggertypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTasktriggertypeResponseBody self = new ListHasInspectTasktriggertypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTasktriggertypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectTasktriggertypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectTasktriggertypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectTasktriggertypeResponseBody setResultContent(ListHasInspectTasktriggertypeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectTasktriggertypeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectTasktriggertypeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("SupportInspect")
        public Boolean supportInspect;

        @NameInMap("SupportDiag")
        public Boolean supportDiag;

        public static ListHasInspectTasktriggertypeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTasktriggertypeResponseBodyResultContentData self = new ListHasInspectTasktriggertypeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentData setSupportInspect(Boolean supportInspect) {
            this.supportInspect = supportInspect;
            return this;
        }
        public Boolean getSupportInspect() {
            return this.supportInspect;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentData setSupportDiag(Boolean supportDiag) {
            this.supportDiag = supportDiag;
            return this;
        }
        public Boolean getSupportDiag() {
            return this.supportDiag;
        }

    }

    public static class ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode self = new ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason self = new ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectTasktriggertypeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectTasktriggertypeResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectTasktriggertypeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectTasktriggertypeResponseBodyResultContent self = new ListHasInspectTasktriggertypeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContent setData(java.util.List<ListHasInspectTasktriggertypeResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectTasktriggertypeResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContent setTopErrorCode(ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectTasktriggertypeResponseBodyResultContent setTopErrorReason(ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectTasktriggertypeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
