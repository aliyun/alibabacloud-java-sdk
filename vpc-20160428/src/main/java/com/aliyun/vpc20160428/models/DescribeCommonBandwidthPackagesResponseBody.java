// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCommonBandwidthPackagesResponseBody extends TeaModel {
    /**
     * <p>The details of the Internet Shared Bandwidth instance.</p>
     */
    @NameInMap("CommonBandwidthPackages")
    public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages commonBandwidthPackages;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>20E6FD1C-7321-4DAD-BDFD-EC8769E4AA33</p>
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

    public static DescribeCommonBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonBandwidthPackagesResponseBody self = new DescribeCommonBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonBandwidthPackagesResponseBody setCommonBandwidthPackages(DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages commonBandwidthPackages) {
        this.commonBandwidthPackages = commonBandwidthPackages;
        return this;
    }
    public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages getCommonBandwidthPackages() {
        return this.commonBandwidthPackages;
    }

    public DescribeCommonBandwidthPackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommonBandwidthPackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCommonBandwidthPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp13e9i2qst4g6jzi****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>Indicates whether the EIP is associated with the Internet Shared Bandwidth instance. Valid values:</p>
         * <ul>
         * <li><strong>BINDED</strong></li>
         * <li><strong>BINDING</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BINDED</p>
         */
        @NameInMap("BandwidthPackageIpRelationStatus")
        public String bandwidthPackageIpRelationStatus;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.95.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        public static DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse self = new DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse setBandwidthPackageIpRelationStatus(String bandwidthPackageIpRelationStatus) {
            this.bandwidthPackageIpRelationStatus = bandwidthPackageIpRelationStatus;
            return this;
        }
        public String getBandwidthPackageIpRelationStatus() {
            return this.bandwidthPackageIpRelationStatus;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddresse")
        public java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse;

        public static DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses self = new DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses setPublicIpAddresse(java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse) {
            this.publicIpAddresse = publicIpAddresse;
            return this;
        }
        public java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse> getPublicIpAddresse() {
            return this.publicIpAddresse;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes extends TeaModel {
        @NameInMap("SecurityProtectionType")
        public java.util.List<String> securityProtectionType;

        public static DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes self = new DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes setSecurityProtectionType(java.util.List<String> securityProtectionType) {
            this.securityProtectionType = securityProtectionType;
            return this;
        }
        public java.util.List<String> getSecurityProtectionType() {
            return this.securityProtectionType;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag extends TeaModel {
        /**
         * <p>The tag key that is added to the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that is added to the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ValueTest</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag self = new DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag> tag;

        public static DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags self = new DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags setTag(java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage extends TeaModel {
        /**
         * <p>The maximum bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The ID of the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1t3sm1ffzmshdki****</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The service type of the Internet Shared Bandwidth instance. Valid values:</p>
         * <ul>
         * <li><strong>CloudBox</strong> The cloud box. Only cloud box users can select this type.</li>
         * <li><strong>Default</strong> (default): The general service type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudBox</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The service status of the Internet Shared Bandwidth instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The Internet Shared Bandwidth instance runs as expected.</li>
         * <li><strong>FinancialLocked</strong>: An overdue payment occurs in the Internet Shared Bandwidth instance</li>
         * <li><strong>Unactivated</strong>: The Internet Shared Bandwidth instance is not activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The time when the Internet Shared Bandwidth instance was created. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-06-28T06:39:20Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

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
         * <p>The description of the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the Internet Shared Bandwidth instance expired. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-15T03:08:37Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether the information about pending orders is returned. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
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
         * <li><strong>BGP</strong>: BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro line The BGP (Multi-ISP) Pro line is supported in the China (Hong Kong), Singapore (Singapore), Japan (Tokyo), Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
         * </ul>
         * <p>If you are allowed to use single-ISP bandwidth, one of the following values is returned:</p>
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
         * <p>The billing method of the Internet Shared Bandwidth instance. Valid value:</p>
         * <p><strong>PostPaid</strong>: pay-as-you-go</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the Internet Shared Bandwidth instance. Valid value:</p>
         * <p><strong>PayByTraffic</strong></p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The name of the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The elastic IP addresses (EIPs) that are associated with the Internet Shared Bandwidth instance.</p>
         */
        @NameInMap("PublicIpAddresses")
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses publicIpAddresses;

        /**
         * <p>The percentage of the minimum bandwidth commitment. Only <strong>20</strong> is returned.</p>
         * <blockquote>
         * <p> This parameter is supported only on the Alibaba Cloud China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Ratio")
        public Integer ratio;

        /**
         * <p>The ID of the region where the Internet Shared Bandwidth instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the renewal took effect. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-30T16:00:00Z</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The new maximum bandwidth after the configurations are changed. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        /**
         * <p>The metering method after the configurations are changed. Valid value:</p>
         * <p><strong>PayByTraffic</strong></p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The renewal method. Valid values:</p>
         * <ul>
         * <li><strong>RENEWCHANGE</strong>: renewal with a specification change</li>
         * <li><strong>TEMP_UPGRADE</strong>: renewal with a temporary upgrade</li>
         * <li><strong>UPGRADE</strong>: renewal with an upgrade</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RENEWCHANGE</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The editions of Anti-DDoS.</p>
         * <ul>
         * <li>If this parameter is empty, Anti-DDoS Origin Basic is enabled.</li>
         * <li>If <strong>AntiDDoS_Enhanced</strong> is returned, Anti-DDoS Pro/Premium is enabled.</li>
         * </ul>
         */
        @NameInMap("SecurityProtectionTypes")
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes securityProtectionTypes;

        /**
         * <p>Indicates whether the resource is created by the service account. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The resource is not created by the service account.</li>
         * <li><strong>1</strong>: The resource is created by the service account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        /**
         * <p>The status of the Internet Shared Bandwidth instance. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong>: The Internet Shared Bandwidth instance is available.</li>
         * <li><strong>Modifying</strong>: The Internet Shared Bandwidth instance is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag that is added to the Internet Shared Bandwidth instance.</p>
         */
        @NameInMap("Tags")
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags tags;

        /**
         * <p>The zone of the Internet Shared Bandwidth instance. This parameter is returned only when BizType is set to CloudBox. If BizType is set to Default, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1-lzdvn-cb</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage self = new DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setPublicIpAddresses(DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setRatio(Integer ratio) {
            this.ratio = ratio;
            return this;
        }
        public Integer getRatio() {
            return this.ratio;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setSecurityProtectionTypes(DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes securityProtectionTypes) {
            this.securityProtectionTypes = securityProtectionTypes;
            return this;
        }
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes getSecurityProtectionTypes() {
            return this.securityProtectionTypes;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setServiceManaged(Integer serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Integer getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setTags(DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags getTags() {
            return this.tags;
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages extends TeaModel {
        @NameInMap("CommonBandwidthPackage")
        public java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage> commonBandwidthPackage;

        public static DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages self = new DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages setCommonBandwidthPackage(java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage> commonBandwidthPackage) {
            this.commonBandwidthPackage = commonBandwidthPackage;
            return this;
        }
        public java.util.List<DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackage> getCommonBandwidthPackage() {
            return this.commonBandwidthPackage;
        }

    }

}
