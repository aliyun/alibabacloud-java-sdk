// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteNamespaceQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    public static DeleteNamespaceQuery build(java.util.Map<String, ?> map) throws Exception {
        DeleteNamespaceQuery self = new DeleteNamespaceQuery();
        return TeaModel.build(map, self);
    }

    public DeleteNamespaceQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
