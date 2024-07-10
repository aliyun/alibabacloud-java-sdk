// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteWebApplicationRevisionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteWebApplicationRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebApplicationRevisionRequest self = new DeleteWebApplicationRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebApplicationRevisionRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
