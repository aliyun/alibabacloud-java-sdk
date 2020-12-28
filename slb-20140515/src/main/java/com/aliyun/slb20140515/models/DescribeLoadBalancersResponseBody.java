// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("LoadBalancers")
    public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    public static DescribeLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersResponseBody self = new DescribeLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancersResponseBody setLoadBalancers(java.util.List<DescribeLoadBalancersResponseBodyLoadBalancers> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancers> getLoadBalancers() {
        return this.loadBalancers;
    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancers extends TeaModel {
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

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ModificationProtectionReason")
        public String modificationProtectionReason;

        @NameInMap("ModificationProtectionStatus")
        public String modificationProtectionStatus;

        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("Address")
        public String address;

        @NameInMap("SlaveZoneId")
        public String slaveZoneId;

        @NameInMap("RegionIdAlias")
        public String regionIdAlias;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        public static DescribeLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancers self = new DescribeLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setModificationProtectionReason(String modificationProtectionReason) {
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }
        public String getModificationProtectionReason() {
            return this.modificationProtectionReason;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setModificationProtectionStatus(String modificationProtectionStatus) {
            this.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }
        public String getModificationProtectionStatus() {
            return this.modificationProtectionStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setSlaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }
        public String getSlaveZoneId() {
            return this.slaveZoneId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setRegionIdAlias(String regionIdAlias) {
            this.regionIdAlias = regionIdAlias;
            return this;
        }
        public String getRegionIdAlias() {
            return this.regionIdAlias;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

    }

}
