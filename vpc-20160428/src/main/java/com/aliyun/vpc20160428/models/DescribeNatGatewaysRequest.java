// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Name")
    public String name;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("NatType")
    public String natType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DescribeNatGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysRequest self = new DescribeNatGatewaysRequest();
        return TeaModel.build(map, self);
    }

}
