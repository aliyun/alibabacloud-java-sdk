// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhitelistShrinkRequest extends TeaModel {
    @NameInMap("ipWhitelists")
    public String ipWhitelistsShrink;

    public static GetInstanceIpWhitelistShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhitelistShrinkRequest self = new GetInstanceIpWhitelistShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceIpWhitelistShrinkRequest setIpWhitelistsShrink(String ipWhitelistsShrink) {
        this.ipWhitelistsShrink = ipWhitelistsShrink;
        return this;
    }
    public String getIpWhitelistsShrink() {
        return this.ipWhitelistsShrink;
    }

}
