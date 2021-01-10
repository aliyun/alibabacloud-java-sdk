// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationdiagplansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRiskAggregationdiagplansResponseBodyResultContent resultContent;

    public static QueryHasRiskAggregationdiagplansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationdiagplansResponseBody self = new QueryHasRiskAggregationdiagplansResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationdiagplansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRiskAggregationdiagplansResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRiskAggregationdiagplansResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRiskAggregationdiagplansResponseBody setResultContent(QueryHasRiskAggregationdiagplansResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRiskAggregationdiagplansResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRiskAggregationdiagplansResponseBodyResultContentData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExecutableStatus")
        public String executableStatus;

        @NameInMap("RunningStatus")
        public String runningStatus;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("DeleteTime")
        public String deleteTime;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasRiskAggregationdiagplansResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdiagplansResponseBodyResultContentData self = new QueryHasRiskAggregationdiagplansResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setRunningStatus(String runningStatus) {
            this.runningStatus = runningStatus;
            return this;
        }
        public String getRunningStatus() {
            return this.runningStatus;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode self = new QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason self = new QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRiskAggregationdiagplansResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasRiskAggregationdiagplansResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRiskAggregationdiagplansResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdiagplansResponseBodyResultContent self = new QueryHasRiskAggregationdiagplansResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContent setData(java.util.List<QueryHasRiskAggregationdiagplansResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasRiskAggregationdiagplansResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContent setTopErrorCode(QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRiskAggregationdiagplansResponseBodyResultContent setTopErrorReason(QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRiskAggregationdiagplansResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
