// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertRuleSubscribesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAlertRuleSubscribesResponseBodyResponse response;

    public static QueryRmsAlertRuleSubscribesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertRuleSubscribesResponseBody self = new QueryRmsAlertRuleSubscribesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertRuleSubscribesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlertRuleSubscribesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlertRuleSubscribesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlertRuleSubscribesResponseBody setResponse(QueryRmsAlertRuleSubscribesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAlertRuleSubscribesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity extends TeaModel {
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

        public static QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity self = new QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setMonitorTargetType(String monitorTargetType) {
            this.monitorTargetType = monitorTargetType;
            return this;
        }
        public String getMonitorTargetType() {
            return this.monitorTargetType;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setSubscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
            return this;
        }
        public String getSubscriberId() {
            return this.subscriberId;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setSubscriberLoginName(String subscriberLoginName) {
            this.subscriberLoginName = subscriberLoginName;
            return this;
        }
        public String getSubscriberLoginName() {
            return this.subscriberLoginName;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
            return this;
        }
        public String getSubscriberType() {
            return this.subscriberType;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setSubscriptionTargetId(String subscriptionTargetId) {
            this.subscriptionTargetId = subscriptionTargetId;
            return this;
        }
        public String getSubscriptionTargetId() {
            return this.subscriptionTargetId;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setSubscriptionTargetType(String subscriptionTargetType) {
            this.subscriptionTargetType = subscriptionTargetType;
            return this;
        }
        public String getSubscriptionTargetType() {
            return this.subscriptionTargetType;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryRmsAlertRuleSubscribesResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Entity")
        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity entity;

        public static QueryRmsAlertRuleSubscribesResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRuleSubscribesResponseBodyResponseEntities self = new QueryRmsAlertRuleSubscribesResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntities setEntity(QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAlertRuleSubscribesResponseBodyResponseEntitiesEntity getEntity() {
            return this.entity;
        }

    }

    public static class QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage extends TeaModel {
        @NameInMap("Limit")
        public Long limit;

        @NameInMap("Offset")
        public Long offset;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage self = new QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class QueryRmsAlertRuleSubscribesResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Page")
        public QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage page;

        public static QueryRmsAlertRuleSubscribesResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRuleSubscribesResponseBodyResponseMeta self = new QueryRmsAlertRuleSubscribesResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponseMeta setPage(QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage page) {
            this.page = page;
            return this;
        }
        public QueryRmsAlertRuleSubscribesResponseBodyResponseMetaPage getPage() {
            return this.page;
        }

    }

    public static class QueryRmsAlertRuleSubscribesResponseBodyResponse extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<QueryRmsAlertRuleSubscribesResponseBodyResponseEntities> entities;

        @NameInMap("Meta")
        public QueryRmsAlertRuleSubscribesResponseBodyResponseMeta meta;

        public static QueryRmsAlertRuleSubscribesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertRuleSubscribesResponseBodyResponse self = new QueryRmsAlertRuleSubscribesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponse setEntities(java.util.List<QueryRmsAlertRuleSubscribesResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryRmsAlertRuleSubscribesResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public QueryRmsAlertRuleSubscribesResponseBodyResponse setMeta(QueryRmsAlertRuleSubscribesResponseBodyResponseMeta meta) {
            this.meta = meta;
            return this;
        }
        public QueryRmsAlertRuleSubscribesResponseBodyResponseMeta getMeta() {
            return this.meta;
        }

    }

}
