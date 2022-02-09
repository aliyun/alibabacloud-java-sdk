// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UnTagResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnTagResourceResponseBody body;

    public static UnTagResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourceResponse self = new UnTagResourceResponse();
        return TeaModel.build(map, self);
    }

    public UnTagResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnTagResourceResponse setBody(UnTagResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnTagResourceResponseBody getBody() {
        return this.body;
    }

}
