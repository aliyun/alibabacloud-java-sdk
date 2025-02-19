// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceIpWhitelistShrinkRequest extends TeaModel {
    /**
     * <p>The IP address whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("ipWhitelist")
    @Deprecated
    public String ipWhitelist;

    @NameInMap("ipWhitelists")
    public String ipWhitelistsShrink;

    public static DeleteInstanceIpWhitelistShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceIpWhitelistShrinkRequest self = new DeleteInstanceIpWhitelistShrinkRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DeleteInstanceIpWhitelistShrinkRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public DeleteInstanceIpWhitelistShrinkRequest setIpWhitelistsShrink(String ipWhitelistsShrink) {
        this.ipWhitelistsShrink = ipWhitelistsShrink;
        return this;
    }
    public String getIpWhitelistsShrink() {
        return this.ipWhitelistsShrink;
    }

}
