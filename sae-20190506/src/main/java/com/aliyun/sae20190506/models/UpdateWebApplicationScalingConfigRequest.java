// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationScalingConfigRequest extends TeaModel {
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
    public UpdateWebApplicationScalingConfigInput body;

    public static UpdateWebApplicationScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationScalingConfigRequest self = new UpdateWebApplicationScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationScalingConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateWebApplicationScalingConfigRequest setBody(UpdateWebApplicationScalingConfigInput body) {
        this.body = body;
        return this;
    }
    public UpdateWebApplicationScalingConfigInput getBody() {
        return this.body;
    }

}
