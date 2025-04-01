// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteConfigMapRequest extends TeaModel {
    /**
     * <p>The ID of the ConfigMap that you want to delete. You can call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the ID of a ConfigMap.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigMapId")
    public Long configMapId;

    public static DeleteConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigMapRequest self = new DeleteConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigMapRequest setConfigMapId(Long configMapId) {
        this.configMapId = configMapId;
        return this;
    }
    public Long getConfigMapId() {
        return this.configMapId;
    }

}
