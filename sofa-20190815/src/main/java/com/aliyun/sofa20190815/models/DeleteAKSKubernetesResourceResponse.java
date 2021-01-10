// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSKubernetesResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSKubernetesResourceResponseBody body;

    public static DeleteAKSKubernetesResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSKubernetesResourceResponse self = new DeleteAKSKubernetesResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSKubernetesResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSKubernetesResourceResponse setBody(DeleteAKSKubernetesResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSKubernetesResourceResponseBody getBody() {
        return this.body;
    }

}
