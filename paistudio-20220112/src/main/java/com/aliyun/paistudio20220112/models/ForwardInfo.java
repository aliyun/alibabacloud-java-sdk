// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ForwardInfo extends TeaModel {
    @NameInMap("EipAllocationId")
    public String eipAllocationId;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static ForwardInfo build(java.util.Map<String, ?> map) throws Exception {
        ForwardInfo self = new ForwardInfo();
        return TeaModel.build(map, self);
    }

    public ForwardInfo setEipAllocationId(String eipAllocationId) {
        this.eipAllocationId = eipAllocationId;
        return this;
    }
    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    public ForwardInfo setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
