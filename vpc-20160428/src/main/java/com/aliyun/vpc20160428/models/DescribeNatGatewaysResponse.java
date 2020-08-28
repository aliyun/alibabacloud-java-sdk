// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponse extends TeaModel {
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

    @NameInMap("NatGateways")
    @Validation(required = true)
    public DescribeNatGatewaysResponseNatGateways natGateways;

    public static DescribeNatGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponse self = new DescribeNatGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList extends TeaModel {
        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("UsingStatus")
        @Validation(required = true)
        public String usingStatus;

        @NameInMap("ApAccessEnabled")
        @Validation(required = true)
        public Boolean apAccessEnabled;

        @NameInMap("SnatEntryEnabled")
        @Validation(required = true)
        public Boolean snatEntryEnabled;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists extends TeaModel {
        @NameInMap("IpList")
        @Validation(required = true)
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGatewayIpListsIpList> ipList;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo extends TeaModel {
        @NameInMap("EniInstanceId")
        @Validation(required = true)
        public String eniInstanceId;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("VswitchId")
        @Validation(required = true)
        public String vswitchId;

        @NameInMap("IzNo")
        @Validation(required = true)
        public String izNo;

        @NameInMap("MaxBandwidth")
        @Validation(required = true)
        public Integer maxBandwidth;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds extends TeaModel {
        // ForwardTableId
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public java.util.List<String> forwardTableId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds extends TeaModel {
        // SnatTableId
        @NameInMap("SnatTableId")
        @Validation(required = true)
        public java.util.List<String> snatTableId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds extends TeaModel {
        // BandwidthPackageId
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public java.util.List<String> bandwidthPackageId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGateway extends TeaModel {
        @NameInMap("NatGatewayId")
        @Validation(required = true)
        public String natGatewayId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("AutoPay")
        @Validation(required = true)
        public Boolean autoPay;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("NatType")
        @Validation(required = true)
        public String natType;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("DeletionProtection")
        @Validation(required = true)
        public Boolean deletionProtection;

        @NameInMap("EcsMetricEnabled")
        @Validation(required = true)
        public Boolean ecsMetricEnabled;

        @NameInMap("IpLists")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayIpLists ipLists;

        @NameInMap("NatGatewayPrivateInfo")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayNatGatewayPrivateInfo natGatewayPrivateInfo;

        @NameInMap("ForwardTableIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds forwardTableIds;

        @NameInMap("SnatTableIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewaySnatTableIds snatTableIds;

        @NameInMap("BandwidthPackageIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds;

        public static DescribeNatGatewaysResponseNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGateway self = new DescribeNatGatewaysResponseNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGateways extends TeaModel {
        @NameInMap("NatGateway")
        @Validation(required = true)
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> natGateway;

        public static DescribeNatGatewaysResponseNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGateways self = new DescribeNatGatewaysResponseNatGateways();
            return TeaModel.build(map, self);
        }

    }

}
