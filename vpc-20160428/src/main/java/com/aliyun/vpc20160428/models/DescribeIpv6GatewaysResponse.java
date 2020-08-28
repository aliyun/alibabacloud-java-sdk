// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewaysResponse extends TeaModel {
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

    @NameInMap("Ipv6Gateways")
    @Validation(required = true)
    public DescribeIpv6GatewaysResponseIpv6Gateways ipv6Gateways;

    public static DescribeIpv6GatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewaysResponse self = new DescribeIpv6GatewaysResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Ipv6GatewayId")
        @Validation(required = true)
        public String ipv6GatewayId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway self = new DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeIpv6GatewaysResponseIpv6Gateways extends TeaModel {
        @NameInMap("Ipv6Gateway")
        @Validation(required = true)
        public java.util.List<DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway> ipv6Gateway;

        public static DescribeIpv6GatewaysResponseIpv6Gateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseIpv6Gateways self = new DescribeIpv6GatewaysResponseIpv6Gateways();
            return TeaModel.build(map, self);
        }

    }

}
