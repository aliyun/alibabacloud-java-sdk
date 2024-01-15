// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SinkCmsConfiguration extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    public static SinkCmsConfiguration build(java.util.Map<String, ?> map) throws Exception {
        SinkCmsConfiguration self = new SinkCmsConfiguration();
        return TeaModel.build(map, self);
    }

    public SinkCmsConfiguration setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
