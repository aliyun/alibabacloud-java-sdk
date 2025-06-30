// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class EniCacheConfig extends TeaModel {
    @NameInMap("CachePoolSize")
    public Integer cachePoolSize;

    @NameInMap("Enabled")
    public Boolean enabled;

    public static EniCacheConfig build(java.util.Map<String, ?> map) throws Exception {
        EniCacheConfig self = new EniCacheConfig();
        return TeaModel.build(map, self);
    }

    public EniCacheConfig setCachePoolSize(Integer cachePoolSize) {
        this.cachePoolSize = cachePoolSize;
        return this;
    }
    public Integer getCachePoolSize() {
        return this.cachePoolSize;
    }

    public EniCacheConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
