// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapQuery extends TeaModel {
    @NameInMap("ConfigMapId")
    @Validation(required = true)
    public Long configMapId;

    public static UpdateConfigMapQuery build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigMapQuery self = new UpdateConfigMapQuery();
        return TeaModel.build(map, self);
    }

    public UpdateConfigMapQuery setConfigMapId(Long configMapId) {
        this.configMapId = configMapId;
        return this;
    }
    public Long getConfigMapId() {
        return this.configMapId;
    }

}
