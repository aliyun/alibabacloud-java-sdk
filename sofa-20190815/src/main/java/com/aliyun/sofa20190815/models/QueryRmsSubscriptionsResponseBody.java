// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsSubscriptionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsSubscriptionsResponseBodyResponse response;

    public static QueryRmsSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsSubscriptionsResponseBody self = new QueryRmsSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsSubscriptionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsSubscriptionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsSubscriptionsResponseBody setResponse(QueryRmsSubscriptionsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsSubscriptionsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MonitorTargetType")
        public String monitorTargetType;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("SubscriberId")
        public String subscriberId;

        @NameInMap("SubscriberLoginName")
        public String subscriberLoginName;

        @NameInMap("SubscriberType")
        public String subscriberType;

        @NameInMap("SubscriptionTargetId")
        public String subscriptionTargetId;

        @NameInMap("SubscriptionTargetType")
        public String subscriptionTargetType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity self = new QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setMonitorTargetType(String monitorTargetType) {
            this.monitorTargetType = monitorTargetType;
            return this;
        }
        public String getMonitorTargetType() {
            return this.monitorTargetType;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setSubscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
            return this;
        }
        public String getSubscriberId() {
            return this.subscriberId;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setSubscriberLoginName(String subscriberLoginName) {
            this.subscriberLoginName = subscriberLoginName;
            return this;
        }
        public String getSubscriberLoginName() {
            return this.subscriberLoginName;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
            return this;
        }
        public String getSubscriberType() {
            return this.subscriberType;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setSubscriptionTargetId(String subscriptionTargetId) {
            this.subscriptionTargetId = subscriptionTargetId;
            return this;
        }
        public String getSubscriptionTargetId() {
            return this.subscriptionTargetId;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setSubscriptionTargetType(String subscriptionTargetType) {
            this.subscriptionTargetType = subscriptionTargetType;
            return this;
        }
        public String getSubscriptionTargetType() {
            return this.subscriptionTargetType;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryRmsSubscriptionsResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Entity")
        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity entity;

        public static QueryRmsSubscriptionsResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsSubscriptionsResponseBodyResponseEntities self = new QueryRmsSubscriptionsResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public QueryRmsSubscriptionsResponseBodyResponseEntities setEntity(QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsSubscriptionsResponseBodyResponseEntitiesEntity getEntity() {
            return this.entity;
        }

    }

    public static class QueryRmsSubscriptionsResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryRmsSubscriptionsResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsSubscriptionsResponseBodyResponseMeta self = new QueryRmsSubscriptionsResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public QueryRmsSubscriptionsResponseBodyResponseMeta setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsSubscriptionsResponseBodyResponseMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsSubscriptionsResponseBodyResponse extends TeaModel {
        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrResolution")
        public String errResolution;

        @NameInMap("Entities")
        public java.util.List<QueryRmsSubscriptionsResponseBodyResponseEntities> entities;

        @NameInMap("Meta")
        public java.util.List<QueryRmsSubscriptionsResponseBodyResponseMeta> meta;

        public static QueryRmsSubscriptionsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsSubscriptionsResponseBodyResponse self = new QueryRmsSubscriptionsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsSubscriptionsResponseBodyResponse setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QueryRmsSubscriptionsResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsSubscriptionsResponseBodyResponse setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public QueryRmsSubscriptionsResponseBodyResponse setEntities(java.util.List<QueryRmsSubscriptionsResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryRmsSubscriptionsResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public QueryRmsSubscriptionsResponseBodyResponse setMeta(java.util.List<QueryRmsSubscriptionsResponseBodyResponseMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryRmsSubscriptionsResponseBodyResponseMeta> getMeta() {
            return this.meta;
        }

    }

}
