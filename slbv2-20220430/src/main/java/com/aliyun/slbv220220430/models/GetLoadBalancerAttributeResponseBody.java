// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetLoadBalancerAttributeResponseBodyData data;

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

    public static GetLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerAttributeResponseBody self = new GetLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoadBalancerAttributeResponseBody setData(GetLoadBalancerAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyData getData() {
        return this.data;
    }

    public GetLoadBalancerAttributeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetLoadBalancerAttributeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetLoadBalancerAttributeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLoadBalancerAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoadBalancerAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLoadBalancerAttributeResponseBodyDataOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("LockType")
        public String lockType;

        public static GetLoadBalancerAttributeResponseBodyDataOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyDataOperationLocks self = new GetLoadBalancerAttributeResponseBodyDataOperationLocks();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyDataOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public GetLoadBalancerAttributeResponseBodyDataOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyDataZoneMappings extends TeaModel {
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

        public static GetLoadBalancerAttributeResponseBodyDataZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyDataZoneMappings self = new GetLoadBalancerAttributeResponseBodyDataZoneMappings();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyDataZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public GetLoadBalancerAttributeResponseBodyDataZoneMappings setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public GetLoadBalancerAttributeResponseBodyDataZoneMappings setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public GetLoadBalancerAttributeResponseBodyDataZoneMappings setPublicIPv4Address(String publicIPv4Address) {
            this.publicIPv4Address = publicIPv4Address;
            return this;
        }
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

        public GetLoadBalancerAttributeResponseBodyDataZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetLoadBalancerAttributeResponseBodyDataZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyData extends TeaModel {
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        @NameInMap("AddressType")
        public String addressType;

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
        public java.util.List<GetLoadBalancerAttributeResponseBodyDataOperationLocks> operationLocks;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("TrafficAffinityEnable")
        public Boolean trafficAffinityEnable;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneMappings")
        public java.util.List<GetLoadBalancerAttributeResponseBodyDataZoneMappings> zoneMappings;

        public static GetLoadBalancerAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyData self = new GetLoadBalancerAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyData setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public GetLoadBalancerAttributeResponseBodyData setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public GetLoadBalancerAttributeResponseBodyData setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public GetLoadBalancerAttributeResponseBodyData setCapacityUnitCount(Long capacityUnitCount) {
            this.capacityUnitCount = capacityUnitCount;
            return this;
        }
        public Long getCapacityUnitCount() {
            return this.capacityUnitCount;
        }

        public GetLoadBalancerAttributeResponseBodyData setCommonBandwidthPackageId(String commonBandwidthPackageId) {
            this.commonBandwidthPackageId = commonBandwidthPackageId;
            return this;
        }
        public String getCommonBandwidthPackageId() {
            return this.commonBandwidthPackageId;
        }

        public GetLoadBalancerAttributeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLoadBalancerAttributeResponseBodyData setCrossZoneEnable(Boolean crossZoneEnable) {
            this.crossZoneEnable = crossZoneEnable;
            return this;
        }
        public Boolean getCrossZoneEnable() {
            return this.crossZoneEnable;
        }

        public GetLoadBalancerAttributeResponseBodyData setDNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }
        public String getDNSName() {
            return this.DNSName;
        }

        public GetLoadBalancerAttributeResponseBodyData setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }
        public String getLoadBalancerBusinessStatus() {
            return this.loadBalancerBusinessStatus;
        }

        public GetLoadBalancerAttributeResponseBodyData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public GetLoadBalancerAttributeResponseBodyData setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public GetLoadBalancerAttributeResponseBodyData setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public GetLoadBalancerAttributeResponseBodyData setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public GetLoadBalancerAttributeResponseBodyData setOperationLocks(java.util.List<GetLoadBalancerAttributeResponseBodyDataOperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public java.util.List<GetLoadBalancerAttributeResponseBodyDataOperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        public GetLoadBalancerAttributeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetLoadBalancerAttributeResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetLoadBalancerAttributeResponseBodyData setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public GetLoadBalancerAttributeResponseBodyData setTrafficAffinityEnable(Boolean trafficAffinityEnable) {
            this.trafficAffinityEnable = trafficAffinityEnable;
            return this;
        }
        public Boolean getTrafficAffinityEnable() {
            return this.trafficAffinityEnable;
        }

        public GetLoadBalancerAttributeResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetLoadBalancerAttributeResponseBodyData setZoneMappings(java.util.List<GetLoadBalancerAttributeResponseBodyDataZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public java.util.List<GetLoadBalancerAttributeResponseBodyDataZoneMappings> getZoneMappings() {
            return this.zoneMappings;
        }

    }

}
