// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteConfigMapQuery extends TeaModel {
    @NameInMap("ConfigMapId")
    @Validation(required = true)
    public Long configMapId;

    public static DeleteConfigMapQuery build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigMapQuery self = new DeleteConfigMapQuery();
        return TeaModel.build(map, self);
    }

    public DeleteConfigMapQuery setConfigMapId(Long configMapId) {
        this.configMapId = configMapId;
        return this;
    }
    public Long getConfigMapId() {
        return this.configMapId;
    }

}
