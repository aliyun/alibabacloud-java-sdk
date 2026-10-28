// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class EniCacheConfig extends TeaModel {
    /**
     * <p>The size of the cache pool.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CachePoolSize")
    public Integer cachePoolSize;

    /**
     * <p>Specifies whether it is enabled.</p>
     */
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
