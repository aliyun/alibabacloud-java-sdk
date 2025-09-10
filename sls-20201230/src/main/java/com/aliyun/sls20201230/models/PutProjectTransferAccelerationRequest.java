// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutProjectTransferAccelerationRequest extends TeaModel {
    /**
     * <p>Whether to enable transfer acceleration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    public static PutProjectTransferAccelerationRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProjectTransferAccelerationRequest self = new PutProjectTransferAccelerationRequest();
        return TeaModel.build(map, self);
    }

    public PutProjectTransferAccelerationRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
