// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceRequest extends TeaModel {
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    @NameInMap("NamespaceDescription")
    public String namespaceDescription;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("NamespaceName")
    public String namespaceName;

    public static UpdateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceRequest self = new UpdateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    public UpdateNamespaceRequest setNamespaceDescription(String namespaceDescription) {
        this.namespaceDescription = namespaceDescription;
        return this;
    }
    public String getNamespaceDescription() {
        return this.namespaceDescription;
    }

    public UpdateNamespaceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
