// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhitelistRequest extends TeaModel {
    /**
     * <p>The  filter IP address whitelists.</p>
     */
    @NameInMap("ipWhitelists")
    public java.util.List<String> ipWhitelists;

    public static GetInstanceIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhitelistRequest self = new GetInstanceIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceIpWhitelistRequest setIpWhitelists(java.util.List<String> ipWhitelists) {
        this.ipWhitelists = ipWhitelists;
        return this;
    }
    public java.util.List<String> getIpWhitelists() {
        return this.ipWhitelists;
    }

}
