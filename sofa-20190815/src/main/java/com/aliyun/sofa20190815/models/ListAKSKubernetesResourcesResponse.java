// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSKubernetesResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSKubernetesResourcesResponseBody body;

    public static ListAKSKubernetesResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSKubernetesResourcesResponse self = new ListAKSKubernetesResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSKubernetesResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSKubernetesResourcesResponse setBody(ListAKSKubernetesResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSKubernetesResourcesResponseBody getBody() {
        return this.body;
    }

}
