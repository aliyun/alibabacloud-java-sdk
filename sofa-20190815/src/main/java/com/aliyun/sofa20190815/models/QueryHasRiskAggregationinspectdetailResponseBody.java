// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationinspectdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRiskAggregationinspectdetailResponseBodyResultContent resultContent;

    public static QueryHasRiskAggregationinspectdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationinspectdetailResponseBody self = new QueryHasRiskAggregationinspectdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationinspectdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRiskAggregationinspectdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRiskAggregationinspectdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRiskAggregationinspectdetailResponseBody setResultContent(QueryHasRiskAggregationinspectdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRiskAggregationinspectdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs extends TeaModel {
        @NameInMap("RiskItemId")
        public String riskItemId;

        @NameInMap("ActionTime")
        public String actionTime;

        @NameInMap("Action")
        public String action;

        @NameInMap("Operator")
        public String operator;

        public static QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs self = new QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs setRiskItemId(String riskItemId) {
            this.riskItemId = riskItemId;
            return this;
        }
        public String getRiskItemId() {
            return this.riskItemId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        @NameInMap("AggregateStatus")
        public String aggregateStatus;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("NotExist")
        public Boolean notExist;

        public static QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders self = new QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setAggregateStatus(String aggregateStatus) {
            this.aggregateStatus = aggregateStatus;
            return this;
        }
        public String getAggregateStatus() {
            return this.aggregateStatus;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders setNotExist(Boolean notExist) {
            this.notExist = notExist;
            return this;
        }
        public Boolean getNotExist() {
            return this.notExist;
        }

    }

    public static class QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo extends TeaModel {
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

        public static QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo self = new QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo setInspectRiskId(String inspectRiskId) {
            this.inspectRiskId = inspectRiskId;
            return this;
        }
        public String getInspectRiskId() {
            return this.inspectRiskId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo setRiskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public String getRiskInfo() {
            return this.riskInfo;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryHasRiskAggregationinspectdetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("CellId")
        public String cellId;

        @NameInMap("CloseComment")
        public String closeComment;

        @NameInMap("Deadline")
        public String deadline;

        @NameInMap("Description")
        public String description;

        @NameInMap("FirstRiskTime")
        public String firstRiskTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("InspectPluginId")
        public String inspectPluginId;

        @NameInMap("InspectPluginName")
        public String inspectPluginName;

        @NameInMap("InspectPluginType")
        public String inspectPluginType;

        @NameInMap("LatestRiskTime")
        public String latestRiskTime;

        @NameInMap("Resolver")
        public String resolver;

        @NameInMap("RiskFrequency")
        public Long riskFrequency;

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

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("ActionLogs")
        public java.util.List<QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs> actionLogs;

        @NameInMap("RiskOrders")
        public java.util.List<QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders> riskOrders;

        @NameInMap("AdditionalInfo")
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo additionalInfo;

        public static QueryHasRiskAggregationinspectdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationinspectdetailResponseBodyResultContentData self = new QueryHasRiskAggregationinspectdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setCloseComment(String closeComment) {
            this.closeComment = closeComment;
            return this;
        }
        public String getCloseComment() {
            return this.closeComment;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setFirstRiskTime(String firstRiskTime) {
            this.firstRiskTime = firstRiskTime;
            return this;
        }
        public String getFirstRiskTime() {
            return this.firstRiskTime;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setInspectPluginId(String inspectPluginId) {
            this.inspectPluginId = inspectPluginId;
            return this;
        }
        public String getInspectPluginId() {
            return this.inspectPluginId;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setInspectPluginName(String inspectPluginName) {
            this.inspectPluginName = inspectPluginName;
            return this;
        }
        public String getInspectPluginName() {
            return this.inspectPluginName;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setInspectPluginType(String inspectPluginType) {
            this.inspectPluginType = inspectPluginType;
            return this;
        }
        public String getInspectPluginType() {
            return this.inspectPluginType;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setLatestRiskTime(String latestRiskTime) {
            this.latestRiskTime = latestRiskTime;
            return this;
        }
        public String getLatestRiskTime() {
            return this.latestRiskTime;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskFrequency(Long riskFrequency) {
            this.riskFrequency = riskFrequency;
            return this;
        }
        public Long getRiskFrequency() {
            return this.riskFrequency;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskTarget(String riskTarget) {
            this.riskTarget = riskTarget;
            return this;
        }
        public String getRiskTarget() {
            return this.riskTarget;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskTargetName(String riskTargetName) {
            this.riskTargetName = riskTargetName;
            return this;
        }
        public String getRiskTargetName() {
            return this.riskTargetName;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskTargetType(String riskTargetType) {
            this.riskTargetType = riskTargetType;
            return this;
        }
        public String getRiskTargetType() {
            return this.riskTargetType;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setActionLogs(java.util.List<QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs> actionLogs) {
            this.actionLogs = actionLogs;
            return this;
        }
        public java.util.List<QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataActionLogs> getActionLogs() {
            return this.actionLogs;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setRiskOrders(java.util.List<QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders> riskOrders) {
            this.riskOrders = riskOrders;
            return this;
        }
        public java.util.List<QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataRiskOrders> getRiskOrders() {
            return this.riskOrders;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData setAdditionalInfo(QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentDataAdditionalInfo getAdditionalInfo() {
            return this.additionalInfo;
        }

    }

    public static class QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode self = new QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason self = new QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRiskAggregationinspectdetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Data")
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRiskAggregationinspectdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationinspectdetailResponseBodyResultContent self = new QueryHasRiskAggregationinspectdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContent setData(QueryHasRiskAggregationinspectdetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContent setTopErrorCode(QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRiskAggregationinspectdetailResponseBodyResultContent setTopErrorReason(QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRiskAggregationinspectdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
