// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class OversoldUsageConfig extends TeaModel {
    @NameInMap("Disabled")
    public Boolean disabled;

    @NameInMap("DisabledBy")
    public String disabledBy;

    public static OversoldUsageConfig build(java.util.Map<String, ?> map) throws Exception {
        OversoldUsageConfig self = new OversoldUsageConfig();
        return TeaModel.build(map, self);
    }

    public OversoldUsageConfig setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public OversoldUsageConfig setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy;
        return this;
    }
    public String getDisabledBy() {
        return this.disabledBy;
    }

}
