// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayResponseBody extends TeaModel {
    @NameInMap("ActivatedTime")
    public Long activatedTime;

    @NameInMap("BuyURL")
    public String buyURL;

    @NameInMap("Capacity")
    public Integer capacity;

    @NameInMap("Category")
    public String category;

    @NameInMap("Code")
    public String code;

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
    public DescribeGatewayResponseBodyElasticNodes elasticNodes;

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

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("PublicNetworkBandwidth")
    public Integer publicNetworkBandwidth;

    @NameInMap("RenewURL")
    public String renewURL;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayResponseBody self = new DescribeGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayResponseBody setActivatedTime(Long activatedTime) {
        this.activatedTime = activatedTime;
        return this;
    }
    public Long getActivatedTime() {
        return this.activatedTime;
    }

    public DescribeGatewayResponseBody setBuyURL(String buyURL) {
        this.buyURL = buyURL;
        return this;
    }
    public String getBuyURL() {
        return this.buyURL;
    }

    public DescribeGatewayResponseBody setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Integer getCapacity() {
        return this.capacity;
    }

    public DescribeGatewayResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayResponseBody setCommonBuyInstanceId(String commonBuyInstanceId) {
        this.commonBuyInstanceId = commonBuyInstanceId;
        return this;
    }
    public String getCommonBuyInstanceId() {
        return this.commonBuyInstanceId;
    }

    public DescribeGatewayResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DescribeGatewayResponseBody setDataLoadInterval(Integer dataLoadInterval) {
        this.dataLoadInterval = dataLoadInterval;
        return this;
    }
    public Integer getDataLoadInterval() {
        return this.dataLoadInterval;
    }

    public DescribeGatewayResponseBody setDataLoadType(String dataLoadType) {
        this.dataLoadType = dataLoadType;
        return this;
    }
    public String getDataLoadType() {
        return this.dataLoadType;
    }

    public DescribeGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeGatewayResponseBody setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public DescribeGatewayResponseBody setElasticGateway(Boolean elasticGateway) {
        this.elasticGateway = elasticGateway;
        return this;
    }
    public Boolean getElasticGateway() {
        return this.elasticGateway;
    }

    public DescribeGatewayResponseBody setElasticNodes(DescribeGatewayResponseBodyElasticNodes elasticNodes) {
        this.elasticNodes = elasticNodes;
        return this;
    }
    public DescribeGatewayResponseBodyElasticNodes getElasticNodes() {
        return this.elasticNodes;
    }

    public DescribeGatewayResponseBody setExpireStatus(Integer expireStatus) {
        this.expireStatus = expireStatus;
        return this;
    }
    public Integer getExpireStatus() {
        return this.expireStatus;
    }

    public DescribeGatewayResponseBody setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeGatewayResponseBody setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public DescribeGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayResponseBody setGatewayRegionId(String gatewayRegionId) {
        this.gatewayRegionId = gatewayRegionId;
        return this;
    }
    public String getGatewayRegionId() {
        return this.gatewayRegionId;
    }

    public DescribeGatewayResponseBody setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public DescribeGatewayResponseBody setGatewayVersion(String gatewayVersion) {
        this.gatewayVersion = gatewayVersion;
        return this;
    }
    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    public DescribeGatewayResponseBody setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public DescribeGatewayResponseBody setInnerIpv6Ip(String innerIpv6Ip) {
        this.innerIpv6Ip = innerIpv6Ip;
        return this;
    }
    public String getInnerIpv6Ip() {
        return this.innerIpv6Ip;
    }

    public DescribeGatewayResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeGatewayResponseBody setIsPostPaid(Boolean isPostPaid) {
        this.isPostPaid = isPostPaid;
        return this;
    }
    public Boolean getIsPostPaid() {
        return this.isPostPaid;
    }

    public DescribeGatewayResponseBody setIsReleaseAfterExpiration(Boolean isReleaseAfterExpiration) {
        this.isReleaseAfterExpiration = isReleaseAfterExpiration;
        return this;
    }
    public Boolean getIsReleaseAfterExpiration() {
        return this.isReleaseAfterExpiration;
    }

    public DescribeGatewayResponseBody setLastErrorKey(String lastErrorKey) {
        this.lastErrorKey = lastErrorKey;
        return this;
    }
    public String getLastErrorKey() {
        return this.lastErrorKey;
    }

    public DescribeGatewayResponseBody setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeGatewayResponseBody setMaxThroughput(Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
        return this;
    }
    public Integer getMaxThroughput() {
        return this.maxThroughput;
    }

    public DescribeGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGatewayResponseBody setPublicNetworkBandwidth(Integer publicNetworkBandwidth) {
        this.publicNetworkBandwidth = publicNetworkBandwidth;
        return this;
    }
    public Integer getPublicNetworkBandwidth() {
        return this.publicNetworkBandwidth;
    }

    public DescribeGatewayResponseBody setRenewURL(String renewURL) {
        this.renewURL = renewURL;
        return this;
    }
    public String getRenewURL() {
        return this.renewURL;
    }

    public DescribeGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGatewayResponseBody setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public DescribeGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeGatewayResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeGatewayResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeGatewayResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeGatewayResponseBodyElasticNodes extends TeaModel {
        @NameInMap("ElasticNode")
        public java.util.List<String> elasticNode;

        public static DescribeGatewayResponseBodyElasticNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayResponseBodyElasticNodes self = new DescribeGatewayResponseBodyElasticNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayResponseBodyElasticNodes setElasticNode(java.util.List<String> elasticNode) {
            this.elasticNode = elasticNode;
            return this;
        }
        public java.util.List<String> getElasticNode() {
            return this.elasticNode;
        }

    }

}
