// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    @NameInMap("NamespaceName")
    @Validation(required = true)
    public String namespaceName;

    @NameInMap("NamespaceDescription")
    public String namespaceDescription;

    public static UpdateNamespaceQuery build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceQuery self = new UpdateNamespaceQuery();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceQuery setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public UpdateNamespaceQuery setNamespaceDescription(String namespaceDescription) {
        this.namespaceDescription = namespaceDescription;
        return this;
    }
    public String getNamespaceDescription() {
        return this.namespaceDescription;
    }

}
