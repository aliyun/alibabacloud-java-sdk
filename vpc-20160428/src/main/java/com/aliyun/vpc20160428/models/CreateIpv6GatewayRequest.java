// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6GatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateIpv6GatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6GatewayRequest self = new CreateIpv6GatewayRequest();
        return TeaModel.build(map, self);
    }

}
