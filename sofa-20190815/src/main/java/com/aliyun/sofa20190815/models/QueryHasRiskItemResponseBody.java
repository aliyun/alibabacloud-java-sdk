// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRiskItemResponseBodyResultContent resultContent;

    public static QueryHasRiskItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskItemResponseBody self = new QueryHasRiskItemResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRiskItemResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRiskItemResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRiskItemResponseBody setResultContent(QueryHasRiskItemResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRiskItemResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo extends TeaModel {
        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("InspectRiskId")
        public String inspectRiskId;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("RiskInfo")
        public String riskInfo;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("TaskId")
        public String taskId;

        public static QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo self = new QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo setInspectRiskId(String inspectRiskId) {
            this.inspectRiskId = inspectRiskId;
            return this;
        }
        public String getInspectRiskId() {
            return this.inspectRiskId;
        }

        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo setRiskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public String getRiskInfo() {
            return this.riskInfo;
        }

        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryHasRiskItemResponseBodyResultContentData extends TeaModel {
        @NameInMap("AggregationRiskItemId")
        public String aggregationRiskItemId;

        @NameInMap("CellId")
        public String cellId;

        @NameInMap("CloseComment")
        public String closeComment;

        @NameInMap("Deadline")
        public String deadline;

        @NameInMap("Description")
        public String description;

        @NameInMap("Resolver")
        public String resolver;

        @NameInMap("RiskEvent")
        public String riskEvent;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RiskName")
        public String riskName;

        @NameInMap("RiskSource")
        public String riskSource;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("RiskTarget")
        public String riskTarget;

        @NameInMap("RiskTargetName")
        public String riskTargetName;

        @NameInMap("RiskTargetType")
        public String riskTargetType;

        @NameInMap("RiskTime")
        public String riskTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("AdditionalInfo")
        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo additionalInfo;

        public static QueryHasRiskItemResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemResponseBodyResultContentData self = new QueryHasRiskItemResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemResponseBodyResultContentData setAggregationRiskItemId(String aggregationRiskItemId) {
            this.aggregationRiskItemId = aggregationRiskItemId;
            return this;
        }
        public String getAggregationRiskItemId() {
            return this.aggregationRiskItemId;
        }

        public QueryHasRiskItemResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasRiskItemResponseBodyResultContentData setCloseComment(String closeComment) {
            this.closeComment = closeComment;
            return this;
        }
        public String getCloseComment() {
            return this.closeComment;
        }

        public QueryHasRiskItemResponseBodyResultContentData setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public QueryHasRiskItemResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskItemResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskEvent(String riskEvent) {
            this.riskEvent = riskEvent;
            return this;
        }
        public String getRiskEvent() {
            return this.riskEvent;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskTarget(String riskTarget) {
            this.riskTarget = riskTarget;
            return this;
        }
        public String getRiskTarget() {
            return this.riskTarget;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskTargetName(String riskTargetName) {
            this.riskTargetName = riskTargetName;
            return this;
        }
        public String getRiskTargetName() {
            return this.riskTargetName;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskTargetType(String riskTargetType) {
            this.riskTargetType = riskTargetType;
            return this;
        }
        public String getRiskTargetType() {
            return this.riskTargetType;
        }

        public QueryHasRiskItemResponseBodyResultContentData setRiskTime(String riskTime) {
            this.riskTime = riskTime;
            return this;
        }
        public String getRiskTime() {
            return this.riskTime;
        }

        public QueryHasRiskItemResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskItemResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasRiskItemResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasRiskItemResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRiskItemResponseBodyResultContentData setAdditionalInfo(QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public QueryHasRiskItemResponseBodyResultContentDataAdditionalInfo getAdditionalInfo() {
            return this.additionalInfo;
        }

    }

    public static class QueryHasRiskItemResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRiskItemResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemResponseBodyResultContentTopErrorCode self = new QueryHasRiskItemResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRiskItemResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRiskItemResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemResponseBodyResultContentTopErrorReason self = new QueryHasRiskItemResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskItemResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRiskItemResponseBodyResultContent extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Data")
        public java.util.List<QueryHasRiskItemResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasRiskItemResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRiskItemResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRiskItemResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemResponseBodyResultContent self = new QueryHasRiskItemResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasRiskItemResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasRiskItemResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRiskItemResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasRiskItemResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskItemResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRiskItemResponseBodyResultContent setData(java.util.List<QueryHasRiskItemResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasRiskItemResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasRiskItemResponseBodyResultContent setTopErrorCode(QueryHasRiskItemResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRiskItemResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRiskItemResponseBodyResultContent setTopErrorReason(QueryHasRiskItemResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRiskItemResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
