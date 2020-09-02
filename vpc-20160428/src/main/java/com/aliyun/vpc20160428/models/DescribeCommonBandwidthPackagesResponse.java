// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCommonBandwidthPackagesResponse extends TeaModel {
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

    @NameInMap("CommonBandwidthPackages")
    @Validation(required = true)
    public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages commonBandwidthPackages;

    public static DescribeCommonBandwidthPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonBandwidthPackagesResponse self = new DescribeCommonBandwidthPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonBandwidthPackagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonBandwidthPackagesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCommonBandwidthPackagesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommonBandwidthPackagesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCommonBandwidthPackagesResponse setCommonBandwidthPackages(DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages commonBandwidthPackages) {
        this.commonBandwidthPackages = commonBandwidthPackages;
        return this;
    }
    public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages getCommonBandwidthPackages() {
        return this.commonBandwidthPackages;
    }

    public static class DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse extends TeaModel {
        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        public static DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse self = new DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddresse")
        @Validation(required = true)
        public java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse;

        public static DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses self = new DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses setPublicIpAddresse(java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse) {
            this.publicIpAddresse = publicIpAddresse;
            return this;
        }
        public java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse> getPublicIpAddresse() {
            return this.publicIpAddresse;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage extends TeaModel {
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public String bandwidthPackageId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public String bandwidth;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Ratio")
        @Validation(required = true)
        public Integer ratio;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("HasReservationData")
        @Validation(required = true)
        public String hasReservationData;

        @NameInMap("ReservationBandwidth")
        @Validation(required = true)
        public String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        @Validation(required = true)
        public String reservationInternetChargeType;

        @NameInMap("ReservationActiveTime")
        @Validation(required = true)
        public String reservationActiveTime;

        @NameInMap("ReservationOrderType")
        @Validation(required = true)
        public String reservationOrderType;

        @NameInMap("ISP")
        @Validation(required = true)
        public String ISP;

        @NameInMap("DeletionProtection")
        @Validation(required = true)
        public Boolean deletionProtection;

        @NameInMap("PublicIpAddresses")
        @Validation(required = true)
        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses publicIpAddresses;

        public static DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage self = new DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setRatio(Integer ratio) {
            this.ratio = ratio;
            return this;
        }
        public Integer getRatio() {
            return this.ratio;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage setPublicIpAddresses(DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

    }

    public static class DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages extends TeaModel {
        @NameInMap("CommonBandwidthPackage")
        @Validation(required = true)
        public java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage> commonBandwidthPackage;

        public static DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages self = new DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages setCommonBandwidthPackage(java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage> commonBandwidthPackage) {
            this.commonBandwidthPackage = commonBandwidthPackage;
            return this;
        }
        public java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage> getCommonBandwidthPackage() {
            return this.commonBandwidthPackage;
        }

    }

}
