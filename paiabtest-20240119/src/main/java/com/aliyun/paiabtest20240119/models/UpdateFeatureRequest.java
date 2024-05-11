// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateFeatureRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureRequest self = new UpdateFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
