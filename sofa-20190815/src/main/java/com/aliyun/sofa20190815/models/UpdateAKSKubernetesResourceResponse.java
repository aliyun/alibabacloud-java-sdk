// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSKubernetesResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSKubernetesResourceResponseBody body;

    public static UpdateAKSKubernetesResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSKubernetesResourceResponse self = new UpdateAKSKubernetesResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSKubernetesResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSKubernetesResourceResponse setBody(UpdateAKSKubernetesResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSKubernetesResourceResponseBody getBody() {
        return this.body;
    }

}
