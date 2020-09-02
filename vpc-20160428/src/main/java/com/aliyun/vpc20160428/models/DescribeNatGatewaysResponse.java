// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("NatGateways")
    @Validation(required = true)
    public DescribeNatGatewaysResponseNatGateways natGateways;

    public static DescribeNatGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponse self = new DescribeNatGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatGatewaysResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNatGatewaysResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNatGatewaysResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNatGatewaysResponse setNatGateways(DescribeNatGatewaysResponseNatGateways natGateways) {
        this.natGateways = natGateways;
        return this;
    }
    public DescribeNatGatewaysResponseNatGateways getNatGateways() {
        return this.natGateways;
    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList extends TeaModel {
        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("UsingStatus")
        @Validation(required = true)
        public String usingStatus;

        @NameInMap("ApAccessEnabled")
        @Validation(required = true)
        public Boolean apAccessEnabled;

        @NameInMap("SnatEntryEnabled")
        @Validation(required = true)
        public Boolean snatEntryEnabled;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList setUsingStatus(String usingStatus) {
            this.usingStatus = usingStatus;
            return this;
        }
        public String getUsingStatus() {
            return this.usingStatus;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList setApAccessEnabled(Boolean apAccessEnabled) {
            this.apAccessEnabled = apAccessEnabled;
            return this;
        }
        public Boolean getApAccessEnabled() {
            return this.apAccessEnabled;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList setSnatEntryEnabled(Boolean snatEntryEnabled) {
            this.snatEntryEnabled = snatEntryEnabled;
            return this;
        }
        public Boolean getSnatEntryEnabled() {
            return this.snatEntryEnabled;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists extends TeaModel {
        @NameInMap("IpList")
        @Validation(required = true)
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList> ipList;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists setIpList(java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList> getIpList() {
            return this.ipList;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo extends TeaModel {
        @NameInMap("EniInstanceId")
        @Validation(required = true)
        public String eniInstanceId;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("VswitchId")
        @Validation(required = true)
        public String vswitchId;

        @NameInMap("IzNo")
        @Validation(required = true)
        public String izNo;

        @NameInMap("MaxBandwidth")
        @Validation(required = true)
        public Integer maxBandwidth;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo setMaxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds extends TeaModel {
        // ForwardTableId
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public java.util.List<String> forwardTableId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds extends TeaModel {
        // SnatTableId
        @NameInMap("SnatTableId")
        @Validation(required = true)
        public java.util.List<String> snatTableId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds setSnatTableId(java.util.List<String> snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public java.util.List<String> getSnatTableId() {
            return this.snatTableId;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds extends TeaModel {
        // BandwidthPackageId
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public java.util.List<String> bandwidthPackageId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds setBandwidthPackageId(java.util.List<String> bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public java.util.List<String> getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGateway extends TeaModel {
        @NameInMap("NatGatewayId")
        @Validation(required = true)
        public String natGatewayId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("AutoPay")
        @Validation(required = true)
        public Boolean autoPay;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("NatType")
        @Validation(required = true)
        public String natType;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("DeletionProtection")
        @Validation(required = true)
        public Boolean deletionProtection;

        @NameInMap("EcsMetricEnabled")
        @Validation(required = true)
        public Boolean ecsMetricEnabled;

        @NameInMap("IpLists")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists ipLists;

        @NameInMap("NatGatewayPrivateInfo")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo natGatewayPrivateInfo;

        @NameInMap("ForwardTableIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds forwardTableIds;

        @NameInMap("SnatTableIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds snatTableIds;

        @NameInMap("BandwidthPackageIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds;

        public static DescribeNatGatewaysResponseNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGateway self = new DescribeNatGatewaysResponseNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setNatType(String natType) {
            this.natType = natType;
            return this;
        }
        public String getNatType() {
            return this.natType;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setEcsMetricEnabled(Boolean ecsMetricEnabled) {
            this.ecsMetricEnabled = ecsMetricEnabled;
            return this;
        }
        public Boolean getEcsMetricEnabled() {
            return this.ecsMetricEnabled;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setIpLists(DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists getIpLists() {
            return this.ipLists;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setNatGatewayPrivateInfo(DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo natGatewayPrivateInfo) {
            this.natGatewayPrivateInfo = natGatewayPrivateInfo;
            return this;
        }
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo getNatGatewayPrivateInfo() {
            return this.natGatewayPrivateInfo;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setForwardTableIds(DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setSnatTableIds(DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds snatTableIds) {
            this.snatTableIds = snatTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds getSnatTableIds() {
            return this.snatTableIds;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setBandwidthPackageIds(DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds) {
            this.bandwidthPackageIds = bandwidthPackageIds;
            return this;
        }
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds getBandwidthPackageIds() {
            return this.bandwidthPackageIds;
        }

    }

    public static class DescribeNatGatewaysResponseNatGateways extends TeaModel {
        @NameInMap("NatGateway")
        @Validation(required = true)
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> natGateway;

        public static DescribeNatGatewaysResponseNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGateways self = new DescribeNatGatewaysResponseNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGateways setNatGateway(java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> natGateway) {
            this.natGateway = natGateway;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> getNatGateway() {
            return this.natGateway;
        }

    }

}
