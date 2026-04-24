// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyWhitelistIpsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1,192.168.1.0/24</p>
     */
    @NameInMap("IpWhitelist")
    public String ipWhitelist;

    public static ModifyWhitelistIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhitelistIpsRequest self = new ModifyWhitelistIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWhitelistIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyWhitelistIpsRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

}
