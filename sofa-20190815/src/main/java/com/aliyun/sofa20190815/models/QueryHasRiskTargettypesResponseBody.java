// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskTargettypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRiskTargettypesResponseBodyResultContent resultContent;

    public static QueryHasRiskTargettypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskTargettypesResponseBody self = new QueryHasRiskTargettypesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskTargettypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRiskTargettypesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRiskTargettypesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRiskTargettypesResponseBody setResultContent(QueryHasRiskTargettypesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRiskTargettypesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRiskTargettypesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasRiskTargettypesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskTargettypesResponseBodyResultContentData self = new QueryHasRiskTargettypesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskTargettypesResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode self = new QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason self = new QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRiskTargettypesResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasRiskTargettypesResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRiskTargettypesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskTargettypesResponseBodyResultContent self = new QueryHasRiskTargettypesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskTargettypesResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskTargettypesResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRiskTargettypesResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRiskTargettypesResponseBodyResultContent setData(java.util.List<QueryHasRiskTargettypesResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasRiskTargettypesResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasRiskTargettypesResponseBodyResultContent setTopErrorCode(QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRiskTargettypesResponseBodyResultContent setTopErrorReason(QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRiskTargettypesResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
