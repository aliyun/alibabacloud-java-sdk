// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnTagResourcesResponseBody body;

    public static UnTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesResponse self = new UnTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnTagResourcesResponse setBody(UnTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnTagResourcesResponseBody getBody() {
        return this.body;
    }

}
