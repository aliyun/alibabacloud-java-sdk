// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceIpWhitelistRequest extends TeaModel {
    /**
     * <p>The IP address whitelist.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("ipWhitelist")
    public String ipWhitelist;

    public static DeleteInstanceIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceIpWhitelistRequest self = new DeleteInstanceIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceIpWhitelistRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

}
