// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmrecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAlarmrecordsResponseBodyResponse response;

    public static QueryRmsAlarmrecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmrecordsResponseBody self = new QueryRmsAlarmrecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmrecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlarmrecordsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlarmrecordsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlarmrecordsResponseBody setResponse(QueryRmsAlarmrecordsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAlarmrecordsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos extends TeaModel {
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

        public static QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos self = new QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos setTargetLoginName(String targetLoginName) {
            this.targetLoginName = targetLoginName;
            return this;
        }
        public String getTargetLoginName() {
            return this.targetLoginName;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity extends TeaModel {
        @NameInMap("AlarmTime")
        public String alarmTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MonitorItemType")
        public String monitorItemType;

        @NameInMap("MonitorPort")
        public Long monitorPort;

        @NameInMap("MonitorTargetType")
        public String monitorTargetType;

        @NameInMap("NotificationState")
        public String notificationState;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("TriggerState")
        public String triggerState;

        @NameInMap("TriggerValue")
        public Long triggerValue;

        @NameInMap("NotificationResultVos")
        public java.util.List<QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos> notificationResultVos;

        public static QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity self = new QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public String getAlarmTime() {
            return this.alarmTime;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setMonitorItemType(String monitorItemType) {
            this.monitorItemType = monitorItemType;
            return this;
        }
        public String getMonitorItemType() {
            return this.monitorItemType;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setMonitorPort(Long monitorPort) {
            this.monitorPort = monitorPort;
            return this;
        }
        public Long getMonitorPort() {
            return this.monitorPort;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setMonitorTargetType(String monitorTargetType) {
            this.monitorTargetType = monitorTargetType;
            return this;
        }
        public String getMonitorTargetType() {
            return this.monitorTargetType;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setNotificationState(String notificationState) {
            this.notificationState = notificationState;
            return this;
        }
        public String getNotificationState() {
            return this.notificationState;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setTriggerState(String triggerState) {
            this.triggerState = triggerState;
            return this;
        }
        public String getTriggerState() {
            return this.triggerState;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setTriggerValue(Long triggerValue) {
            this.triggerValue = triggerValue;
            return this;
        }
        public Long getTriggerValue() {
            return this.triggerValue;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity setNotificationResultVos(java.util.List<QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos> notificationResultVos) {
            this.notificationResultVos = notificationResultVos;
            return this;
        }
        public java.util.List<QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntityNotificationResultVos> getNotificationResultVos() {
            return this.notificationResultVos;
        }

    }

    public static class QueryRmsAlarmrecordsResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Entity")
        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity entity;

        public static QueryRmsAlarmrecordsResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmrecordsResponseBodyResponseEntities self = new QueryRmsAlarmrecordsResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmrecordsResponseBodyResponseEntities setEntity(QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAlarmrecordsResponseBodyResponseEntitiesEntity getEntity() {
            return this.entity;
        }

    }

    public static class QueryRmsAlarmrecordsResponseBodyResponseMetaPage extends TeaModel {
        @NameInMap("Limit")
        public Long limit;

        @NameInMap("Offset")
        public Long offset;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static QueryRmsAlarmrecordsResponseBodyResponseMetaPage build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmrecordsResponseBodyResponseMetaPage self = new QueryRmsAlarmrecordsResponseBodyResponseMetaPage();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmrecordsResponseBodyResponseMetaPage setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseMetaPage setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public QueryRmsAlarmrecordsResponseBodyResponseMetaPage setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class QueryRmsAlarmrecordsResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Page")
        public QueryRmsAlarmrecordsResponseBodyResponseMetaPage page;

        public static QueryRmsAlarmrecordsResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmrecordsResponseBodyResponseMeta self = new QueryRmsAlarmrecordsResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmrecordsResponseBodyResponseMeta setPage(QueryRmsAlarmrecordsResponseBodyResponseMetaPage page) {
            this.page = page;
            return this;
        }
        public QueryRmsAlarmrecordsResponseBodyResponseMetaPage getPage() {
            return this.page;
        }

    }

    public static class QueryRmsAlarmrecordsResponseBodyResponse extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<QueryRmsAlarmrecordsResponseBodyResponseEntities> entities;

        @NameInMap("Meta")
        public QueryRmsAlarmrecordsResponseBodyResponseMeta meta;

        public static QueryRmsAlarmrecordsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmrecordsResponseBodyResponse self = new QueryRmsAlarmrecordsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmrecordsResponseBodyResponse setEntities(java.util.List<QueryRmsAlarmrecordsResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryRmsAlarmrecordsResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public QueryRmsAlarmrecordsResponseBodyResponse setMeta(QueryRmsAlarmrecordsResponseBodyResponseMeta meta) {
            this.meta = meta;
            return this;
        }
        public QueryRmsAlarmrecordsResponseBodyResponseMeta getMeta() {
            return this.meta;
        }

    }

}
