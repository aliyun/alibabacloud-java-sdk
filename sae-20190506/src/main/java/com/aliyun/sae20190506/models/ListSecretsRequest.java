// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSecretsRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ListSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsRequest self = new ListSecretsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecretsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
