// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationRequest extends TeaModel {
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
    public UpdateWebApplicationInput body;

    public static UpdateWebApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationRequest self = new UpdateWebApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateWebApplicationRequest setBody(UpdateWebApplicationInput body) {
        this.body = body;
        return this;
    }
    public UpdateWebApplicationInput getBody() {
        return this.body;
    }

}
