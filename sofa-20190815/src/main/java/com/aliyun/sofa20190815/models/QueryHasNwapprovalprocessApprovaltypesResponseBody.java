// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasNwapprovalprocessApprovaltypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent resultContent;

    public static QueryHasNwapprovalprocessApprovaltypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasNwapprovalprocessApprovaltypesResponseBody self = new QueryHasNwapprovalprocessApprovaltypesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasNwapprovalprocessApprovaltypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasNwapprovalprocessApprovaltypesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasNwapprovalprocessApprovaltypesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasNwapprovalprocessApprovaltypesResponseBody setResultContent(QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Description")
        public String description;

        public static QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData self = new QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode self = new QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason self = new QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent self = new QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent setData(java.util.List<QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent setTopErrorCode(QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContent setTopErrorReason(QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasNwapprovalprocessApprovaltypesResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
