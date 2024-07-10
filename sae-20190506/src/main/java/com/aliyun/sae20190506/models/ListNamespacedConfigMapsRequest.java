// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsRequest extends TeaModel {
    /**
     * <p>cn-hangzhou</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ListNamespacedConfigMapsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacedConfigMapsRequest self = new ListNamespacedConfigMapsRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespacedConfigMapsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
