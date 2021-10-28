// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UpgradeGatewayRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    public static UpgradeGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeGatewayRequest self = new UpgradeGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
