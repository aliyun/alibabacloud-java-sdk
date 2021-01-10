// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestFinaltaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasRequestFinaltaskResponseBodyData> data;

    public static QueryCasRequestFinaltaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestFinaltaskResponseBody self = new QueryCasRequestFinaltaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestFinaltaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasRequestFinaltaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasRequestFinaltaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasRequestFinaltaskResponseBody setData(java.util.List<QueryCasRequestFinaltaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasRequestFinaltaskResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasRequestFinaltaskResponseBodyDataRequest extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Status")
        public String status;

        @NameInMap("Token")
        public String token;

        @NameInMap("Type")
        public String type;

        public static QueryCasRequestFinaltaskResponseBodyDataRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestFinaltaskResponseBodyDataRequest self = new QueryCasRequestFinaltaskResponseBodyDataRequest();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestFinaltaskResponseBodyDataRequest setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestFinaltaskResponseBodyDataRequest setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryCasRequestFinaltaskResponseBodyDataRequest setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasRequestFinaltaskResponseBodyDataRequest setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public QueryCasRequestFinaltaskResponseBodyDataRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryCasRequestFinaltaskResponseBodyDataResource extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("AutoRenewPeriod")
        public Long autoRenewPeriod;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryCasRequestFinaltaskResponseBodyDataResource build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestFinaltaskResponseBodyDataResource self = new QueryCasRequestFinaltaskResponseBodyDataResource();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasRequestFinaltaskResponseBodyDataResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class QueryCasRequestFinaltaskResponseBodyData extends TeaModel {
        @NameInMap("Context")
        public String context;

        @NameInMap("ExecutionTimes")
        public Long executionTimes;

        @NameInMap("Id")
        public String id;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Request")
        public QueryCasRequestFinaltaskResponseBodyDataRequest request;

        @NameInMap("Resource")
        public QueryCasRequestFinaltaskResponseBodyDataResource resource;

        public static QueryCasRequestFinaltaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestFinaltaskResponseBodyData self = new QueryCasRequestFinaltaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestFinaltaskResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryCasRequestFinaltaskResponseBodyData setExecutionTimes(Long executionTimes) {
            this.executionTimes = executionTimes;
            return this;
        }
        public Long getExecutionTimes() {
            return this.executionTimes;
        }

        public QueryCasRequestFinaltaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestFinaltaskResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCasRequestFinaltaskResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCasRequestFinaltaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasRequestFinaltaskResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasRequestFinaltaskResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasRequestFinaltaskResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasRequestFinaltaskResponseBodyData setRequest(QueryCasRequestFinaltaskResponseBodyDataRequest request) {
            this.request = request;
            return this;
        }
        public QueryCasRequestFinaltaskResponseBodyDataRequest getRequest() {
            return this.request;
        }

        public QueryCasRequestFinaltaskResponseBodyData setResource(QueryCasRequestFinaltaskResponseBodyDataResource resource) {
            this.resource = resource;
            return this;
        }
        public QueryCasRequestFinaltaskResponseBodyDataResource getResource() {
            return this.resource;
        }

    }

}
