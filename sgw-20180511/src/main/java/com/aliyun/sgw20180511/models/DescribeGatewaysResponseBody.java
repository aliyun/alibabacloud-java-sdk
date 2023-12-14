// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Gateways")
    public DescribeGatewaysResponseBodyGateways gateways;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysResponseBody self = new DescribeGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewaysResponseBody setGateways(DescribeGatewaysResponseBodyGateways gateways) {
        this.gateways = gateways;
        return this;
    }
    public DescribeGatewaysResponseBodyGateways getGateways() {
        return this.gateways;
    }

    public DescribeGatewaysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewaysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes extends TeaModel {
        @NameInMap("ElasticNode")
        public java.util.List<String> elasticNode;

        public static DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes self = new DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes setElasticNode(java.util.List<String> elasticNode) {
            this.elasticNode = elasticNode;
            return this;
        }
        public java.util.List<String> getElasticNode() {
            return this.elasticNode;
        }

    }

    public static class DescribeGatewaysResponseBodyGatewaysGateway extends TeaModel {
        @NameInMap("ActivatedTime")
        public Long activatedTime;

        @NameInMap("BuyURL")
        public String buyURL;

        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("Category")
        public String category;

        @NameInMap("CommonBuyInstanceId")
        public String commonBuyInstanceId;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("DataLoadInterval")
        public Integer dataLoadInterval;

        @NameInMap("DataLoadType")
        public String dataLoadType;

        @NameInMap("Description")
        public String description;

        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("ElasticGateway")
        public Boolean elasticGateway;

        @NameInMap("ElasticNodes")
        public DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes elasticNodes;

        @NameInMap("ExpireStatus")
        public Integer expireStatus;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("GatewayClass")
        public String gatewayClass;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayRegionId")
        public String gatewayRegionId;

        @NameInMap("GatewayType")
        public String gatewayType;

        @NameInMap("GatewayVersion")
        public String gatewayVersion;

        @NameInMap("InnerIp")
        public String innerIp;

        @NameInMap("InnerIpv6Ip")
        public String innerIpv6Ip;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IsPostPaid")
        public Boolean isPostPaid;

        @NameInMap("IsReleaseAfterExpiration")
        public Boolean isReleaseAfterExpiration;

        @NameInMap("LastErrorKey")
        public String lastErrorKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("MaxThroughput")
        public Integer maxThroughput;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublicNetworkBandwidth")
        public Integer publicNetworkBandwidth;

        @NameInMap("RenewURL")
        public String renewURL;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageBundleId")
        public String storageBundleId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeGatewaysResponseBodyGatewaysGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysResponseBodyGatewaysGateway self = new DescribeGatewaysResponseBodyGatewaysGateway();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setActivatedTime(Long activatedTime) {
            this.activatedTime = activatedTime;
            return this;
        }
        public Long getActivatedTime() {
            return this.activatedTime;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setBuyURL(String buyURL) {
            this.buyURL = buyURL;
            return this;
        }
        public String getBuyURL() {
            return this.buyURL;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setCommonBuyInstanceId(String commonBuyInstanceId) {
            this.commonBuyInstanceId = commonBuyInstanceId;
            return this;
        }
        public String getCommonBuyInstanceId() {
            return this.commonBuyInstanceId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setDataLoadInterval(Integer dataLoadInterval) {
            this.dataLoadInterval = dataLoadInterval;
            return this;
        }
        public Integer getDataLoadInterval() {
            return this.dataLoadInterval;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setDataLoadType(String dataLoadType) {
            this.dataLoadType = dataLoadType;
            return this;
        }
        public String getDataLoadType() {
            return this.dataLoadType;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setElasticGateway(Boolean elasticGateway) {
            this.elasticGateway = elasticGateway;
            return this;
        }
        public Boolean getElasticGateway() {
            return this.elasticGateway;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setElasticNodes(DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes elasticNodes) {
            this.elasticNodes = elasticNodes;
            return this;
        }
        public DescribeGatewaysResponseBodyGatewaysGatewayElasticNodes getElasticNodes() {
            return this.elasticNodes;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setExpireStatus(Integer expireStatus) {
            this.expireStatus = expireStatus;
            return this;
        }
        public Integer getExpireStatus() {
            return this.expireStatus;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayClass(String gatewayClass) {
            this.gatewayClass = gatewayClass;
            return this;
        }
        public String getGatewayClass() {
            return this.gatewayClass;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayRegionId(String gatewayRegionId) {
            this.gatewayRegionId = gatewayRegionId;
            return this;
        }
        public String getGatewayRegionId() {
            return this.gatewayRegionId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayVersion(String gatewayVersion) {
            this.gatewayVersion = gatewayVersion;
            return this;
        }
        public String getGatewayVersion() {
            return this.gatewayVersion;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setInnerIpv6Ip(String innerIpv6Ip) {
            this.innerIpv6Ip = innerIpv6Ip;
            return this;
        }
        public String getInnerIpv6Ip() {
            return this.innerIpv6Ip;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setIsPostPaid(Boolean isPostPaid) {
            this.isPostPaid = isPostPaid;
            return this;
        }
        public Boolean getIsPostPaid() {
            return this.isPostPaid;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setIsReleaseAfterExpiration(Boolean isReleaseAfterExpiration) {
            this.isReleaseAfterExpiration = isReleaseAfterExpiration;
            return this;
        }
        public Boolean getIsReleaseAfterExpiration() {
            return this.isReleaseAfterExpiration;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setLastErrorKey(String lastErrorKey) {
            this.lastErrorKey = lastErrorKey;
            return this;
        }
        public String getLastErrorKey() {
            return this.lastErrorKey;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setMaxThroughput(Integer maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }
        public Integer getMaxThroughput() {
            return this.maxThroughput;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setPublicNetworkBandwidth(Integer publicNetworkBandwidth) {
            this.publicNetworkBandwidth = publicNetworkBandwidth;
            return this;
        }
        public Integer getPublicNetworkBandwidth() {
            return this.publicNetworkBandwidth;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setRenewURL(String renewURL) {
            this.renewURL = renewURL;
            return this;
        }
        public String getRenewURL() {
            return this.renewURL;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setStorageBundleId(String storageBundleId) {
            this.storageBundleId = storageBundleId;
            return this;
        }
        public String getStorageBundleId() {
            return this.storageBundleId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeGatewaysResponseBodyGateways extends TeaModel {
        @NameInMap("Gateway")
        public java.util.List<DescribeGatewaysResponseBodyGatewaysGateway> gateway;

        public static DescribeGatewaysResponseBodyGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysResponseBodyGateways self = new DescribeGatewaysResponseBodyGateways();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysResponseBodyGateways setGateway(java.util.List<DescribeGatewaysResponseBodyGatewaysGateway> gateway) {
            this.gateway = gateway;
            return this;
        }
        public java.util.List<DescribeGatewaysResponseBodyGatewaysGateway> getGateway() {
            return this.gateway;
        }

    }

}
