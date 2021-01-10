// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasEmergencyPlanstatusesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasEmergencyPlanstatusesResponseBodyResultContent resultContent;

    public static QueryHasEmergencyPlanstatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasEmergencyPlanstatusesResponseBody self = new QueryHasEmergencyPlanstatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasEmergencyPlanstatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasEmergencyPlanstatusesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasEmergencyPlanstatusesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasEmergencyPlanstatusesResponseBody setResultContent(QueryHasEmergencyPlanstatusesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasEmergencyPlanstatusesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasEmergencyPlanstatusesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasEmergencyPlanstatusesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlanstatusesResponseBodyResultContentData self = new QueryHasEmergencyPlanstatusesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode self = new QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason self = new QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasEmergencyPlanstatusesResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasEmergencyPlanstatusesResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasEmergencyPlanstatusesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlanstatusesResponseBodyResultContent self = new QueryHasEmergencyPlanstatusesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContent setData(java.util.List<QueryHasEmergencyPlanstatusesResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasEmergencyPlanstatusesResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContent setTopErrorCode(QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasEmergencyPlanstatusesResponseBodyResultContent setTopErrorReason(QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasEmergencyPlanstatusesResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
