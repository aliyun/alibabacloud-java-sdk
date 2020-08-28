// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewaySpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyNatGatewaySpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewaySpecRequest self = new ModifyNatGatewaySpecRequest();
        return TeaModel.build(map, self);
    }

}
