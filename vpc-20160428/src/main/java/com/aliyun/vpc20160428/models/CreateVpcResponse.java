// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("VRouterId")
    @Validation(required = true)
    public String VRouterId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    public static CreateVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcResponse self = new CreateVpcResponse();
        return TeaModel.build(map, self);
    }

}
