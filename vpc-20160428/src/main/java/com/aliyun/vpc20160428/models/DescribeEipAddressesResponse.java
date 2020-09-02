// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponse extends TeaModel {
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

    @NameInMap("EipAddresses")
    @Validation(required = true)
    public DescribeEipAddressesResponseEipAddresses eipAddresses;

    public static DescribeEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponse self = new DescribeEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipAddressesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEipAddressesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipAddressesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipAddressesResponse setEipAddresses(DescribeEipAddressesResponseEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public DescribeEipAddressesResponseEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason self = new DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason> lockReason;

        public static DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks self = new DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks setLockReason(java.util.List<DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions extends TeaModel {
        // AvailableRegion
        @NameInMap("AvailableRegion")
        @Validation(required = true)
        public java.util.List<String> availableRegion;

        public static DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions self = new DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions setAvailableRegion(java.util.List<String> availableRegion) {
            this.availableRegion = availableRegion;
            return this;
        }
        public java.util.List<String> getAvailableRegion() {
            return this.availableRegion;
        }

    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddress extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public String bandwidth;

        @NameInMap("EipBandwidth")
        @Validation(required = true)
        public String eipBandwidth;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("AllocationTime")
        @Validation(required = true)
        public String allocationTime;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("InstanceRegionId")
        @Validation(required = true)
        public String instanceRegionId;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("HDMonitorStatus")
        @Validation(required = true)
        public String HDMonitorStatus;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ISP")
        @Validation(required = true)
        public String ISP;

        @NameInMap("Descritpion")
        @Validation(required = true)
        public String descritpion;

        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public String bandwidthPackageId;

        @NameInMap("BandwidthPackageType")
        @Validation(required = true)
        public String bandwidthPackageType;

        @NameInMap("BandwidthPackageBandwidth")
        @Validation(required = true)
        public String bandwidthPackageBandwidth;

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

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("DeletionProtection")
        @Validation(required = true)
        public Boolean deletionProtection;

        @NameInMap("SecondLimited")
        @Validation(required = true)
        public Boolean secondLimited;

        @NameInMap("SegmentInstanceId")
        @Validation(required = true)
        public String segmentInstanceId;

        @NameInMap("Netmode")
        @Validation(required = true)
        public String netmode;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks operationLocks;

        @NameInMap("AvailableRegions")
        @Validation(required = true)
        public DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions availableRegions;

        public static DescribeEipAddressesResponseEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddress self = new DescribeEipAddressesResponseEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setEipBandwidth(String eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public String getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setInstanceRegionId(String instanceRegionId) {
            this.instanceRegionId = instanceRegionId;
            return this;
        }
        public String getInstanceRegionId() {
            return this.instanceRegionId;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setHDMonitorStatus(String HDMonitorStatus) {
            this.HDMonitorStatus = HDMonitorStatus;
            return this;
        }
        public String getHDMonitorStatus() {
            return this.HDMonitorStatus;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setDescritpion(String descritpion) {
            this.descritpion = descritpion;
            return this;
        }
        public String getDescritpion() {
            return this.descritpion;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setBandwidthPackageType(String bandwidthPackageType) {
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setBandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
            this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
            return this;
        }
        public String getBandwidthPackageBandwidth() {
            return this.bandwidthPackageBandwidth;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setSecondLimited(Boolean secondLimited) {
            this.secondLimited = secondLimited;
            return this;
        }
        public Boolean getSecondLimited() {
            return this.secondLimited;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setSegmentInstanceId(String segmentInstanceId) {
            this.segmentInstanceId = segmentInstanceId;
            return this;
        }
        public String getSegmentInstanceId() {
            return this.segmentInstanceId;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setNetmode(String netmode) {
            this.netmode = netmode;
            return this;
        }
        public String getNetmode() {
            return this.netmode;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setOperationLocks(DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setAvailableRegions(DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions availableRegions) {
            this.availableRegions = availableRegions;
            return this;
        }
        public DescribeEipAddressesResponseEipAddressesEipAddressAvailableRegions getAvailableRegions() {
            return this.availableRegions;
        }

    }

    public static class DescribeEipAddressesResponseEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        @Validation(required = true)
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> eipAddress;

        public static DescribeEipAddressesResponseEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddresses self = new DescribeEipAddressesResponseEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseEipAddresses setEipAddress(java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
