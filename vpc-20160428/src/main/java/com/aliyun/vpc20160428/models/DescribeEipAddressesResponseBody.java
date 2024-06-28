// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponseBody extends TeaModel {
    /**
     * <p>The details about the EIPs.</p>
     */
    @NameInMap("EipAddresses")
    public DescribeEipAddressesResponseBodyEipAddresses eipAddresses;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li><strong>financial</strong>: The EIP is locked due to overdue payments.</li>
         * <li><strong>security</strong>: The EIP is locked for security reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
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
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>ValueTest</p>
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
         * 
         * <strong>example:</strong>
         * <p>eip-2zeerraiwb7ujcdvf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The time when the EIP was created. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-23T01:37:38Z</p>
         */
        @NameInMap("AllocationTime")
        public String allocationTime;

        /**
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The maximum bandwidth of the Internet Shared Bandwidth instance with which the EIP is associated. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("BandwidthPackageBandwidth")
        public String bandwidthPackageBandwidth;

        /**
         * <p>The ID of the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1ego3i4j07ccdvf****</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The type of the bandwidth. Only <strong>CommonBandwidthPackage</strong> may be returned, which indicates Internet Shared Bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>CommonBandwidthPackage</p>
         */
        @NameInMap("BandwidthPackageType")
        public String bandwidthPackageType;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><strong>CloudBox</strong> Only cloud box users can select this type.</li>
         * <li><strong>Default</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudBox</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The service state of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>Indicates whether deletion protection is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum bandwidth of the EIP when it is not associated with an Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("EipBandwidth")
        public String eipBandwidth;

        /**
         * <p>The time when the EIP expires. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T02:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether fine-grained monitoring is enabled for the EIP. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HDMonitorStatus")
        public String HDMonitorStatus;

        /**
         * <p>Indicates whether renewal data is included. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong> A value of <strong>true</strong> is returned only when <strong>IncludeReservationData</strong> is set to <strong>true</strong> and some orders have not taken effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasReservationData")
        public String hasReservationData;

        /**
         * <p>The line type. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong>: BGP (Multi-ISP). The BGP (Multi-ISP) line is supported in all regions.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines. BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
         * </ul>
         * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see the <a href="https://help.aliyun.com/document_detail/32321.html">Line types</a> section of the &quot;What is EIP?&quot; topic.</p>
         * <p>If you are allowed to use single-ISP bandwidth, one of the following values may be returned:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong></li>
         * <li><strong>ChinaUnicom</strong></li>
         * <li><strong>ChinaMobile</strong></li>
         * <li><strong>ChinaTelecom_L2</strong></li>
         * <li><strong>ChinaUnicom_L2</strong></li>
         * <li><strong>ChinaMobile_L2</strong></li>
         * </ul>
         * <p>If your services are deployed in China East 1 Finance, <strong>BGP_FinanceCloud</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The ID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp15zckdt37cdvf****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("InstanceRegionId")
        public String instanceRegionId;

        /**
         * <p>The type of the associated instance. Valid values:</p>
         * <ul>
         * <li><strong>EcsInstance</strong>: an ECS instance in a VPC.</li>
         * <li><strong>SlbInstance</strong>: a CLB instance in a VPC.</li>
         * <li><strong>Nat</strong>: a NAT gateway.</li>
         * <li><strong>HaVip</strong>: an HAVIP.</li>
         * <li><strong>NetworkInterface</strong>: a secondary ENI.</li>
         * <li><strong>IpAddress</strong>: an IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsInstance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The metering method of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>PayByBandwidth</strong></li>
         * <li><strong>PayByTraffic</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>47.75.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The association mode. Valid values:</p>
         * <ul>
         * <li><strong>NAT</strong>: NAT mode</li>
         * <li><strong>MULTI_BINDED</strong>: multi-EIP-to-ENI mode</li>
         * <li><strong>BINDED</strong>: cut-through mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAT</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The name of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>EIP-01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network type. Only <strong>public</strong> may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("Netmode")
        public String netmode;

        /**
         * <p>The details about the locked EIP.</p>
         */
        @NameInMap("OperationLocks")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks operationLocks;

        /**
         * <p>The private IP address of the secondary ENI with which the EIP is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The ID of the IP address pool to which the EIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pippool-2vc0kxcedhquybdsz****</p>
         */
        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        /**
         * <p>The region ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the renewal took effect. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T16:00:00Z</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        /**
         * <p>The metering method that is used after the renewal takes effect. Valid values:</p>
         * <ul>
         * <li><strong>PayByBandwidth</strong></li>
         * <li><strong>PayByTraffic</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The type of the renewal order. Valid values:</p>
         * <ul>
         * <li><strong>RENEWCHANGE</strong>: renewal with an upgrade or a downgrade.</li>
         * <li><strong>TEMP_UPGRADE</strong>: temporary upgrade.</li>
         * <li><strong>UPGRADE</strong>: upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RENEWCHANGE</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazcdxs****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether level-2 throttling is configured. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SecondLimited")
        public Boolean secondLimited;

        /**
         * <p>The edition of Anti-DDoS.</p>
         * <ul>
         * <li>If an empty value is returned, it indicates that Anti-DDoS Origin Basic is used.</li>
         * <li>If <strong>AntiDDoS_Enhanced</strong> is returned, it indicates that Anti-DDoS Pro/Premium is used.</li>
         * </ul>
         */
        @NameInMap("SecurityProtectionTypes")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressSecurityProtectionTypes securityProtectionTypes;

        /**
         * <p>The ID of the contiguous EIP group.</p>
         * <p>This value is returned only when you query contiguous EIPs.</p>
         * 
         * <strong>example:</strong>
         * <p>eipsg-t4nr90yik5oy38xd****</p>
         */
        @NameInMap("SegmentInstanceId")
        public String segmentInstanceId;

        /**
         * <p>Indicates whether the resource is created by the service account. Valid values:</p>
         * <ul>
         * <li><strong>0</strong></li>
         * <li><strong>1</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        /**
         * <p>The status of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>Associating</strong></li>
         * <li><strong>Unassociating</strong></li>
         * <li><strong>InUse</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Releasing</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the EIP.</p>
         */
        @NameInMap("Tags")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressTags tags;

        /**
         * <p>The ID of the VPC in which an IPv4 gateway is created and that is deployed in the same region as the EIP.</p>
         * <p>When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.</p>
         * <blockquote>
         * <p> This parameter is returned if the value of <strong>InstanceType</strong> is <strong>IpAddress</strong>. In this case, the EIP is associated with an IP address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone of the EIP.</p>
         * <p>This parameter is returned only when the service type is CloudBox.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
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

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
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

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
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
