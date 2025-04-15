// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceIpWhitelistRequest extends TeaModel {
    /**
     * <p>The IP address whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("ipWhitelist")
    @Deprecated
    public String ipWhitelist;

    /**
     * <p>The IP address whitelist.</p>
     */
    @NameInMap("ipWhitelists")
    public java.util.List<String> ipWhitelists;

    public static DeleteInstanceIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceIpWhitelistRequest self = new DeleteInstanceIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DeleteInstanceIpWhitelistRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public DeleteInstanceIpWhitelistRequest setIpWhitelists(java.util.List<String> ipWhitelists) {
        this.ipWhitelists = ipWhitelists;
        return this;
    }
    public java.util.List<String> getIpWhitelists() {
        return this.ipWhitelists;
    }

}
