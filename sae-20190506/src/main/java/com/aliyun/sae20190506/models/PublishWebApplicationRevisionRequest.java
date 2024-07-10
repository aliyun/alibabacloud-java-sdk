// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PublishWebApplicationRevisionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PublishWebApplicationRevisionInput body;

    public static PublishWebApplicationRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishWebApplicationRevisionRequest self = new PublishWebApplicationRevisionRequest();
        return TeaModel.build(map, self);
    }

    public PublishWebApplicationRevisionRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public PublishWebApplicationRevisionRequest setBody(PublishWebApplicationRevisionInput body) {
        this.body = body;
        return this;
    }
    public PublishWebApplicationRevisionInput getBody() {
        return this.body;
    }

}
