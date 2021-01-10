// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRiskAggregationdetailResponseBodyResultContent resultContent;

    public static QueryHasRiskAggregationdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationdetailResponseBody self = new QueryHasRiskAggregationdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRiskAggregationdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRiskAggregationdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRiskAggregationdetailResponseBody setResultContent(QueryHasRiskAggregationdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRiskAggregationdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs extends TeaModel {
        @NameInMap("RiskItemId")
        public String riskItemId;

        @NameInMap("ActionTime")
        public String actionTime;

        @NameInMap("Action")
        public String action;

        @NameInMap("Operator")
        public String operator;

        public static QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs self = new QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs setRiskItemId(String riskItemId) {
            this.riskItemId = riskItemId;
            return this;
        }
        public String getRiskItemId() {
            return this.riskItemId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders extends TeaModel {
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

        public static QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders self = new QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setAggregateStatus(String aggregateStatus) {
            this.aggregateStatus = aggregateStatus;
            return this;
        }
        public String getAggregateStatus() {
            return this.aggregateStatus;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders setNotExist(Boolean notExist) {
            this.notExist = notExist;
            return this;
        }
        public Boolean getNotExist() {
            return this.notExist;
        }

    }

    public static class QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo extends TeaModel {
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

        public static QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo self = new QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo setInspectRiskId(String inspectRiskId) {
            this.inspectRiskId = inspectRiskId;
            return this;
        }
        public String getInspectRiskId() {
            return this.inspectRiskId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo setRiskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public String getRiskInfo() {
            return this.riskInfo;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryHasRiskAggregationdetailResponseBodyResultContentData extends TeaModel {
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
        public java.util.List<QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs> actionLogs;

        @NameInMap("RiskOrders")
        public java.util.List<QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders> riskOrders;

        @NameInMap("AdditionalInfo")
        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo additionalInfo;

        public static QueryHasRiskAggregationdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdetailResponseBodyResultContentData self = new QueryHasRiskAggregationdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setCloseComment(String closeComment) {
            this.closeComment = closeComment;
            return this;
        }
        public String getCloseComment() {
            return this.closeComment;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setFirstRiskTime(String firstRiskTime) {
            this.firstRiskTime = firstRiskTime;
            return this;
        }
        public String getFirstRiskTime() {
            return this.firstRiskTime;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setInspectPluginId(String inspectPluginId) {
            this.inspectPluginId = inspectPluginId;
            return this;
        }
        public String getInspectPluginId() {
            return this.inspectPluginId;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setInspectPluginName(String inspectPluginName) {
            this.inspectPluginName = inspectPluginName;
            return this;
        }
        public String getInspectPluginName() {
            return this.inspectPluginName;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setInspectPluginType(String inspectPluginType) {
            this.inspectPluginType = inspectPluginType;
            return this;
        }
        public String getInspectPluginType() {
            return this.inspectPluginType;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setLatestRiskTime(String latestRiskTime) {
            this.latestRiskTime = latestRiskTime;
            return this;
        }
        public String getLatestRiskTime() {
            return this.latestRiskTime;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskFrequency(Long riskFrequency) {
            this.riskFrequency = riskFrequency;
            return this;
        }
        public Long getRiskFrequency() {
            return this.riskFrequency;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskTarget(String riskTarget) {
            this.riskTarget = riskTarget;
            return this;
        }
        public String getRiskTarget() {
            return this.riskTarget;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskTargetName(String riskTargetName) {
            this.riskTargetName = riskTargetName;
            return this;
        }
        public String getRiskTargetName() {
            return this.riskTargetName;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskTargetType(String riskTargetType) {
            this.riskTargetType = riskTargetType;
            return this;
        }
        public String getRiskTargetType() {
            return this.riskTargetType;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setActionLogs(java.util.List<QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs> actionLogs) {
            this.actionLogs = actionLogs;
            return this;
        }
        public java.util.List<QueryHasRiskAggregationdetailResponseBodyResultContentDataActionLogs> getActionLogs() {
            return this.actionLogs;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setRiskOrders(java.util.List<QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders> riskOrders) {
            this.riskOrders = riskOrders;
            return this;
        }
        public java.util.List<QueryHasRiskAggregationdetailResponseBodyResultContentDataRiskOrders> getRiskOrders() {
            return this.riskOrders;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentData setAdditionalInfo(QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public QueryHasRiskAggregationdetailResponseBodyResultContentDataAdditionalInfo getAdditionalInfo() {
            return this.additionalInfo;
        }

    }

    public static class QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode self = new QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason self = new QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRiskAggregationdetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Data")
        public QueryHasRiskAggregationdetailResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRiskAggregationdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskAggregationdetailResponseBodyResultContent self = new QueryHasRiskAggregationdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContent setData(QueryHasRiskAggregationdetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasRiskAggregationdetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContent setTopErrorCode(QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRiskAggregationdetailResponseBodyResultContent setTopErrorReason(QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRiskAggregationdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
