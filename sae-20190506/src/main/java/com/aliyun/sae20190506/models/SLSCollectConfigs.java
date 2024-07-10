// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SLSCollectConfigs extends TeaModel {
    @NameInMap("CollectConfigs")
    public java.util.List<SLSCollectConfig> collectConfigs;

    public static SLSCollectConfigs build(java.util.Map<String, ?> map) throws Exception {
        SLSCollectConfigs self = new SLSCollectConfigs();
        return TeaModel.build(map, self);
    }

    public SLSCollectConfigs setCollectConfigs(java.util.List<SLSCollectConfig> collectConfigs) {
        this.collectConfigs = collectConfigs;
        return this;
    }
    public java.util.List<SLSCollectConfig> getCollectConfigs() {
        return this.collectConfigs;
    }

}
