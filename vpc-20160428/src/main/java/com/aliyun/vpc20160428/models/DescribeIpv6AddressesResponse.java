// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesResponse extends TeaModel {
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

    @NameInMap("Ipv6Addresses")
    @Validation(required = true)
    public DescribeIpv6AddressesResponseIpv6Addresses ipv6Addresses;

    public static DescribeIpv6AddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6AddressesResponse self = new DescribeIpv6AddressesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth extends TeaModel {
        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("Ipv6InternetBandwidthId")
        @Validation(required = true)
        public String ipv6InternetBandwidthId;

        public static DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth self = new DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeIpv6AddressesResponseIpv6AddressesIpv6Address extends TeaModel {
        @NameInMap("Ipv6AddressId")
        @Validation(required = true)
        public String ipv6AddressId;

        @NameInMap("Ipv6AddressName")
        @Validation(required = true)
        public String ipv6AddressName;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Ipv6GatewayId")
        @Validation(required = true)
        public String ipv6GatewayId;

        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public String ipv6Address;

        @NameInMap("AssociatedInstanceId")
        @Validation(required = true)
        public String associatedInstanceId;

        @NameInMap("AssociatedInstanceType")
        @Validation(required = true)
        public String associatedInstanceType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("RealBandwidth")
        @Validation(required = true)
        public Integer realBandwidth;

        @NameInMap("AllocationTime")
        @Validation(required = true)
        public String allocationTime;

        @NameInMap("Ipv6InternetBandwidth")
        @Validation(required = true)
        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth ipv6InternetBandwidth;

        public static DescribeIpv6AddressesResponseIpv6AddressesIpv6Address build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseIpv6AddressesIpv6Address self = new DescribeIpv6AddressesResponseIpv6AddressesIpv6Address();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeIpv6AddressesResponseIpv6Addresses extends TeaModel {
        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public java.util.List<DescribeIpv6AddressesResponseIpv6AddressesIpv6Address> ipv6Address;

        public static DescribeIpv6AddressesResponseIpv6Addresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseIpv6Addresses self = new DescribeIpv6AddressesResponseIpv6Addresses();
            return TeaModel.build(map, self);
        }

    }

}
