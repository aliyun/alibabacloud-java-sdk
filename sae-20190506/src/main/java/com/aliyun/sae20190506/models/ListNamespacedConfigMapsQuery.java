// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    public static ListNamespacedConfigMapsQuery build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacedConfigMapsQuery self = new ListNamespacedConfigMapsQuery();
        return TeaModel.build(map, self);
    }

    public ListNamespacedConfigMapsQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
