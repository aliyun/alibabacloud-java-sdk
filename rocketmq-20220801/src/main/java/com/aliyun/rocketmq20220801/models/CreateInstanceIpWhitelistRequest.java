// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceIpWhitelistRequest extends TeaModel {
    /**
     * <p>The IP address whitelists.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ipWhitelists")
    public java.util.List<String> ipWhitelists;

    public static CreateInstanceIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceIpWhitelistRequest self = new CreateInstanceIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceIpWhitelistRequest setIpWhitelists(java.util.List<String> ipWhitelists) {
        this.ipWhitelists = ipWhitelists;
        return this;
    }
    public java.util.List<String> getIpWhitelists() {
        return this.ipWhitelists;
    }

}
