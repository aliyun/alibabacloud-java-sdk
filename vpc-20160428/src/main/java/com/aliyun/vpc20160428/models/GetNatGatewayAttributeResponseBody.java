// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The access mode for reverse access to the VPC NAT gateway.</p>
     */
    @NameInMap("AccessMode")
    public GetNatGatewayAttributeResponseBodyAccessMode accessMode;

    @NameInMap("AvailabilityMode")
    public String availabilityMode;

    /**
     * <p>The billing configuration information.</p>
     */
    @NameInMap("BillingConfig")
    public GetNatGatewayAttributeResponseBodyBillingConfig billingConfig;

    /**
     * <p>The business status of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Normal.</li>
     * <li><strong>FinancialLocked</strong>: Locked due to overdue payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The time when the NAT gateway was created. The time is displayed in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-08T12:20:20Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The deletion protection information.</p>
     */
    @NameInMap("DeletionProtectionInfo")
    public GetNatGatewayAttributeResponseBodyDeletionProtectionInfo deletionProtectionInfo;

    /**
     * <p>The description of the NAT gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>NAT</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the gateway traffic monitoring feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The gateway traffic monitoring feature is enabled.</li>
     * <li><strong>false</strong>: The gateway traffic monitoring feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EcsMetricEnabled")
    public Boolean ecsMetricEnabled;

    /**
     * <p>Indicates whether session logging is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Session logging is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Session logging is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSessionLog")
    public Boolean enableSessionLog;

    /**
     * <p>The expiration time of the NAT gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-26T12:20:20Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The DNAT table information.</p>
     */
    @NameInMap("ForwardTable")
    public GetNatGatewayAttributeResponseBodyForwardTable forwardTable;

    /**
     * <p>The FULLNAT table information.</p>
     */
    @NameInMap("FullNatTable")
    public GetNatGatewayAttributeResponseBodyFullNatTable fullNatTable;

    /**
     * <p>The list of elastic IP addresses (EIPs) associated with the Internet NAT gateway.</p>
     */
    @NameInMap("IpList")
    public java.util.List<GetNatGatewayAttributeResponseBodyIpList> ipList;

    /**
     * <p>The session log configuration information.</p>
     */
    @NameInMap("LogDelivery")
    public GetNatGatewayAttributeResponseBodyLogDelivery logDelivery;

    /**
     * <p>The name of the NAT gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the NAT gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1047e2d4z7kf2ki****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The type of the Internet NAT gateway. The value is <strong>Enhanced</strong>, which indicates an enhanced NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The type of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: Internet NAT gateway.</li>
     * <li><strong>intranet</strong>: VPC NAT gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The private network information of the NAT gateway instance.</p>
     */
    @NameInMap("PrivateInfo")
    public GetNatGatewayAttributeResponseBodyPrivateInfo privateInfo;

    /**
     * <p>Indicates whether private connectivity is supported. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Private connectivity is supported.</li>
     * <li><strong>false</strong>: Private connectivity is not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrivateLinkEnabled")
    public Boolean privateLinkEnabled;

    /**
     * <p>The conversion mode of the private connectivity service. Valid values:</p>
     * <ul>
     * <li><strong>FullNat</strong>: FULLNAT mode.</li>
     * <li><strong>Geneve</strong>: Geneve mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullNat</p>
     */
    @NameInMap("PrivateLinkMode")
    public String privateLinkMode;

    /**
     * <p>The region ID of the NAT gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The SNAT table information.</p>
     */
    @NameInMap("SnatTable")
    public GetNatGatewayAttributeResponseBodySnatTable snatTable;

    /**
     * <p>The status of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The NAT gateway is being created. Creating a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Creating</strong> state until the operation is complete.</li>
     * <li><strong>Available</strong>: The NAT gateway is available. This is a stable state after the NAT gateway is created.</li>
     * <li><strong>Modifying</strong>: The NAT gateway is being modified. Modifying a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Modifying</strong> state until the operation is complete.</li>
     * <li><strong>Deleting</strong>: The NAT gateway is being deleted. Deleting a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Deleting</strong> state until the operation is complete.</li>
     * <li><strong>Converting</strong>: The NAT gateway is being converted. Converting a standard NAT gateway to an enhanced NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Converting</strong> state until the operation is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the VPC to which the NAT gateway instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72z****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetNatGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayAttributeResponseBody self = new GetNatGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayAttributeResponseBody setAccessMode(GetNatGatewayAttributeResponseBodyAccessMode accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyAccessMode getAccessMode() {
        return this.accessMode;
    }

    public GetNatGatewayAttributeResponseBody setAvailabilityMode(String availabilityMode) {
        this.availabilityMode = availabilityMode;
        return this;
    }
    public String getAvailabilityMode() {
        return this.availabilityMode;
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

    public GetNatGatewayAttributeResponseBody setEnableSessionLog(Boolean enableSessionLog) {
        this.enableSessionLog = enableSessionLog;
        return this;
    }
    public Boolean getEnableSessionLog() {
        return this.enableSessionLog;
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

    public GetNatGatewayAttributeResponseBody setLogDelivery(GetNatGatewayAttributeResponseBodyLogDelivery logDelivery) {
        this.logDelivery = logDelivery;
        return this;
    }
    public GetNatGatewayAttributeResponseBodyLogDelivery getLogDelivery() {
        return this.logDelivery;
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

    public static class GetNatGatewayAttributeResponseBodyAccessMode extends TeaModel {
        /**
         * <p>The access mode value. Valid values:</p>
         * <ul>
         * <li><p><strong>route</strong>: Route mode.</p>
         * </li>
         * <li><p><strong>tunnel</strong>: Tunnel mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>route</p>
         */
        @NameInMap("ModeValue")
        public String modeValue;

        /**
         * <p>The tunnel mode type. Valid values:</p>
         * <ul>
         * <li><strong>geneve</strong>: Geneve type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>geneve</p>
         */
        @NameInMap("TunnelType")
        public String tunnelType;

        public static GetNatGatewayAttributeResponseBodyAccessMode build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyAccessMode self = new GetNatGatewayAttributeResponseBodyAccessMode();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyAccessMode setModeValue(String modeValue) {
            this.modeValue = modeValue;
            return this;
        }
        public String getModeValue() {
            return this.modeValue;
        }

        public GetNatGatewayAttributeResponseBodyAccessMode setTunnelType(String tunnelType) {
            this.tunnelType = tunnelType;
            return this;
        }
        public String getTunnelType() {
            return this.tunnelType;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyBillingConfig extends TeaModel {
        /**
         * <p>Indicates whether automatic payment is enabled. When the value of <strong>InstanceChargeType</strong> is <strong>PrePaid</strong>, the following values are returned:</p>
         * <ul>
         * <li><p><strong>false</strong>: Automatic payment is disabled. After an order is generated, go to the Order Center to complete the payment.</p>
         * </li>
         * <li><p><strong>true</strong>: Automatic payment is enabled. The order is automatically paid.</p>
         * </li>
         * </ul>
         * <p>When the value of <strong>InstanceChargeType</strong> is <strong>PostPaid</strong>, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoPay")
        public String autoPay;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The billing method of the NAT gateway instance. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;- <strong>PostPaid</strong>: pay-as-you-go.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- <strong>PrePaid</strong>: subscription.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;The billing method of the NAT gateway instance. Valid values: <strong>PostPaid</strong> (pay-as-you-go).</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The billing type of the NAT gateway instance. Valid values:</p>
         * <ul>
         * <li><strong>PayBySpec</strong>: Billed by defined specifications.</li>
         * <li><strong>PayByLcu</strong>: Billed by usage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayBySpec</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The specification of the Internet NAT gateway instance. When <strong>InternetChargeType</strong> is <strong>PayBySpec</strong>, the following values are returned:</p>
         * <ul>
         * <li><strong>Small</strong>: small.</li>
         * <li><strong>Middle</strong>: medium.</li>
         * <li><strong>Large</strong>: large.
         * When <strong>InternetChargeType</strong> is <strong>PayByLcu</strong>, an empty value is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Small</p>
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
         * <ul>
         * <li><strong>true</strong>: Deletion protection is enabled.</li>
         * <li><strong>false</strong>: Deletion protection is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForwardEntryCount")
        public Integer forwardEntryCount;

        /**
         * <p>The ID of the DNAT table.</p>
         * 
         * <strong>example:</strong>
         * <p>ftb-uf6gj3mhsg94qsqst****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FullNatEntryCount")
        public Long fullNatEntryCount;

        /**
         * <p>The ID of the FULLNAT table.</p>
         * 
         * <strong>example:</strong>
         * <p>fulltb-gw88z7hhlv43rmb26****</p>
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
         * <p>The instance ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp13e9i2qst4g6jzi****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The IP address of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>116.33.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The association status of the EIP bound to the Internet NAT gateway instance.</p>
         * <ul>
         * <li><strong>idle</strong>: The EIP is not associated with a SNAT entry or DNAT entry.</li>
         * <li><strong>UsedBySnatTable</strong>: The EIP is associated with a SNAT entry.</li>
         * <li><strong>UsedByForwardTable</strong>: The EIP is associated with a DNAT entry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>idle</p>
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

    public static class GetNatGatewayAttributeResponseBodyLogDelivery extends TeaModel {
        /**
         * <p>The error message for session log writing failure.</p>
         * 
         * <strong>example:</strong>
         * <p>LogStoreNotExist: logstore session_log_test does not exist</p>
         */
        @NameInMap("DeliverLogsErrorMessage")
        public String deliverLogsErrorMessage;

        /**
         * <p>The status of session log writing. Valid values:</p>
         * <ul>
         * <li><strong>Succsess</strong>: Succeeded.</li>
         * <li><strong>Failure</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Failure</p>
         */
        @NameInMap("DeliveryStatus")
        public String deliveryStatus;

        /**
         * <p>The destination type for session log delivery. Valid values:
         * <strong>sls</strong>: Alibaba Cloud Simple Log Service (SLS).</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("LogDeliveryType")
        public String logDeliveryType;

        /**
         * <p>The destination address to which session logs are written.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou:0000:project/nat_session_log_project/logstore/session_log_test</p>
         */
        @NameInMap("LogDestination")
        public String logDestination;

        public static GetNatGatewayAttributeResponseBodyLogDelivery build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayAttributeResponseBodyLogDelivery self = new GetNatGatewayAttributeResponseBodyLogDelivery();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayAttributeResponseBodyLogDelivery setDeliverLogsErrorMessage(String deliverLogsErrorMessage) {
            this.deliverLogsErrorMessage = deliverLogsErrorMessage;
            return this;
        }
        public String getDeliverLogsErrorMessage() {
            return this.deliverLogsErrorMessage;
        }

        public GetNatGatewayAttributeResponseBodyLogDelivery setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        public GetNatGatewayAttributeResponseBodyLogDelivery setLogDeliveryType(String logDeliveryType) {
            this.logDeliveryType = logDeliveryType;
            return this;
        }
        public String getLogDeliveryType() {
            return this.logDeliveryType;
        }

        public GetNatGatewayAttributeResponseBodyLogDelivery setLogDestination(String logDestination) {
            this.logDestination = logDestination;
            return this;
        }
        public String getLogDestination() {
            return this.logDestination;
        }

    }

    public static class GetNatGatewayAttributeResponseBodyPrivateInfo extends TeaModel {
        /**
         * <p>The instance ID of the elastic network interfaces (ENIs) network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1cmgtoaka8vfyg****</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The zone to which the NAT gateway instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao-b</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <p>The maximum bandwidth value. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The ID of the vSwitch to which the NAT gateway instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1s2laxhdf9ayjbo***</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SnatEntryCount")
        public Integer snatEntryCount;

        /**
         * <p>The ID of the SNAT table.</p>
         * 
         * <strong>example:</strong>
         * <p>stb-SnatTableIds****</p>
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
