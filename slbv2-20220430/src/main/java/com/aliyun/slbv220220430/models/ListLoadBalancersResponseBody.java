// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLoadBalancersResponseBodyData data;

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

    public ListLoadBalancersResponseBody setData(ListLoadBalancersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLoadBalancersResponseBodyData getData() {
        return this.data;
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

    public ListLoadBalancersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("LockType")
        public String lockType;

        public static ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks self = new ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings extends TeaModel {
        // 公网ipId
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("EniId")
        public String eniId;

        // 私网ip
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        // 公网ip地址：仅Get的时候有值
        @NameInMap("PublicIPv4Address")
        public String publicIPv4Address;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings self = new ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings setPublicIPv4Address(String publicIPv4Address) {
            this.publicIPv4Address = publicIPv4Address;
            return this;
        }
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListLoadBalancersResponseBodyDataLoadBalancers extends TeaModel {
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        @NameInMap("AddressType")
        public String addressType;

        // 用户uid
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("CapacityUnitCount")
        public Long capacityUnitCount;

        @NameInMap("CommonBandwidthPackageId")
        public String commonBandwidthPackageId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CrossZoneEnable")
        public Boolean crossZoneEnable;

        @NameInMap("DNSName")
        public String DNSName;

        // 创建时间
        @NameInMap("GmtCreated")
        public String gmtCreated;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

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
        public java.util.List<ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks> operationLocks;

        // 业务location
        @NameInMap("RegionId")
        public String regionId;

        // 物理location
        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("ServiceManagedEnabled")
        public Boolean serviceManagedEnabled;

        // 是否为托管实例，取值Managed-1, Unmanaged-0, DependencyManaged-2
        @NameInMap("ServiceManagedMode")
        public String serviceManagedMode;

        // 托管实例服务账号UID
        @NameInMap("ServiceUid")
        public Long serviceUid;

        @NameInMap("TrafficAffinityEnable")
        public Boolean trafficAffinityEnable;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneMappings")
        public java.util.List<ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings> zoneMappings;

        public static ListLoadBalancersResponseBodyDataLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyDataLoadBalancers self = new ListLoadBalancersResponseBodyDataLoadBalancers();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setCapacityUnitCount(Long capacityUnitCount) {
            this.capacityUnitCount = capacityUnitCount;
            return this;
        }
        public Long getCapacityUnitCount() {
            return this.capacityUnitCount;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setCommonBandwidthPackageId(String commonBandwidthPackageId) {
            this.commonBandwidthPackageId = commonBandwidthPackageId;
            return this;
        }
        public String getCommonBandwidthPackageId() {
            return this.commonBandwidthPackageId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setCrossZoneEnable(Boolean crossZoneEnable) {
            this.crossZoneEnable = crossZoneEnable;
            return this;
        }
        public Boolean getCrossZoneEnable() {
            return this.crossZoneEnable;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setDNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }
        public String getDNSName() {
            return this.DNSName;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }
        public String getLoadBalancerBusinessStatus() {
            return this.loadBalancerBusinessStatus;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setOperationLocks(java.util.List<ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyDataLoadBalancersOperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setServiceManagedEnabled(Boolean serviceManagedEnabled) {
            this.serviceManagedEnabled = serviceManagedEnabled;
            return this;
        }
        public Boolean getServiceManagedEnabled() {
            return this.serviceManagedEnabled;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setServiceManagedMode(String serviceManagedMode) {
            this.serviceManagedMode = serviceManagedMode;
            return this;
        }
        public String getServiceManagedMode() {
            return this.serviceManagedMode;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setServiceUid(Long serviceUid) {
            this.serviceUid = serviceUid;
            return this;
        }
        public Long getServiceUid() {
            return this.serviceUid;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setTrafficAffinityEnable(Boolean trafficAffinityEnable) {
            this.trafficAffinityEnable = trafficAffinityEnable;
            return this;
        }
        public Boolean getTrafficAffinityEnable() {
            return this.trafficAffinityEnable;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListLoadBalancersResponseBodyDataLoadBalancers setZoneMappings(java.util.List<ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyDataLoadBalancersZoneMappings> getZoneMappings() {
            return this.zoneMappings;
        }

    }

    public static class ListLoadBalancersResponseBodyData extends TeaModel {
        @NameInMap("LoadBalancers")
        public java.util.List<ListLoadBalancersResponseBodyDataLoadBalancers> loadBalancers;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLoadBalancersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyData self = new ListLoadBalancersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyData setLoadBalancers(java.util.List<ListLoadBalancersResponseBodyDataLoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyDataLoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

        public ListLoadBalancersResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListLoadBalancersResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLoadBalancersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
