// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasBaselineAppinstancegroupnamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent resultContent;

    public static ListHasBaselineAppinstancegroupnamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasBaselineAppinstancegroupnamespaceResponseBody self = new ListHasBaselineAppinstancegroupnamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasBaselineAppinstancegroupnamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasBaselineAppinstancegroupnamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasBaselineAppinstancegroupnamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasBaselineAppinstancegroupnamespaceResponseBody setResultContent(ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode self = new ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason self = new ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("TopErrorCode")
        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent self = new ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent setTopErrorCode(ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContent setTopErrorReason(ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasBaselineAppinstancegroupnamespaceResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
