// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSKubernetesResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSKubernetesResourceResponseBody body;

    public static GetAKSKubernetesResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSKubernetesResourceResponse self = new GetAKSKubernetesResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSKubernetesResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSKubernetesResourceResponse setBody(GetAKSKubernetesResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSKubernetesResourceResponseBody getBody() {
        return this.body;
    }

}
