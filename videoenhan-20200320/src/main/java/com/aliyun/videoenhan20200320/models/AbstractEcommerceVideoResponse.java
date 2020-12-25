// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbstractEcommerceVideoResponseBody body;

    public static AbstractEcommerceVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoResponse self = new AbstractEcommerceVideoResponse();
        return TeaModel.build(map, self);
    }

    public AbstractEcommerceVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbstractEcommerceVideoResponse setBody(AbstractEcommerceVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public AbstractEcommerceVideoResponseBody getBody() {
        return this.body;
    }

}
