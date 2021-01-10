// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertrulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAlertrulesResponseBodyResponse response;

    public static QueryRmsAlertrulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertrulesResponseBody self = new QueryRmsAlertrulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertrulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlertrulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlertrulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlertrulesResponseBody setResponse(QueryRmsAlertrulesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAlertrulesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition extends TeaModel {
        @NameInMap("MonitorItemType")
        public String monitorItemType;

        @NameInMap("MonitorOptionKey")
        public String monitorOptionKey;

        @NameInMap("MonitorPort")
        public Long monitorPort;

        @NameInMap("StatisticalMethod")
        public String statisticalMethod;

        @NameInMap("StatisticalPeriod")
        public Long statisticalPeriod;

        @NameInMap("TriggerCountThreshold")
        public String triggerCountThreshold;

        @NameInMap("TriggerOperator")
        public String triggerOperator;

        @NameInMap("TriggerValueThreshold")
        public Long triggerValueThreshold;

        public static QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition self = new QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setMonitorItemType(String monitorItemType) {
            this.monitorItemType = monitorItemType;
            return this;
        }
        public String getMonitorItemType() {
            return this.monitorItemType;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setMonitorOptionKey(String monitorOptionKey) {
            this.monitorOptionKey = monitorOptionKey;
            return this;
        }
        public String getMonitorOptionKey() {
            return this.monitorOptionKey;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setMonitorPort(Long monitorPort) {
            this.monitorPort = monitorPort;
            return this;
        }
        public Long getMonitorPort() {
            return this.monitorPort;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setStatisticalMethod(String statisticalMethod) {
            this.statisticalMethod = statisticalMethod;
            return this;
        }
        public String getStatisticalMethod() {
            return this.statisticalMethod;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setStatisticalPeriod(Long statisticalPeriod) {
            this.statisticalPeriod = statisticalPeriod;
            return this;
        }
        public Long getStatisticalPeriod() {
            return this.statisticalPeriod;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setTriggerCountThreshold(String triggerCountThreshold) {
            this.triggerCountThreshold = triggerCountThreshold;
            return this;
        }
        public String getTriggerCountThreshold() {
            return this.triggerCountThreshold;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setTriggerOperator(String triggerOperator) {
            this.triggerOperator = triggerOperator;
            return this;
        }
        public String getTriggerOperator() {
            return this.triggerOperator;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition setTriggerValueThreshold(Long triggerValueThreshold) {
            this.triggerValueThreshold = triggerValueThreshold;
            return this;
        }
        public Long getTriggerValueThreshold() {
            return this.triggerValueThreshold;
        }

    }

    public static class QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget extends TeaModel {
        @NameInMap("MonitorTargetId")
        public String monitorTargetId;

        @NameInMap("MonitorTargetName")
        public String monitorTargetName;

        @NameInMap("MonitorTargetType")
        public String monitorTargetType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget self = new QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget setMonitorTargetId(String monitorTargetId) {
            this.monitorTargetId = monitorTargetId;
            return this;
        }
        public String getMonitorTargetId() {
            return this.monitorTargetId;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget setMonitorTargetName(String monitorTargetName) {
            this.monitorTargetName = monitorTargetName;
            return this;
        }
        public String getMonitorTargetName() {
            return this.monitorTargetName;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget setMonitorTargetType(String monitorTargetType) {
            this.monitorTargetType = monitorTargetType;
            return this;
        }
        public String getMonitorTargetType() {
            return this.monitorTargetType;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryRmsAlertrulesResponseBodyResponseEntitiesEntity extends TeaModel {
        @NameInMap("AlertLevel")
        public Long alertLevel;

        @NameInMap("AlertShutEndDateTime")
        public String alertShutEndDateTime;

        @NameInMap("AlertShutReason")
        public String alertShutReason;

        @NameInMap("AlertShutStartDateTime")
        public String alertShutStartDateTime;

        @NameInMap("AlertValidEndTime")
        public String alertValidEndTime;

        @NameInMap("AlertValidStartTime")
        public String alertValidStartTime;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("SilencePeriodMinute")
        public Long silencePeriodMinute;

        @NameInMap("State")
        public String state;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Definition")
        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition definition;

        @NameInMap("MonitorTarget")
        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget monitorTarget;

        public static QueryRmsAlertrulesResponseBodyResponseEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertrulesResponseBodyResponseEntitiesEntity self = new QueryRmsAlertrulesResponseBodyResponseEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setAlertLevel(Long alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Long getAlertLevel() {
            return this.alertLevel;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setAlertShutEndDateTime(String alertShutEndDateTime) {
            this.alertShutEndDateTime = alertShutEndDateTime;
            return this;
        }
        public String getAlertShutEndDateTime() {
            return this.alertShutEndDateTime;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setAlertShutReason(String alertShutReason) {
            this.alertShutReason = alertShutReason;
            return this;
        }
        public String getAlertShutReason() {
            return this.alertShutReason;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setAlertShutStartDateTime(String alertShutStartDateTime) {
            this.alertShutStartDateTime = alertShutStartDateTime;
            return this;
        }
        public String getAlertShutStartDateTime() {
            return this.alertShutStartDateTime;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setAlertValidEndTime(String alertValidEndTime) {
            this.alertValidEndTime = alertValidEndTime;
            return this;
        }
        public String getAlertValidEndTime() {
            return this.alertValidEndTime;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setAlertValidStartTime(String alertValidStartTime) {
            this.alertValidStartTime = alertValidStartTime;
            return this;
        }
        public String getAlertValidStartTime() {
            return this.alertValidStartTime;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setSilencePeriodMinute(Long silencePeriodMinute) {
            this.silencePeriodMinute = silencePeriodMinute;
            return this;
        }
        public Long getSilencePeriodMinute() {
            return this.silencePeriodMinute;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setDefinition(QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition definition) {
            this.definition = definition;
            return this;
        }
        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityDefinition getDefinition() {
            return this.definition;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity setMonitorTarget(QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget monitorTarget) {
            this.monitorTarget = monitorTarget;
            return this;
        }
        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntityMonitorTarget getMonitorTarget() {
            return this.monitorTarget;
        }

    }

    public static class QueryRmsAlertrulesResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity entity;

        public static QueryRmsAlertrulesResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertrulesResponseBodyResponseEntities self = new QueryRmsAlertrulesResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertrulesResponseBodyResponseEntities setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsAlertrulesResponseBodyResponseEntities setEntity(QueryRmsAlertrulesResponseBodyResponseEntitiesEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAlertrulesResponseBodyResponseEntitiesEntity getEntity() {
            return this.entity;
        }

    }

    public static class QueryRmsAlertrulesResponseBodyResponseMetaPage extends TeaModel {
        @NameInMap("Limit")
        public Long limit;

        @NameInMap("Offset")
        public Long offset;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static QueryRmsAlertrulesResponseBodyResponseMetaPage build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertrulesResponseBodyResponseMetaPage self = new QueryRmsAlertrulesResponseBodyResponseMetaPage();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertrulesResponseBodyResponseMetaPage setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public QueryRmsAlertrulesResponseBodyResponseMetaPage setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public QueryRmsAlertrulesResponseBodyResponseMetaPage setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class QueryRmsAlertrulesResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Page")
        public QueryRmsAlertrulesResponseBodyResponseMetaPage page;

        public static QueryRmsAlertrulesResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertrulesResponseBodyResponseMeta self = new QueryRmsAlertrulesResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertrulesResponseBodyResponseMeta setPage(QueryRmsAlertrulesResponseBodyResponseMetaPage page) {
            this.page = page;
            return this;
        }
        public QueryRmsAlertrulesResponseBodyResponseMetaPage getPage() {
            return this.page;
        }

    }

    public static class QueryRmsAlertrulesResponseBodyResponse extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<QueryRmsAlertrulesResponseBodyResponseEntities> entities;

        @NameInMap("Meta")
        public QueryRmsAlertrulesResponseBodyResponseMeta meta;

        public static QueryRmsAlertrulesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertrulesResponseBodyResponse self = new QueryRmsAlertrulesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertrulesResponseBodyResponse setEntities(java.util.List<QueryRmsAlertrulesResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryRmsAlertrulesResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public QueryRmsAlertrulesResponseBodyResponse setMeta(QueryRmsAlertrulesResponseBodyResponseMeta meta) {
            this.meta = meta;
            return this;
        }
        public QueryRmsAlertrulesResponseBodyResponseMeta getMeta() {
            return this.meta;
        }

    }

}
