// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class OnsAddInstanceTunnelTagRequest extends TeaModel {
    @NameInMap("PreventCache")
    public Long preventCache;

    @NameInMap("TunnelId")
    public String tunnelId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsAddInstanceTunnelTagRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsAddInstanceTunnelTagRequest self = new OnsAddInstanceTunnelTagRequest();
        return TeaModel.build(map, self);
    }

    public OnsAddInstanceTunnelTagRequest setPreventCache(Long preventCache) {
        this.preventCache = preventCache;
        return this;
    }
    public Long getPreventCache() {
        return this.preventCache;
    }

    public OnsAddInstanceTunnelTagRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public OnsAddInstanceTunnelTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
