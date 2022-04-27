// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListServerGroupsResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsResponseBody self = new ListServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServerGroupsResponseBody setData(ListServerGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListServerGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListServerGroupsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListServerGroupsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListServerGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListServerGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServerGroupsResponseBodyDataServerGroupsHealthCheck extends TeaModel {
        // 健康检查使用的端口
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        // 健康检查响应的最大超时时间
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        // 健康检查的域名
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        // 是否开启健康检查
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        // 状态码，多个状态码用逗号分隔
        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        // 健康检查时间间隔
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        // 健康检查协议类型
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        // 健康检查的url
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static ListServerGroupsResponseBodyDataServerGroupsHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyDataServerGroupsHealthCheck self = new ListServerGroupsResponseBodyDataServerGroupsHealthCheck();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class ListServerGroupsResponseBodyDataServerGroups extends TeaModel {
        // 服务器组地址类型
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("AliUid")
        public Long aliUid;

        // 连接优雅中断开关
        @NameInMap("ConnectionDrain")
        public Boolean connectionDrain;

        // 连接优雅中断超时时间
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        // 会话保持开关
        @NameInMap("ConnectionPersistence")
        public Boolean connectionPersistence;

        // 会话保持超时时间
        @NameInMap("ConnectionPersistenceTimeout")
        public Integer connectionPersistenceTimeout;

        // 健康检查配置
        @NameInMap("HealthCheck")
        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck healthCheck;

        // 后端协议
        @NameInMap("Protocol")
        public String protocol;

        // 业务region
        @NameInMap("RegionId")
        public String regionId;

        // 资源组id
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        // 调度类型
        @NameInMap("Scheduler")
        public String scheduler;

        // 服务器组id
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        // 服务器组名称
        @NameInMap("ServerGroupName")
        public String serverGroupName;

        // 状态
        @NameInMap("ServerGroupStatus")
        public String serverGroupStatus;

        // 服务器组类型
        @NameInMap("ServerGroupType")
        public String serverGroupType;

        // 服务器组的vpcid
        @NameInMap("VpcId")
        public String vpcId;

        public static ListServerGroupsResponseBodyDataServerGroups build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyDataServerGroups self = new ListServerGroupsResponseBodyDataServerGroups();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyDataServerGroups setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListServerGroupsResponseBodyDataServerGroups setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListServerGroupsResponseBodyDataServerGroups setConnectionDrain(Boolean connectionDrain) {
            this.connectionDrain = connectionDrain;
            return this;
        }
        public Boolean getConnectionDrain() {
            return this.connectionDrain;
        }

        public ListServerGroupsResponseBodyDataServerGroups setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        public ListServerGroupsResponseBodyDataServerGroups setConnectionPersistence(Boolean connectionPersistence) {
            this.connectionPersistence = connectionPersistence;
            return this;
        }
        public Boolean getConnectionPersistence() {
            return this.connectionPersistence;
        }

        public ListServerGroupsResponseBodyDataServerGroups setConnectionPersistenceTimeout(Integer connectionPersistenceTimeout) {
            this.connectionPersistenceTimeout = connectionPersistenceTimeout;
            return this;
        }
        public Integer getConnectionPersistenceTimeout() {
            return this.connectionPersistenceTimeout;
        }

        public ListServerGroupsResponseBodyDataServerGroups setHealthCheck(ListServerGroupsResponseBodyDataServerGroupsHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public ListServerGroupsResponseBodyDataServerGroupsHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public ListServerGroupsResponseBodyDataServerGroups setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListServerGroupsResponseBodyDataServerGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListServerGroupsResponseBodyDataServerGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListServerGroupsResponseBodyDataServerGroups setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListServerGroupsResponseBodyDataServerGroups setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public ListServerGroupsResponseBodyDataServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public ListServerGroupsResponseBodyDataServerGroups setServerGroupName(String serverGroupName) {
            this.serverGroupName = serverGroupName;
            return this;
        }
        public String getServerGroupName() {
            return this.serverGroupName;
        }

        public ListServerGroupsResponseBodyDataServerGroups setServerGroupStatus(String serverGroupStatus) {
            this.serverGroupStatus = serverGroupStatus;
            return this;
        }
        public String getServerGroupStatus() {
            return this.serverGroupStatus;
        }

        public ListServerGroupsResponseBodyDataServerGroups setServerGroupType(String serverGroupType) {
            this.serverGroupType = serverGroupType;
            return this;
        }
        public String getServerGroupType() {
            return this.serverGroupType;
        }

        public ListServerGroupsResponseBodyDataServerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListServerGroupsResponseBodyData extends TeaModel {
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("ServerGroups")
        public java.util.List<ListServerGroupsResponseBodyDataServerGroups> serverGroups;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListServerGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyData self = new ListServerGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListServerGroupsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListServerGroupsResponseBodyData setServerGroups(java.util.List<ListServerGroupsResponseBodyDataServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }
        public java.util.List<ListServerGroupsResponseBodyDataServerGroups> getServerGroups() {
            return this.serverGroups;
        }

        public ListServerGroupsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
