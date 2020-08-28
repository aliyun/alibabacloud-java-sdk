// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DownloadVpnConnectionConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    public String vpnConnectionId;

    public static DownloadVpnConnectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadVpnConnectionConfigRequest self = new DownloadVpnConnectionConfigRequest();
        return TeaModel.build(map, self);
    }

}
