// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class SingleComplexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SingleComplexResponseBody body;

    public static SingleComplexResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleComplexResponse self = new SingleComplexResponse();
        return TeaModel.build(map, self);
    }

    public SingleComplexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleComplexResponse setBody(SingleComplexResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleComplexResponseBody getBody() {
        return this.body;
    }

}
