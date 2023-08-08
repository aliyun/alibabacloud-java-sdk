// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponseBody extends TeaModel {
    /**
     * <p>The details about the EIP.</p>
     */
    @NameInMap("EipAddresses")
    public DescribeEipAddressesResponseBodyEipAddresses eipAddresses;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponseBody self = new DescribeEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponseBody setEipAddresses(DescribeEipAddressesResponseBodyEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public DescribeEipAddressesResponseBodyEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public DescribeEipAddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipAddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason extends TeaModel {
        /**
         * <p>The reason why the EIP is locked. Valid values:</p>
         * <br>
         * <p>*   **financial**: The EIP is locked due to overdue payments.</p>
         * <p>*   **security**: The EIP is locked for security reasons.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason> lockReason;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks setLockReason(java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes extends TeaModel {
        @NameInMap("SecurityProtectionType")
        public java.util.List<String> securityProtectionType;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes setSecurityProtectionType(java.util.List<String> securityProtectionType) {
            this.securityProtectionType = securityProtectionType;
            return this;
        }
        public java.util.List<String> getSecurityProtectionType() {
            return this.securityProtectionType;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag extends TeaModel {
        /**
         * <p>The tag key of the EIP.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the EIP.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag> tag;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressTags self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressTags();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressTags setTag(java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddress extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The time when the EIP was created. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("AllocationTime")
        public String allocationTime;

        /**
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The maximum bandwidth of the EIP bandwidth plan with which the EIP is associated. Unit: Mbit/s.</p>
         */
        @NameInMap("BandwidthPackageBandwidth")
        public String bandwidthPackageBandwidth;

        /**
         * <p>The ID of the EIP bandwidth plan.</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The type of the bandwidth. Only **CommonBandwidthPackage** (EIP Bandwidth Plan) is returned.</p>
         */
        @NameInMap("BandwidthPackageType")
        public String bandwidthPackageType;

        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The service status of the EIP. Valid values:</p>
         * <br>
         * <p>*   **Normal**: active</p>
         * <p>*   **FinancialLocked**: locked</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <br>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         * <p>*   **PrePaid**: subscription</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>Indicates whether deletion protection is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description of the EIP.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum bandwidth of the EIP when it is not associated with an EIP bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("EipBandwidth")
        public String eipBandwidth;

        /**
         * <p>The time when the EIP expires. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether fine-grained monitoring is enabled for the EIP. Valid values:</p>
         * <br>
         * <p>*   **false**: no</p>
         * <p>*   **true**: yes</p>
         */
        @NameInMap("HDMonitorStatus")
        public String HDMonitorStatus;

        /**
         * <p>Indicates whether renewal data is included.</p>
         * <br>
         * <p>*   **false**: no</p>
         * <p>*   **true**: yes This parameter returns **true** only when the **IncludeReservationData** parameter is set to **true** and some orders have not taken effect.</p>
         */
        @NameInMap("HasReservationData")
        public String hasReservationData;

        /**
         * <p>The line type.</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP). All regions support BGP (Multi-ISP) EIPs.</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines. Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</p>
         * <br>
         * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).</p>
         * <br>
         * <p>If you are allowed to use single-ISP bandwidth, one of the following values is returned:</p>
         * <br>
         * <p>*   **ChinaTelecom**: China Telecom</p>
         * <p>*   **ChinaUnicom**: China Unicom</p>
         * <p>*   **ChinaMobile**: China Mobile</p>
         * <p>*   **ChinaTelecom_L2**: China Telecom L2</p>
         * <p>*   **ChinaUnicom_L2**: China Unicom L2</p>
         * <p>*   **ChinaMobile_L2**: China Mobile L2</p>
         * <br>
         * <p>If your services are deployed in China East 1 Finance, **BGP_FinanceCloud** is returned.</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The ID of the associated instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the associated instance.</p>
         */
        @NameInMap("InstanceRegionId")
        public String instanceRegionId;

        /**
         * <p>The type of the associated instance. Valid values:</p>
         * <br>
         * <p>*   **EcsInstance**: an ECS instance in a VPC</p>
         * <p>*   **SlbInstance**: an SLB instance in a VPC</p>
         * <p>*   **Nat**: a NAT gateway</p>
         * <p>*   **HaVip**: an HAVIP</p>
         * <p>*   **NetworkInterface**: a secondary ENI</p>
         * <p>*   **IpAddress**: an IP address</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The metering method of the EIP. Valid values:</p>
         * <br>
         * <p>*   **PayByBandwidth**: pay-by-bandwidth</p>
         * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The IP address of the EIP.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The name of the EIP.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network type. The value is set to **public**, which indicates the Internet.</p>
         */
        @NameInMap("Netmode")
        public String netmode;

        /**
         * <p>The details about the locked EIPs.</p>
         */
        @NameInMap("OperationLocks")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks operationLocks;

        /**
         * <p>The ID of the IP address pool to which the EIP belongs.</p>
         */
        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        /**
         * <p>The region ID of the EIP.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the renewal takes effect. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
         */
        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        /**
         * <p>The metering method that is used after the renewal takes effect. Valid values:</p>
         * <br>
         * <p>*   **PayByBandwidth**: pay-by-bandwidth</p>
         * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The type of the renewal order. Valid values:</p>
         * <br>
         * <p>*   **RENEWCHANGE**: renewal with an upgrade or a downgrade</p>
         * <p>*   **TEMP_UPGRADE**: temporary upgrade</p>
         * <p>*   **UPGRADE**: upgrade</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether level-2 throttling is configured. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("SecondLimited")
        public Boolean secondLimited;

        /**
         * <p>The edition of Anti-DDoS. </p>
         * <br>
         * <p>- If an empty value is returned, it indicates that Anti-DDoS Origin Basic is used.</p>
         * <p>- If **AntiDDoS_Enhanced** is returned, it indicates that Anti-DDoS Pro/Premium is used.</p>
         */
        @NameInMap("SecurityProtectionTypes")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes securityProtectionTypes;

        /**
         * <p>The IDs of contiguous EIPs.</p>
         * <br>
         * <p>This value is returned only when you query contiguous EIP groups.</p>
         */
        @NameInMap("SegmentInstanceId")
        public String segmentInstanceId;

        /**
         * <p>Indicates whether the resource is created by the service account.</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        /**
         * <p>The status of the EIP. Valid values:</p>
         * <br>
         * <p>*   **Associating**: being associated</p>
         * <p>*   **Unassociating**: being disassociated</p>
         * <p>*   **InUse**: allocated</p>
         * <p>*   **Available**: available</p>
         * <p>*   **Releasing**: being released</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list of the EIP.</p>
         */
        @NameInMap("Tags")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressTags tags;

        /**
         * <p>The ID of the VPC that has IPv4 gateways enabled and that is deployed in the same region as the EIP. </p>
         * <br>
         * <p>When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations. </p>
         * <br>
         * <p>>  This parameter is returned if **InstanceType** is set to **IpAddress**. In this case, the EIP is associated with an IP address.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone of the EIP. </p>
         * <br>
         * <p>This parameter is returned only if your account is included in the whitelist.</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddress self = new DescribeEipAddressesResponseBodyEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
            this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
            return this;
        }
        public String getBandwidthPackageBandwidth() {
            return this.bandwidthPackageBandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidthPackageType(String bandwidthPackageType) {
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setEipBandwidth(String eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public String getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setHDMonitorStatus(String HDMonitorStatus) {
            this.HDMonitorStatus = HDMonitorStatus;
            return this;
        }
        public String getHDMonitorStatus() {
            return this.HDMonitorStatus;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceRegionId(String instanceRegionId) {
            this.instanceRegionId = instanceRegionId;
            return this;
        }
        public String getInstanceRegionId() {
            return this.instanceRegionId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setNetmode(String netmode) {
            this.netmode = netmode;
            return this;
        }
        public String getNetmode() {
            return this.netmode;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setOperationLocks(DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setPublicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setSecondLimited(Boolean secondLimited) {
            this.secondLimited = secondLimited;
            return this;
        }
        public Boolean getSecondLimited() {
            return this.secondLimited;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setSecurityProtectionTypes(DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes securityProtectionTypes) {
            this.securityProtectionTypes = securityProtectionTypes;
            return this;
        }
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes getSecurityProtectionTypes() {
            return this.securityProtectionTypes;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setSegmentInstanceId(String segmentInstanceId) {
            this.segmentInstanceId = segmentInstanceId;
            return this;
        }
        public String getSegmentInstanceId() {
            return this.segmentInstanceId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setServiceManaged(Integer serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Integer getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setTags(DescribeEipAddressesResponseBodyEipAddressesEipAddressTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressTags getTags() {
            return this.tags;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> eipAddress;

        public static DescribeEipAddressesResponseBodyEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddresses self = new DescribeEipAddressesResponseBodyEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddresses setEipAddress(java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
