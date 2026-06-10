// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertEnabledRequest extends TeaModel {
    /**
     * <p>Indicates whether the alert policy is enabled</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>Alert policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    public static UpdateAlertEnabledRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertEnabledRequest self = new UpdateAlertEnabledRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertEnabledRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateAlertEnabledRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
