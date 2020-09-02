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

    public DownloadVpnConnectionConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DownloadVpnConnectionConfigRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

}
