// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    @NameInMap("VpcName")
    public String vpcName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("UserCidr")
    public String userCidr;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcRequest self = new CreateVpcRequest();
        return TeaModel.build(map, self);
    }

}
