// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class OnsRemoveInstanceTunnelTagRequest extends TeaModel {
    @NameInMap("PreventCache")
    public Long preventCache;

    @NameInMap("TunnelId")
    public String tunnelId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsRemoveInstanceTunnelTagRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsRemoveInstanceTunnelTagRequest self = new OnsRemoveInstanceTunnelTagRequest();
        return TeaModel.build(map, self);
    }

    public OnsRemoveInstanceTunnelTagRequest setPreventCache(Long preventCache) {
        this.preventCache = preventCache;
        return this;
    }
    public Long getPreventCache() {
        return this.preventCache;
    }

    public OnsRemoveInstanceTunnelTagRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public OnsRemoveInstanceTunnelTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
