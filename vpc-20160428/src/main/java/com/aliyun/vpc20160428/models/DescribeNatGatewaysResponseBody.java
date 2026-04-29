// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponseBody extends TeaModel {
    @NameInMap("NatGateways")
    public DescribeNatGatewaysResponseBodyNatGateways natGateways;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of NAT gateway entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode extends TeaModel {
        @NameInMap("ModeValue")
        public String modeValue;

        @NameInMap("TunnelType")
        public String tunnelType;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode setModeValue(String modeValue) {
            this.modeValue = modeValue;
            return this;
        }
        public String getModeValue() {
            return this.modeValue;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode setTunnelType(String tunnelType) {
            this.tunnelType = tunnelType;
            return this;
        }
        public String getTunnelType() {
            return this.tunnelType;
        }

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
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("SnatEntryEnabled")
        public Boolean snatEntryEnabled;

        @NameInMap("UsingStatus")
        public String usingStatus;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
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

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setUsingStatus(String usingStatus) {
            this.usingStatus = usingStatus;
            return this;
        }
        public String getUsingStatus() {
            return this.usingStatus;
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

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList extends TeaModel {
        @NameInMap("IpPrefix")
        public String ipPrefix;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList setIpPrefix(String ipPrefix) {
            this.ipPrefix = ipPrefix;
            return this;
        }
        public String getIpPrefix() {
            return this.ipPrefix;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList extends TeaModel {
        @NameInMap("IpPrefixList")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList> ipPrefixList;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList setIpPrefixList(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList> ipPrefixList) {
            this.ipPrefixList = ipPrefixList;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixListIpPrefixList> getIpPrefixList() {
            return this.ipPrefixList;
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

        @NameInMap("MaxSessionEstablishRate")
        public Integer maxSessionEstablishRate;

        @NameInMap("MaxSessionQuota")
        public Integer maxSessionQuota;

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

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setMaxSessionEstablishRate(Integer maxSessionEstablishRate) {
            this.maxSessionEstablishRate = maxSessionEstablishRate;
            return this;
        }
        public Integer getMaxSessionEstablishRate() {
            return this.maxSessionEstablishRate;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setMaxSessionQuota(Integer maxSessionQuota) {
            this.maxSessionQuota = maxSessionQuota;
            return this;
        }
        public Integer getMaxSessionQuota() {
            return this.maxSessionQuota;
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

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag> tag;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags setTag(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGateway extends TeaModel {
        @NameInMap("AccessMode")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode accessMode;

        @NameInMap("AutoPay")
        public Boolean autoPay;

        @NameInMap("AvailabilityMode")
        public String availabilityMode;

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

        /**
         * <strong>example:</strong>
         * <p>MULTI_BINDED</p>
         */
        @NameInMap("EipBindMode")
        public String eipBindMode;

        @NameInMap("EnableSessionLog")
        public String enableSessionLog;

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

        @NameInMap("IpPrefixList")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList ipPrefixList;

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

        @NameInMap("PrivateLinkEnabled")
        public Boolean privateLinkEnabled;

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

        @NameInMap("Tags")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags tags;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGateway self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setAccessMode(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode getAccessMode() {
            return this.accessMode;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setAvailabilityMode(String availabilityMode) {
            this.availabilityMode = availabilityMode;
            return this;
        }
        public String getAvailabilityMode() {
            return this.availabilityMode;
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

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setEipBindMode(String eipBindMode) {
            this.eipBindMode = eipBindMode;
            return this;
        }
        public String getEipBindMode() {
            return this.eipBindMode;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setEnableSessionLog(String enableSessionLog) {
            this.enableSessionLog = enableSessionLog;
            return this;
        }
        public String getEnableSessionLog() {
            return this.enableSessionLog;
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

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setIpPrefixList(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList ipPrefixList) {
            this.ipPrefixList = ipPrefixList;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpPrefixList getIpPrefixList() {
            return this.ipPrefixList;
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

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setTags(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags getTags() {
            return this.tags;
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
