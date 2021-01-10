// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAlertRecordsResponseBodyResponse response;

    public static QueryRmsAlertRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertRecordsResponseBody self = new QueryRmsAlertRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlertRecordsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlertRecordsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlertRecordsResponseBody setResponse(QueryRmsAlertRecordsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAlertRecordsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TargetLoginName")
        public String targetLoginName;

        @NameInMap("Type")
        public String type;

        public static QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults self = new QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults setTargetLoginName(String targetLoginName) {
            this.targetLoginName = targetLoginName;
            return this;
        }
        public String getTargetLoginName() {
            return this.targetLoginName;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryRmsAlertRecordsResponseBodyResponseEntityData extends TeaModel {
        @NameInMap("AlertRuleId")
        public Long alertRuleId;

        @NameInMap("Id")
        public String id;

        @NameInMap("MonitorItemType")
        public String monitorItemType;

        @NameInMap("MonitorOpotionKey")
        public String monitorOpotionKey;

        @NameInMap("MonitorOptionKey")
        public String monitorOptionKey;

        @NameInMap("MonitorPort")
        public Long monitorPort;

        @NameInMap("MonitorTargetId")
        public String monitorTargetId;

        @NameInMap("MonitorTargetName")
        public String monitorTargetName;

        @NameInMap("MonitorTargetType")
        public String monitorTargetType;

        @NameInMap("NotificationState")
        public String notificationState;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TriggerState")
        public String triggerState;

        @NameInMap("TriggerValue")
        public Long triggerValue;

        @NameInMap("TriggerValueThreshold")
        public String triggerValueThreshold;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("NotificationResults")
        public java.util.List<QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults> notificationResults;

        public static QueryRmsAlertRecordsResponseBodyResponseEntityData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRecordsResponseBodyResponseEntityData self = new QueryRmsAlertRecordsResponseBodyResponseEntityData();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setAlertRuleId(Long alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }
        public Long getAlertRuleId() {
            return this.alertRuleId;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setMonitorItemType(String monitorItemType) {
            this.monitorItemType = monitorItemType;
            return this;
        }
        public String getMonitorItemType() {
            return this.monitorItemType;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setMonitorOpotionKey(String monitorOpotionKey) {
            this.monitorOpotionKey = monitorOpotionKey;
            return this;
        }
        public String getMonitorOpotionKey() {
            return this.monitorOpotionKey;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setMonitorOptionKey(String monitorOptionKey) {
            this.monitorOptionKey = monitorOptionKey;
            return this;
        }
        public String getMonitorOptionKey() {
            return this.monitorOptionKey;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setMonitorPort(Long monitorPort) {
            this.monitorPort = monitorPort;
            return this;
        }
        public Long getMonitorPort() {
            return this.monitorPort;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setMonitorTargetId(String monitorTargetId) {
            this.monitorTargetId = monitorTargetId;
            return this;
        }
        public String getMonitorTargetId() {
            return this.monitorTargetId;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setMonitorTargetName(String monitorTargetName) {
            this.monitorTargetName = monitorTargetName;
            return this;
        }
        public String getMonitorTargetName() {
            return this.monitorTargetName;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setMonitorTargetType(String monitorTargetType) {
            this.monitorTargetType = monitorTargetType;
            return this;
        }
        public String getMonitorTargetType() {
            return this.monitorTargetType;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setNotificationState(String notificationState) {
            this.notificationState = notificationState;
            return this;
        }
        public String getNotificationState() {
            return this.notificationState;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setTriggerState(String triggerState) {
            this.triggerState = triggerState;
            return this;
        }
        public String getTriggerState() {
            return this.triggerState;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setTriggerValue(Long triggerValue) {
            this.triggerValue = triggerValue;
            return this;
        }
        public Long getTriggerValue() {
            return this.triggerValue;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setTriggerValueThreshold(String triggerValueThreshold) {
            this.triggerValueThreshold = triggerValueThreshold;
            return this;
        }
        public String getTriggerValueThreshold() {
            return this.triggerValueThreshold;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntityData setNotificationResults(java.util.List<QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults> notificationResults) {
            this.notificationResults = notificationResults;
            return this;
        }
        public java.util.List<QueryRmsAlertRecordsResponseBodyResponseEntityDataNotificationResults> getNotificationResults() {
            return this.notificationResults;
        }

    }

    public static class QueryRmsAlertRecordsResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryRmsAlertRecordsResponseBodyResponseEntityData> data;

        public static QueryRmsAlertRecordsResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRecordsResponseBodyResponseEntity self = new QueryRmsAlertRecordsResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRecordsResponseBodyResponseEntity setData(java.util.List<QueryRmsAlertRecordsResponseBodyResponseEntityData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsAlertRecordsResponseBodyResponseEntityData> getData() {
            return this.data;
        }

    }

    public static class QueryRmsAlertRecordsResponseBodyResponse extends TeaModel {
        @NameInMap("Entity")
        public QueryRmsAlertRecordsResponseBodyResponseEntity entity;

        public static QueryRmsAlertRecordsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRecordsResponseBodyResponse self = new QueryRmsAlertRecordsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRecordsResponseBodyResponse setEntity(QueryRmsAlertRecordsResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAlertRecordsResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
