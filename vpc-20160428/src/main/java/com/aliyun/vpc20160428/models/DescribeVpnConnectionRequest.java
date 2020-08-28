// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    public String vpnConnectionId;

    public static DescribeVpnConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionRequest self = new DescribeVpnConnectionRequest();
        return TeaModel.build(map, self);
    }

}
