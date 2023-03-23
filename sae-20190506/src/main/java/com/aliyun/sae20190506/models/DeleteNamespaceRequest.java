// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteNamespaceRequest extends TeaModel {
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNamespaceRequest self = new DeleteNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNamespaceRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    public DeleteNamespaceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
