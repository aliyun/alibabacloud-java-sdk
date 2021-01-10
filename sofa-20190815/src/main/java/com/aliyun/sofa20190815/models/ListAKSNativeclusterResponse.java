// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSNativeclusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSNativeclusterResponseBody body;

    public static ListAKSNativeclusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSNativeclusterResponse self = new ListAKSNativeclusterResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSNativeclusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSNativeclusterResponse setBody(ListAKSNativeclusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSNativeclusterResponseBody getBody() {
        return this.body;
    }

}
