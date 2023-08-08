// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCommonBandwidthPackagesResponseBody extends TeaModel {
    /**
     * <p>The details of the EIP bandwidth plan.</p>
     */
    @NameInMap("CommonBandwidthPackages")
    public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackages commonBandwidthPackages;

    /**
     * <p>The number of the returned page.</p>
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
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>Indicates whether the EIP is associated with the EIP bandwidth plan.</p>
         * <br>
         * <p>*   **BINDED**: The EIP is associated with the EIP bandwidth plan.</p>
         * <p>*   **BINDING**: The EIP is being associated with the EIP bandwidth plan.</p>
         */
        @NameInMap("BandwidthPackageIpRelationStatus")
        public String bandwidthPackageIpRelationStatus;

        /**
         * <p>The public IP address.</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>The maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The ID of the EIP bandwidth plan.</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The service state of the EIP bandwidth plan.</p>
         * <br>
         * <p>*   **Normal**: The EIP bandwidth plan works as expected.</p>
         * <p>*   **FinancialLocked**: The EIP bandwidth plan has an overdue payment.</p>
         * <p>*   **Unactivated**: The EIP bandwidth plan is not activated.</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The time when the EIP bandwidth plan was created. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether deletion protection was enabled.</p>
         * <br>
         * <p>*   **true**: Deletion protection was enabled.</p>
         * <p>*   **false**: Deletion protection was disabled.</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description of the EIP bandwidth plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the EIP bandwidth plan expired. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether the information about pending orders was returned.</p>
         * <br>
         * <p>*   **false**: The information about pending orders was not returned.</p>
         * <p>*   **true**: The information about pending orders was returned.</p>
         */
        @NameInMap("HasReservationData")
        public String hasReservationData;

        /**
         * <p>The line type.</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP) lines. BGP (Multi-ISP) lines are available in all regions.</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines. BGP (Multi-ISP) Pro lines are available only in the China (Hong Kong), Singapore, Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions.</p>
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
         * <p>The billing method of the EIP bandwidth plan.</p>
         * <br>
         * <p>**PostPaid**: the pay-as-you-go billing method</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the EIP bandwidth plan.</p>
         * <br>
         * <p>**PayByTraffic**: the pay-by-data-transfer metering method.</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The name of the EIP bandwidth plan.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The elastic IP addresses (EIPs) associated with the EIP bandwidth plan.</p>
         */
        @NameInMap("PublicIpAddresses")
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses publicIpAddresses;

        /**
         * <p>The percentage of the minimum bandwidth commitment. **20** is returned.</p>
         * <br>
         * <p>>  This parameter is available only on the Alibaba Cloud China site.</p>
         */
        @NameInMap("Ratio")
        public Integer ratio;

        /**
         * <p>The region ID of the EIP bandwidth plan.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the renewal took effect. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The new maximum bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        /**
         * <p>The new metering method.</p>
         * <br>
         * <p>**PayByTraffic**: the pay-by-data-transfer metering method</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The renewal method.</p>
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
         * <p>The edition of Anti-DDoS. </p>
         * <br>
         * <p>- If this parameter is empty, it indicates that Anti-DDoS Origin Basic was enabled.</p>
         * <p>- If **AntiDDoS_Enhanced** is returned, it indicates that Anti-DDoS Pro/Premium was enabled.</p>
         */
        @NameInMap("SecurityProtectionTypes")
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageSecurityProtectionTypes securityProtectionTypes;

        /**
         * <p>Indicates whether the EIP bandwidth plan was created by the service account.</p>
         * <br>
         * <p>*   **0**: The EIP bandwidth plan was not created by the service account.</p>
         * <p>*   **1**: The EIP bandwidth plan was created by the service account.</p>
         */
        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        /**
         * <p>The status of the EIP bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **Available**: The EIP bandwidth plan is available.</p>
         * <p>*   **Modifying**: The EIP bandwidth plan is being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeCommonBandwidthPackagesResponseBodyCommonBandwidthPackagesCommonBandwidthPackageTags tags;

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
