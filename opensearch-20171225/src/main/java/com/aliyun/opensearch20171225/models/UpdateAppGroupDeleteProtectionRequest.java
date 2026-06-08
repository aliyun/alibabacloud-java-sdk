// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateAppGroupDeleteProtectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;deleteProtection&quot;: &quot;on&quot;
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static UpdateAppGroupDeleteProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppGroupDeleteProtectionRequest self = new UpdateAppGroupDeleteProtectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppGroupDeleteProtectionRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
