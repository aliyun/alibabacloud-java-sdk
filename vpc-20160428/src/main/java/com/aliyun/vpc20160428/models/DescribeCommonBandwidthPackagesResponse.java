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

    }

    public static class DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddresse")
        @Validation(required = true)
        public java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse;

        public static DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses self = new DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackagePublicIpAddresses();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages extends TeaModel {
        @NameInMap("CommonBandwidthPackage")
        @Validation(required = true)
        public java.util.List<DescribeCommonBandwidthPackagesResponseCommonBandwidthPackagesCommonBandwidthPackage> commonBandwidthPackage;

        public static DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages self = new DescribeCommonBandwidthPackagesResponseCommonBandwidthPackages();
            return TeaModel.build(map, self);
        }

    }

}
