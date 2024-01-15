// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SinkAlerthubConfiguration extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    public static SinkAlerthubConfiguration build(java.util.Map<String, ?> map) throws Exception {
        SinkAlerthubConfiguration self = new SinkAlerthubConfiguration();
        return TeaModel.build(map, self);
    }

    public SinkAlerthubConfiguration setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
