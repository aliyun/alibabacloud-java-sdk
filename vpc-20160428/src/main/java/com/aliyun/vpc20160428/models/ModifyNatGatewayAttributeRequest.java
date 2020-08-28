// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyNatGatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayAttributeRequest self = new ModifyNatGatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

}
