// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteWebCustomDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteWebCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCustomDomainRequest self = new DeleteWebCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebCustomDomainRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
