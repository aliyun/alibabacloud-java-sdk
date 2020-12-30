// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayAttributeResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("ForwardTable")
    public GetNatGatewayAttributeResponseBodyForwardTable forwardTable;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("IpList")
    public java.util.List<GetNatGatewayAttributeResponseBodyIpList> ipList;

    @NameInMap("DeletionProtectionInfo")
    public GetNatGatewayAttributeResponseBodyDeletionProtectionInfo deletionProtectionInfo;

    @NameInMap("BillingConfig")
    public GetNatGatewayAttributeResponseBodyBillingConfig billingConfig;

    @NameInMap("NatType")
    public String natType;

    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("SnatTable")
    public GetNatGatewayAttributeResponseBodySnatTable snatTable;

    @NameInMap("Name")
    public String name;

    @NameInMap("EcsMetricEnabled")
    public Boolean ecsMetricEnabled;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("PrivateInfo")
    public GetNatGatewayAttributeResponseBodyPrivateInfo privateInfo;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static GetNatGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayAttributeResponseBody self = new GetNatGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetNatGatewayAttributeResponseBody setForwardTable(GetNatGatewayAttributeResponseBodyForwardTable forwardTable) {
        this.forwardTable = forwardTable;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyForwardTable getForwardTable() {
        return this.forwardTable;
    }

    public GetNatGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetNatGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNatGatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetNatGatewayAttributeResponseBody setIpList(java.util.List<GetNatGatewayAttributeResponseBodyIpList> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<GetNatGatewayAttributeResponseBodyIpList> getIpList() {
        return this.ipList;
    }

    public GetNatGatewayAttributeResponseBody setDeletionProtectionInfo(GetNatGatewayAttributeResponseBodyDeletionProtectionInfo deletionProtectionInfo) {
        this.deletionProtectionInfo = deletionProtectionInfo;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyDeletionProtectionInfo getDeletionProtectionInfo() {
        return this.deletionProtectionInfo;
    }

    public GetNatGatewayAttributeResponseBody setBillingConfig(GetNatGatewayAttributeResponseBodyBillingConfig billingConfig) {
        this.billingConfig = billingConfig;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyBillingConfig getBillingConfig() {
        return this.billingConfig;
    }

    public GetNatGatewayAttributeResponseBody setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public GetNatGatewayAttributeResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public GetNatGatewayAttributeResponseBody setSnatTable(GetNatGatewayAttributeResponseBodySnatTable snatTable) {
        this.snatTable = snatTable;
        return this;
    }
    public GetNatGatewayAttributeResponseBodySnatTable getSnatTable() {
        return this.snatTable;
    }

    public GetNatGatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetNatGatewayAttributeResponseBody setEcsMetricEnabled(Boolean ecsMetricEnabled) {
        this.ecsMetricEnabled = ecsMetricEnabled;
        return this;
    }
    public Boolean getEcsMetricEnabled() {
        return this.ecsMetricEnabled;
    }

    public GetNatGatewayAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetNatGatewayAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public GetNatGatewayAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetNatGatewayAttributeResponseBody setPrivateInfo(GetNatGatewayAttributeResponseBodyPrivateInfo privateInfo) {
        this.privateInfo = privateInfo;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyPrivateInfo getPrivateInfo() {
        return this.privateInfo;
    }

    public GetNatGatewayAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNatGatewayAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static class GetNatGatewayAttributeResponseBodyForwardTable extends TeaModel {
        @NameInMap("ForwardEntryCount")
        public Integer forwardEntryCount;

        @NameInMap("ForwardTableId")
        public String forwardTableId;

        public static GetNatGatewayAttributeResponseBodyForwardTable build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyForwardTable self = new GetNatGatewayAttributeResponseBodyForwardTable();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyForwardTable setForwardEntryCount(Integer forwardEntryCount) {
            this.forwardEntryCount = forwardEntryCount;
            return this;
        }
        public Integer getForwardEntryCount() {
            return this.forwardEntryCount;
        }

        public GetNatGatewayAttributeResponseBodyForwardTable setForwardTableId(String forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public String getForwardTableId() {
            return this.forwardTableId;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyIpList extends TeaModel {
        @NameInMap("UsingStatus")
        public String usingStatus;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("AllocationId")
        public String allocationId;

        public static GetNatGatewayAttributeResponseBodyIpList build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyIpList self = new GetNatGatewayAttributeResponseBodyIpList();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyIpList setUsingStatus(String usingStatus) {
            this.usingStatus = usingStatus;
            return this;
        }
        public String getUsingStatus() {
            return this.usingStatus;
        }

        public GetNatGatewayAttributeResponseBodyIpList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetNatGatewayAttributeResponseBodyIpList setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyDeletionProtectionInfo extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static GetNatGatewayAttributeResponseBodyDeletionProtectionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyDeletionProtectionInfo self = new GetNatGatewayAttributeResponseBodyDeletionProtectionInfo();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyDeletionProtectionInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyBillingConfig extends TeaModel {
        @NameInMap("AutoPay")
        public String autoPay;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        public static GetNatGatewayAttributeResponseBodyBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyBillingConfig self = new GetNatGatewayAttributeResponseBodyBillingConfig();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyBillingConfig setAutoPay(String autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public String getAutoPay() {
            return this.autoPay;
        }

        public GetNatGatewayAttributeResponseBodyBillingConfig setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetNatGatewayAttributeResponseBodyBillingConfig setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public GetNatGatewayAttributeResponseBodyBillingConfig setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

    }

    public static class GetNatGatewayAttributeResponseBodySnatTable extends TeaModel {
        @NameInMap("SnatEntryCount")
        public Integer snatEntryCount;

        @NameInMap("SnatTableId")
        public String snatTableId;

        public static GetNatGatewayAttributeResponseBodySnatTable build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodySnatTable self = new GetNatGatewayAttributeResponseBodySnatTable();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodySnatTable setSnatEntryCount(Integer snatEntryCount) {
            this.snatEntryCount = snatEntryCount;
            return this;
        }
        public Integer getSnatEntryCount() {
            return this.snatEntryCount;
        }

        public GetNatGatewayAttributeResponseBodySnatTable setSnatTableId(String snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public String getSnatTableId() {
            return this.snatTableId;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyPrivateInfo extends TeaModel {
        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("IzNo")
        public String izNo;

        public static GetNatGatewayAttributeResponseBodyPrivateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyPrivateInfo self = new GetNatGatewayAttributeResponseBodyPrivateInfo();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyPrivateInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public GetNatGatewayAttributeResponseBodyPrivateInfo setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public GetNatGatewayAttributeResponseBodyPrivateInfo setMaxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

        public GetNatGatewayAttributeResponseBodyPrivateInfo setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public GetNatGatewayAttributeResponseBodyPrivateInfo setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

    }

}
