// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ClearDynamicTagCacheRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cfg************405791744</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    public static ClearDynamicTagCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearDynamicTagCacheRequest self = new ClearDynamicTagCacheRequest();
        return TeaModel.build(map, self);
    }

    public ClearDynamicTagCacheRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

}
