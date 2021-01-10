// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayrisklistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent resultContent;

    public static QueryHasLocaloverviewTodayrisklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayrisklistResponseBody self = new QueryHasLocaloverviewTodayrisklistResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayrisklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasLocaloverviewTodayrisklistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasLocaloverviewTodayrisklistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasLocaloverviewTodayrisklistResponseBody setResultContent(QueryHasLocaloverviewTodayrisklistResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs extends TeaModel {
        @NameInMap("RiskItemId")
        public String riskItemId;

        @NameInMap("ActionTime")
        public String actionTime;

        @NameInMap("Action")
        public String action;

        @NameInMap("Operator")
        public String operator;

        public static QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs self = new QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs setRiskItemId(String riskItemId) {
            this.riskItemId = riskItemId;
            return this;
        }
        public String getRiskItemId() {
            return this.riskItemId;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders extends TeaModel {
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

        public static QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders self = new QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setAggregateStatus(String aggregateStatus) {
            this.aggregateStatus = aggregateStatus;
            return this;
        }
        public String getAggregateStatus() {
            return this.aggregateStatus;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders setNotExist(Boolean notExist) {
            this.notExist = notExist;
            return this;
        }
        public Boolean getNotExist() {
            return this.notExist;
        }

    }

    public static class QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData extends TeaModel {
        @NameInMap("AdditionalInfo")
        public String additionalInfo;

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

        @NameInMap("Id")
        public String id;

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

        @NameInMap("ActionLogs")
        public java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs> actionLogs;

        @NameInMap("RiskOrders")
        public java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders> riskOrders;

        public static QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData self = new QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setAggregationRiskItemId(String aggregationRiskItemId) {
            this.aggregationRiskItemId = aggregationRiskItemId;
            return this;
        }
        public String getAggregationRiskItemId() {
            return this.aggregationRiskItemId;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setCloseComment(String closeComment) {
            this.closeComment = closeComment;
            return this;
        }
        public String getCloseComment() {
            return this.closeComment;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskEvent(String riskEvent) {
            this.riskEvent = riskEvent;
            return this;
        }
        public String getRiskEvent() {
            return this.riskEvent;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskTarget(String riskTarget) {
            this.riskTarget = riskTarget;
            return this;
        }
        public String getRiskTarget() {
            return this.riskTarget;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskTargetName(String riskTargetName) {
            this.riskTargetName = riskTargetName;
            return this;
        }
        public String getRiskTargetName() {
            return this.riskTargetName;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskTargetType(String riskTargetType) {
            this.riskTargetType = riskTargetType;
            return this;
        }
        public String getRiskTargetType() {
            return this.riskTargetType;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskTime(String riskTime) {
            this.riskTime = riskTime;
            return this;
        }
        public String getRiskTime() {
            return this.riskTime;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setActionLogs(java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs> actionLogs) {
            this.actionLogs = actionLogs;
            return this;
        }
        public java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataActionLogs> getActionLogs() {
            return this.actionLogs;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData setRiskOrders(java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders> riskOrders) {
            this.riskOrders = riskOrders;
            return this;
        }
        public java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentDataRiskOrders> getRiskOrders() {
            return this.riskOrders;
        }

    }

    public static class QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode self = new QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason self = new QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasLocaloverviewTodayrisklistResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasLocaloverviewTodayrisklistResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayrisklistResponseBodyResultContent self = new QueryHasLocaloverviewTodayrisklistResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent setData(java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasLocaloverviewTodayrisklistResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent setTopErrorCode(QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContent setTopErrorReason(QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasLocaloverviewTodayrisklistResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
