// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateWebCustomDomainRequest extends TeaModel {
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
    public CreateWebCustomDomainInput body;

    public static CreateWebCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebCustomDomainRequest self = new CreateWebCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebCustomDomainRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateWebCustomDomainRequest setBody(CreateWebCustomDomainInput body) {
        this.body = body;
        return this;
    }
    public CreateWebCustomDomainInput getBody() {
        return this.body;
    }

}
