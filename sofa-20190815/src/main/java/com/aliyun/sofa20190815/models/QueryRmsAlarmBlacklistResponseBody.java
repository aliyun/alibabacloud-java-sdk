// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmBlacklistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAlarmBlacklistResponseBodyResponse response;

    public static QueryRmsAlarmBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmBlacklistResponseBody self = new QueryRmsAlarmBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlarmBlacklistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlarmBlacklistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlarmBlacklistResponseBody setResponse(QueryRmsAlarmBlacklistResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAlarmBlacklistResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity extends TeaModel {
        @NameInMap("ApplyTargetId")
        public String applyTargetId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ResId")
        public String resId;

        @NameInMap("ResName")
        public String resName;

        @NameInMap("ResType")
        public String resType;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("ValidEndTime")
        public String validEndTime;

        @NameInMap("ValidStartTime")
        public String validStartTime;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity self = new QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setApplyTargetId(String applyTargetId) {
            this.applyTargetId = applyTargetId;
            return this;
        }
        public String getApplyTargetId() {
            return this.applyTargetId;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }
        public String getValidEndTime() {
            return this.validEndTime;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setValidStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }
        public String getValidStartTime() {
            return this.validStartTime;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryRmsAlarmBlacklistResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity entity;

        public static QueryRmsAlarmBlacklistResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmBlacklistResponseBodyResponseEntities self = new QueryRmsAlarmBlacklistResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntities setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseEntities setEntity(QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAlarmBlacklistResponseBodyResponseEntitiesEntity getEntity() {
            return this.entity;
        }

    }

    public static class QueryRmsAlarmBlacklistResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryRmsAlarmBlacklistResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmBlacklistResponseBodyResponseMeta self = new QueryRmsAlarmBlacklistResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseMeta setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponseMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsAlarmBlacklistResponseBodyResponse extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<QueryRmsAlarmBlacklistResponseBodyResponseEntities> entities;

        @NameInMap("Meta")
        public java.util.List<QueryRmsAlarmBlacklistResponseBodyResponseMeta> meta;

        public static QueryRmsAlarmBlacklistResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmBlacklistResponseBodyResponse self = new QueryRmsAlarmBlacklistResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmBlacklistResponseBodyResponse setEntities(java.util.List<QueryRmsAlarmBlacklistResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryRmsAlarmBlacklistResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public QueryRmsAlarmBlacklistResponseBodyResponse setMeta(java.util.List<QueryRmsAlarmBlacklistResponseBodyResponseMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryRmsAlarmBlacklistResponseBodyResponseMeta> getMeta() {
            return this.meta;
        }

    }

}
