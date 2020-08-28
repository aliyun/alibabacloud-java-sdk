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

    public static class DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason self = new DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeEipAddressesResponseEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        @Validation(required = true)
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> eipAddress;

        public static DescribeEipAddressesResponseEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddresses self = new DescribeEipAddressesResponseEipAddresses();
            return TeaModel.build(map, self);
        }

    }

}
