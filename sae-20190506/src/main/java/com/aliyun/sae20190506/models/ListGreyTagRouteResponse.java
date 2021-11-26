// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListGreyTagRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGreyTagRouteResponseBody body;

    public static ListGreyTagRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGreyTagRouteResponse self = new ListGreyTagRouteResponse();
        return TeaModel.build(map, self);
    }

    public ListGreyTagRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGreyTagRouteResponse setBody(ListGreyTagRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGreyTagRouteResponseBody getBody() {
        return this.body;
    }

}
