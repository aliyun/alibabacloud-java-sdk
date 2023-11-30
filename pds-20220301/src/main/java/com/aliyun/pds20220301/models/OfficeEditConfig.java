// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class OfficeEditConfig extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    public static OfficeEditConfig build(java.util.Map<String, ?> map) throws Exception {
        OfficeEditConfig self = new OfficeEditConfig();
        return TeaModel.build(map, self);
    }

    public OfficeEditConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
