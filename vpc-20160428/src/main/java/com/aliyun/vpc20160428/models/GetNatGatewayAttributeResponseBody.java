// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The billing information.</p>
     */
    @NameInMap("BillingConfig")
    public GetNatGatewayAttributeResponseBodyBillingConfig billingConfig;

    /**
     * <p>The service status of the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **Normal**: normal</p>
     * <p>*   **FinancialLocked**: locked due to overdue payments</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The time when the NAT gateway was created. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The information about the deletion protection feature.</p>
     */
    @NameInMap("DeletionProtectionInfo")
    public GetNatGatewayAttributeResponseBodyDeletionProtectionInfo deletionProtectionInfo;

    /**
     * <p>The description of the NAT gateway.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the traffic monitoring feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("EcsMetricEnabled")
    public Boolean ecsMetricEnabled;

    /**
     * <p>The time when the NAT gateway expires.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The information about the DNAT table.</p>
     */
    @NameInMap("ForwardTable")
    public GetNatGatewayAttributeResponseBodyForwardTable forwardTable;

    /**
     * <p>The information about the FULLNAT table.</p>
     */
    @NameInMap("FullNatTable")
    public GetNatGatewayAttributeResponseBodyFullNatTable fullNatTable;

    /**
     * <p>The elastic IP addresses (EIPs) that are associated with the Internet NAT gateway.</p>
     */
    @NameInMap("IpList")
    public java.util.List<GetNatGatewayAttributeResponseBodyIpList> ipList;

    /**
     * <p>The name of the NAT gateway.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The type of the Internet NAT gateway. Only **Enhanced** is returned, which indicates an enhanced Internet NAT gateway.</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The type of the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **internet**: an Internet NAT gateway</p>
     * <p>*   **intranet**: a VPC NAT gateway</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The private network information about the NAT gateway.</p>
     */
    @NameInMap("PrivateInfo")
    public GetNatGatewayAttributeResponseBodyPrivateInfo privateInfo;

    /**
     * <p>Indicates whether the NAT gateway supports PrivateLink. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("PrivateLinkEnabled")
    public Boolean privateLinkEnabled;

    /**
     * <p>The mode that is used by PrivateLink. Valid values:</p>
     * <br>
     * <p>*   **FullNat**: the FULLNAT mode</p>
     * <p>*   **Geneve**: the GENEVE mode</p>
     */
    @NameInMap("PrivateLinkMode")
    public String privateLinkMode;

    /**
     * <p>The ID of the region where the NAT gateway is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The information about the SNAT table.</p>
     */
    @NameInMap("SnatTable")
    public GetNatGatewayAttributeResponseBodySnatTable snatTable;

    /**
     * <p>The status of the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **Creating**: being created. The operation to create a NAT gateway is asynchronous. The NAT gateway remains in the **Creating** state until it is created.</p>
     * <p>*   **Available**: available. After a NAT gateway is created, it remains in a stable state.</p>
     * <p>*   **Modifying**: being modified. The operation to upgrade or downgrade a NAT gateway is asynchronous. The NAT gateway remains in the **Modifying** state until it is upgraded or downgraded.</p>
     * <p>*   **Deleting**: being deleted. The operation to delete a NAT gateway is asynchronous. The NAT gateway remains in the **Deleting** state until it is deleted.</p>
     * <p>*   **Converting**: being converted. The operation to convert a standard NAT gateway to an enhanced NAT gateway is asynchronous. The NAT gateway remains in the **Converting** state until it is converted.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the VPC to which the NAT gateway belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetNatGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayAttributeResponseBody self = new GetNatGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayAttributeResponseBody setBillingConfig(GetNatGatewayAttributeResponseBodyBillingConfig billingConfig) {
        this.billingConfig = billingConfig;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyBillingConfig getBillingConfig() {
        return this.billingConfig;
    }

    public GetNatGatewayAttributeResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public GetNatGatewayAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetNatGatewayAttributeResponseBody setDeletionProtectionInfo(GetNatGatewayAttributeResponseBodyDeletionProtectionInfo deletionProtectionInfo) {
        this.deletionProtectionInfo = deletionProtectionInfo;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyDeletionProtectionInfo getDeletionProtectionInfo() {
        return this.deletionProtectionInfo;
    }

    public GetNatGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetNatGatewayAttributeResponseBody setEcsMetricEnabled(Boolean ecsMetricEnabled) {
        this.ecsMetricEnabled = ecsMetricEnabled;
        return this;
    }
    public Boolean getEcsMetricEnabled() {
        return this.ecsMetricEnabled;
    }

    public GetNatGatewayAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public GetNatGatewayAttributeResponseBody setForwardTable(GetNatGatewayAttributeResponseBodyForwardTable forwardTable) {
        this.forwardTable = forwardTable;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyForwardTable getForwardTable() {
        return this.forwardTable;
    }

    public GetNatGatewayAttributeResponseBody setFullNatTable(GetNatGatewayAttributeResponseBodyFullNatTable fullNatTable) {
        this.fullNatTable = fullNatTable;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyFullNatTable getFullNatTable() {
        return this.fullNatTable;
    }

    public GetNatGatewayAttributeResponseBody setIpList(java.util.List<GetNatGatewayAttributeResponseBodyIpList> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<GetNatGatewayAttributeResponseBodyIpList> getIpList() {
        return this.ipList;
    }

    public GetNatGatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetNatGatewayAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public GetNatGatewayAttributeResponseBody setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public GetNatGatewayAttributeResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetNatGatewayAttributeResponseBody setPrivateInfo(GetNatGatewayAttributeResponseBodyPrivateInfo privateInfo) {
        this.privateInfo = privateInfo;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyPrivateInfo getPrivateInfo() {
        return this.privateInfo;
    }

    public GetNatGatewayAttributeResponseBody setPrivateLinkEnabled(Boolean privateLinkEnabled) {
        this.privateLinkEnabled = privateLinkEnabled;
        return this;
    }
    public Boolean getPrivateLinkEnabled() {
        return this.privateLinkEnabled;
    }

    public GetNatGatewayAttributeResponseBody setPrivateLinkMode(String privateLinkMode) {
        this.privateLinkMode = privateLinkMode;
        return this;
    }
    public String getPrivateLinkMode() {
        return this.privateLinkMode;
    }

    public GetNatGatewayAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public GetNatGatewayAttributeResponseBody setSnatTable(GetNatGatewayAttributeResponseBodySnatTable snatTable) {
        this.snatTable = snatTable;
        return this;
    }
    public GetNatGatewayAttributeResponseBodySnatTable getSnatTable() {
        return this.snatTable;
    }

    public GetNatGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetNatGatewayAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class GetNatGatewayAttributeResponseBodyBillingConfig extends TeaModel {
        /**
         * <p>Indicates whether automatic payment is enabled. If the **InstanceChargeType** parameter is set to **PrePaid**, one of the following values is returned:</p>
         * <br>
         * <p>*   **false**: disabled. After an order is generated, you must go to the Order Center to complete the payment.</p>
         * <p>*   **true**: enabled. Payments are automatically completed.</p>
         * <br>
         * <p>The return value of this parameter is empty if **InstanceChargeType** is set to **PostPaid**.</p>
         */
        @NameInMap("AutoPay")
        public String autoPay;

        /**
         * <p>The billing method of the NAT gateway. The value is set to **PostPaid**, which indicates the pay-as-you-go billing method.</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the NAT gateway. Valid values:</p>
         * <br>
         * <p>*   **PayBySpec**: pay-by-specification</p>
         * <p>*   **PayByLcu**: pay-by-CU</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The specification of the Internet NAT gateway. If the **InternetChargeType** parameter is set to **PayBySpec**, one of the following values is returned:</p>
         * <br>
         * <p>*   **Small**: small</p>
         * <br>
         * <p>*   **Middle**: medium</p>
         * <br>
         * <p>*   **Large**: large</p>
         * <br>
         * <p>    The return value of this parameter is empty if **InternetChargeType** is set to **PayByLcu**.</p>
         */
        @NameInMap("Spec")
        public String spec;

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

        public GetNatGatewayAttributeResponseBodyBillingConfig setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public GetNatGatewayAttributeResponseBodyBillingConfig setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public GetNatGatewayAttributeResponseBodyBillingConfig setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyDeletionProtectionInfo extends TeaModel {
        /**
         * <p>Indicates whether deletion protection is enabled.</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
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

    public static class GetNatGatewayAttributeResponseBodyForwardTable extends TeaModel {
        /**
         * <p>The number of DNAT entries.</p>
         */
        @NameInMap("ForwardEntryCount")
        public Integer forwardEntryCount;

        /**
         * <p>The ID of the DNAT table.</p>
         */
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

    public static class GetNatGatewayAttributeResponseBodyFullNatTable extends TeaModel {
        /**
         * <p>The number of FULLNAT entries.</p>
         */
        @NameInMap("FullNatEntryCount")
        public Long fullNatEntryCount;

        /**
         * <p>The ID of the FULLNAT table.</p>
         */
        @NameInMap("FullNatTableId")
        public String fullNatTableId;

        public static GetNatGatewayAttributeResponseBodyFullNatTable build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyFullNatTable self = new GetNatGatewayAttributeResponseBodyFullNatTable();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyFullNatTable setFullNatEntryCount(Long fullNatEntryCount) {
            this.fullNatEntryCount = fullNatEntryCount;
            return this;
        }
        public Long getFullNatEntryCount() {
            return this.fullNatEntryCount;
        }

        public GetNatGatewayAttributeResponseBodyFullNatTable setFullNatTableId(String fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }
        public String getFullNatTableId() {
            return this.fullNatTableId;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyIpList extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The IP address of the EIP.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The association status of the EIP.</p>
         * <br>
         * <p>*   **idle**: The EIP is not specified in an SNAT entry or a DNAT entry.</p>
         * <p>*   **UsedBySnatTable**: The EIP is specified in an SNAT entry.</p>
         * <p>*   **UsedByForwardTable**: The EIP is specified in a DNAT entry.</p>
         */
        @NameInMap("UsingStatus")
        public String usingStatus;

        public static GetNatGatewayAttributeResponseBodyIpList build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyIpList self = new GetNatGatewayAttributeResponseBodyIpList();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyIpList setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public GetNatGatewayAttributeResponseBodyIpList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetNatGatewayAttributeResponseBodyIpList setUsingStatus(String usingStatus) {
            this.usingStatus = usingStatus;
            return this;
        }
        public String getUsingStatus() {
            return this.usingStatus;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyPrivateInfo extends TeaModel {
        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The zone where the NAT gateway is deployed.</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <p>The maximum bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        /**
         * <p>The private IP address.</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The ID of the vSwitch to which the NAT gateway belongs.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static GetNatGatewayAttributeResponseBodyPrivateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyPrivateInfo self = new GetNatGatewayAttributeResponseBodyPrivateInfo();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyPrivateInfo setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public GetNatGatewayAttributeResponseBodyPrivateInfo setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
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

        public GetNatGatewayAttributeResponseBodyPrivateInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class GetNatGatewayAttributeResponseBodySnatTable extends TeaModel {
        /**
         * <p>The number of SNAT entries.</p>
         */
        @NameInMap("SnatEntryCount")
        public Integer snatEntryCount;

        /**
         * <p>The ID of the SNAT table.</p>
         */
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

}
