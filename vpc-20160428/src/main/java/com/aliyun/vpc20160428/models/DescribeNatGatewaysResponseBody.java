// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponseBody extends TeaModel {
    @NameInMap("NatGateways")
    public DescribeNatGatewaysResponseBodyNatGateways natGateways;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNatGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponseBody self = new DescribeNatGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponseBody setNatGateways(DescribeNatGatewaysResponseBodyNatGateways natGateways) {
        this.natGateways = natGateways;
        return this;
    }
    public DescribeNatGatewaysResponseBodyNatGateways getNatGateways() {
        return this.natGateways;
    }

    public DescribeNatGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNatGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNatGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        public java.util.List<String> forwardTableId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds extends TeaModel {
        @NameInMap("FullNatTableId")
        public java.util.List<String> fullNatTableId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds setFullNatTableId(java.util.List<String> fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }
        public java.util.List<String> getFullNatTableId() {
            return this.fullNatTableId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("SnatEntryEnabled")
        public Boolean snatEntryEnabled;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setSnatEntryEnabled(Boolean snatEntryEnabled) {
            this.snatEntryEnabled = snatEntryEnabled;
            return this;
        }
        public Boolean getSnatEntryEnabled() {
            return this.snatEntryEnabled;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists extends TeaModel {
        @NameInMap("IpList")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList> ipList;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists setIpList(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList> getIpList() {
            return this.ipList;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo extends TeaModel {
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        @NameInMap("EniType")
        public String eniType;

        @NameInMap("IzNo")
        public String izNo;

        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setEniType(String eniType) {
            this.eniType = eniType;
            return this;
        }
        public String getEniType() {
            return this.eniType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setMaxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds extends TeaModel {
        @NameInMap("SnatTableId")
        public java.util.List<String> snatTableId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds setSnatTableId(java.util.List<String> snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public java.util.List<String> getSnatTableId() {
            return this.snatTableId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGateway extends TeaModel {
        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("Description")
        public String description;

        @NameInMap("EcsMetricEnabled")
        public Boolean ecsMetricEnabled;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ForwardTableIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds forwardTableIds;

        @NameInMap("FullNatTableIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds fullNatTableIds;

        @NameInMap("IcmpReplyEnabled")
        public Boolean icmpReplyEnabled;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("IpLists")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists ipLists;

        @NameInMap("Name")
        public String name;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("NatGatewayPrivateInfo")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo natGatewayPrivateInfo;

        @NameInMap("NatType")
        public String natType;

        @NameInMap("NetworkType")
        public String networkType;

        // 默认不支持私网链接。设置为1则意味着支持私网链接
        @NameInMap("PrivateLinkEnabled")
        public Boolean privateLinkEnabled;

        // Fullnat：使用FullNat模式 Geneve：使用Geneve模式。 预估大部分场景都是非Geneve模式的。
        @NameInMap("PrivateLinkMode")
        public String privateLinkMode;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityProtectionEnabled")
        public Boolean securityProtectionEnabled;

        @NameInMap("SnatTableIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds snatTableIds;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGateway self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setEcsMetricEnabled(Boolean ecsMetricEnabled) {
            this.ecsMetricEnabled = ecsMetricEnabled;
            return this;
        }
        public Boolean getEcsMetricEnabled() {
            return this.ecsMetricEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setForwardTableIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setFullNatTableIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds fullNatTableIds) {
            this.fullNatTableIds = fullNatTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds getFullNatTableIds() {
            return this.fullNatTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
            this.icmpReplyEnabled = icmpReplyEnabled;
            return this;
        }
        public Boolean getIcmpReplyEnabled() {
            return this.icmpReplyEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setIpLists(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists getIpLists() {
            return this.ipLists;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNatGatewayPrivateInfo(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo natGatewayPrivateInfo) {
            this.natGatewayPrivateInfo = natGatewayPrivateInfo;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo getNatGatewayPrivateInfo() {
            return this.natGatewayPrivateInfo;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNatType(String natType) {
            this.natType = natType;
            return this;
        }
        public String getNatType() {
            return this.natType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setPrivateLinkEnabled(Boolean privateLinkEnabled) {
            this.privateLinkEnabled = privateLinkEnabled;
            return this;
        }
        public Boolean getPrivateLinkEnabled() {
            return this.privateLinkEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setPrivateLinkMode(String privateLinkMode) {
            this.privateLinkMode = privateLinkMode;
            return this;
        }
        public String getPrivateLinkMode() {
            return this.privateLinkMode;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
            this.securityProtectionEnabled = securityProtectionEnabled;
            return this;
        }
        public Boolean getSecurityProtectionEnabled() {
            return this.securityProtectionEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setSnatTableIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds snatTableIds) {
            this.snatTableIds = snatTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds getSnatTableIds() {
            return this.snatTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGateways extends TeaModel {
        @NameInMap("NatGateway")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> natGateway;

        public static DescribeNatGatewaysResponseBodyNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGateways self = new DescribeNatGatewaysResponseBodyNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGateways setNatGateway(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> natGateway) {
            this.natGateway = natGateway;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> getNatGateway() {
            return this.natGateway;
        }

    }

}
