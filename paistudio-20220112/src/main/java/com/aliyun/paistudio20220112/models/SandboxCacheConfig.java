// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SandboxCacheConfig extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    public static SandboxCacheConfig build(java.util.Map<String, ?> map) throws Exception {
        SandboxCacheConfig self = new SandboxCacheConfig();
        return TeaModel.build(map, self);
    }

    public SandboxCacheConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
