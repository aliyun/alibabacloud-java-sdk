// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebCustomDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateWebCustomDomainInput body;

    public static UpdateWebCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebCustomDomainRequest self = new UpdateWebCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebCustomDomainRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateWebCustomDomainRequest setBody(UpdateWebCustomDomainInput body) {
        this.body = body;
        return this;
    }
    public UpdateWebCustomDomainInput getBody() {
        return this.body;
    }

}
