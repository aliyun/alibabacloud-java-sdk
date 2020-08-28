// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    public String vpnConnectionId;

    public static DeleteVpnConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnConnectionRequest self = new DeleteVpnConnectionRequest();
        return TeaModel.build(map, self);
    }

}
