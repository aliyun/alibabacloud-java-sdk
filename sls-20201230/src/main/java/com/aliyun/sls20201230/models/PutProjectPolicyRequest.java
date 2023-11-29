// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutProjectPolicyRequest extends TeaModel {
    /**
     * <p>The project policy.</p>
     */
    @NameInMap("body")
    public String body;

    public static PutProjectPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProjectPolicyRequest self = new PutProjectPolicyRequest();
        return TeaModel.build(map, self);
    }

    public PutProjectPolicyRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
