// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("LoadBalancers")
    public DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers;

    public static DescribeLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersResponseBody self = new DescribeLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLoadBalancersResponseBody setLoadBalancers(DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public DescribeLoadBalancersResponseBodyLoadBalancers getLoadBalancers() {
        return this.loadBalancers;
    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Address")
        public String address;

        @NameInMap("SlaveZoneId")
        public String slaveZoneId;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        @NameInMap("InternetChargeTypeAlias")
        public String internetChargeTypeAlias;

        @NameInMap("LoadBalancerSpec")
        public String loadBalancerSpec;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ModificationProtectionReason")
        public String modificationProtectionReason;

        @NameInMap("ModificationProtectionStatus")
        public String modificationProtectionStatus;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("DeleteProtection")
        public String deleteProtection;

        @NameInMap("RegionIdAlias")
        public String regionIdAlias;

        public static DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer self = new DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setSlaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }
        public String getSlaveZoneId() {
            return this.slaveZoneId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setInternetChargeTypeAlias(String internetChargeTypeAlias) {
            this.internetChargeTypeAlias = internetChargeTypeAlias;
            return this;
        }
        public String getInternetChargeTypeAlias() {
            return this.internetChargeTypeAlias;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setModificationProtectionReason(String modificationProtectionReason) {
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }
        public String getModificationProtectionReason() {
            return this.modificationProtectionReason;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setModificationProtectionStatus(String modificationProtectionStatus) {
            this.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }
        public String getModificationProtectionStatus() {
            return this.modificationProtectionStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setDeleteProtection(String deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }
        public String getDeleteProtection() {
            return this.deleteProtection;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setRegionIdAlias(String regionIdAlias) {
            this.regionIdAlias = regionIdAlias;
            return this;
        }
        public String getRegionIdAlias() {
            return this.regionIdAlias;
        }

    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        @NameInMap("LoadBalancer")
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer;

        public static DescribeLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancers self = new DescribeLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setLoadBalancer(java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

    }

}
