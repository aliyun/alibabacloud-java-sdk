// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationTrafficConfigRequest extends TeaModel {
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
    public UpdateWebApplicationTrafficConfigInput body;

    public static UpdateWebApplicationTrafficConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationTrafficConfigRequest self = new UpdateWebApplicationTrafficConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationTrafficConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateWebApplicationTrafficConfigRequest setBody(UpdateWebApplicationTrafficConfigInput body) {
        this.body = body;
        return this;
    }
    public UpdateWebApplicationTrafficConfigInput getBody() {
        return this.body;
    }

}
