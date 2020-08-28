// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    public static DeleteVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnGatewayRequest self = new DeleteVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

}
