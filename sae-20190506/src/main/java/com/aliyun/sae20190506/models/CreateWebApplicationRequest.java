// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateWebApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateWebApplicationInput body;

    public static CreateWebApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebApplicationRequest self = new CreateWebApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebApplicationRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateWebApplicationRequest setBody(CreateWebApplicationInput body) {
        this.body = body;
        return this;
    }
    public CreateWebApplicationInput getBody() {
        return this.body;
    }

}
