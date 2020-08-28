// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewayAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("BusinessStatus")
    @Validation(required = true)
    public String businessStatus;

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

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    public static DescribeIpv6GatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewayAttributeResponse self = new DescribeIpv6GatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

}
