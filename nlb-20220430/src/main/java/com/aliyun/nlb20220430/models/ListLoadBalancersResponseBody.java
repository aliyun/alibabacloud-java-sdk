// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LoadBalancers")
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersResponseBody self = new ListLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLoadBalancersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListLoadBalancersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListLoadBalancersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLoadBalancersResponseBody setLoadBalancers(java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> getLoadBalancers() {
        return this.loadBalancers;
    }

    public ListLoadBalancersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLoadBalancersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLoadBalancersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLoadBalancersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig extends TeaModel {
        // 实例的计费类型
        @NameInMap("PayType")
        public String payType;

        public static ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig self = new ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("LockType")
        public String lockType;

        public static ListLoadBalancersResponseBodyLoadBalancersOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersOperationLocks self = new ListLoadBalancersResponseBodyLoadBalancersOperationLocks();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListLoadBalancersResponseBodyLoadBalancersOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListLoadBalancersResponseBodyLoadBalancersTags build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersTags self = new ListLoadBalancersResponseBodyLoadBalancersTags();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLoadBalancersResponseBodyLoadBalancersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses extends TeaModel {
        // 公网ipId
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("EniId")
        public String eniId;

        @NameInMap("Ipv6Address")
        public String ipv6Address;

        // 私网ip
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        // 公网ip地址：仅Get的时候有值
        @NameInMap("PublicIPv4Address")
        public String publicIPv4Address;

        public static ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses self = new ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setPublicIPv4Address(String publicIPv4Address) {
            this.publicIPv4Address = publicIPv4Address;
            return this;
        }
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersZoneMappings extends TeaModel {
        @NameInMap("LoadBalancerAddresses")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListLoadBalancersResponseBodyLoadBalancersZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersZoneMappings self = new ListLoadBalancersResponseBodyLoadBalancersZoneMappings();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setLoadBalancerAddresses(java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> loadBalancerAddresses) {
            this.loadBalancerAddresses = loadBalancerAddresses;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        @NameInMap("AddressType")
        public String addressType;

        // 用户uid
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("CapacityUnitCount")
        public Long capacityUnitCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CrossZoneEnabled")
        public Boolean crossZoneEnabled;

        @NameInMap("DNSName")
        public String DNSName;

        // 计费相关属性
        @NameInMap("LoadBalancerBillingConfig")
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig;

        @NameInMap("LoadBalancerBusinessStatus")
        public String loadBalancerBusinessStatus;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        @NameInMap("LoadBalancerType")
        public String loadBalancerType;

        // 实例处于锁定状态列表
        @NameInMap("OperationLocks")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersOperationLocks> operationLocks;

        // 业务location
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("Tags")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags;

        @NameInMap("TrafficAffinityEnabled")
        public Boolean trafficAffinityEnabled;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneMappings")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> zoneMappings;

        public static ListLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancers self = new ListLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setCapacityUnitCount(Long capacityUnitCount) {
            this.capacityUnitCount = capacityUnitCount;
            return this;
        }
        public Long getCapacityUnitCount() {
            return this.capacityUnitCount;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setCrossZoneEnabled(Boolean crossZoneEnabled) {
            this.crossZoneEnabled = crossZoneEnabled;
            return this;
        }
        public Boolean getCrossZoneEnabled() {
            return this.crossZoneEnabled;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setDNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }
        public String getDNSName() {
            return this.DNSName;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerBillingConfig(ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
            return this.loadBalancerBillingConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }
        public String getLoadBalancerBusinessStatus() {
            return this.loadBalancerBusinessStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setOperationLocks(java.util.List<ListLoadBalancersResponseBodyLoadBalancersOperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersOperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setTags(java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> getTags() {
            return this.tags;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setTrafficAffinityEnabled(Boolean trafficAffinityEnabled) {
            this.trafficAffinityEnabled = trafficAffinityEnabled;
            return this;
        }
        public Boolean getTrafficAffinityEnabled() {
            return this.trafficAffinityEnabled;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setZoneMappings(java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> getZoneMappings() {
            return this.zoneMappings;
        }

    }

}
