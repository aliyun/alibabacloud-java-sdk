// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EipAddresses")
    public DescribeEipAddressesResponseBodyEipAddresses eipAddresses;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponseBody self = new DescribeEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason extends TeaModel {
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

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions extends TeaModel {
        @NameInMap("AvailableRegion")
        public java.util.List<String> availableRegion;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions setAvailableRegion(java.util.List<String> availableRegion) {
            this.availableRegion = availableRegion;
            return this;
        }
        public java.util.List<String> getAvailableRegion() {
            return this.availableRegion;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddress extends TeaModel {
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("AllocationTime")
        public String allocationTime;

        @NameInMap("OperationLocks")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks operationLocks;

        @NameInMap("Netmode")
        public String netmode;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Descritpion")
        public String descritpion;

        @NameInMap("SegmentInstanceId")
        public String segmentInstanceId;

        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        @NameInMap("EipBandwidth")
        public String eipBandwidth;

        @NameInMap("AvailableRegions")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions availableRegions;

        @NameInMap("Name")
        public String name;

        @NameInMap("InstanceRegionId")
        public String instanceRegionId;

        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SecondLimited")
        public Boolean secondLimited;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("HDMonitorStatus")
        public String HDMonitorStatus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("BandwidthPackageBandwidth")
        public String bandwidthPackageBandwidth;

        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("BandwidthPackageType")
        public String bandwidthPackageType;

        @NameInMap("HasReservationData")
        public String hasReservationData;

        @NameInMap("ISP")
        public String ISP;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddress self = new DescribeEipAddressesResponseBodyEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setOperationLocks(DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setNetmode(String netmode) {
            this.netmode = netmode;
            return this;
        }
        public String getNetmode() {
            return this.netmode;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setDescritpion(String descritpion) {
            this.descritpion = descritpion;
            return this;
        }
        public String getDescritpion() {
            return this.descritpion;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setSegmentInstanceId(String segmentInstanceId) {
            this.segmentInstanceId = segmentInstanceId;
            return this;
        }
        public String getSegmentInstanceId() {
            return this.segmentInstanceId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setEipBandwidth(String eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public String getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setAvailableRegions(DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions availableRegions) {
            this.availableRegions = availableRegions;
            return this;
        }
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressAvailableRegions getAvailableRegions() {
            return this.availableRegions;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceRegionId(String instanceRegionId) {
            this.instanceRegionId = instanceRegionId;
            return this;
        }
        public String getInstanceRegionId() {
            return this.instanceRegionId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setSecondLimited(Boolean secondLimited) {
            this.secondLimited = secondLimited;
            return this;
        }
        public Boolean getSecondLimited() {
            return this.secondLimited;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setHDMonitorStatus(String HDMonitorStatus) {
            this.HDMonitorStatus = HDMonitorStatus;
            return this;
        }
        public String getHDMonitorStatus() {
            return this.HDMonitorStatus;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
            this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
            return this;
        }
        public String getBandwidthPackageBandwidth() {
            return this.bandwidthPackageBandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setServiceManaged(Integer serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Integer getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidthPackageType(String bandwidthPackageType) {
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
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
