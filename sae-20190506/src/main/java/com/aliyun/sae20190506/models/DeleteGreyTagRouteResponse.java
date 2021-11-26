// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteGreyTagRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGreyTagRouteResponseBody body;

    public static DeleteGreyTagRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGreyTagRouteResponse self = new DeleteGreyTagRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGreyTagRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGreyTagRouteResponse setBody(DeleteGreyTagRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGreyTagRouteResponseBody getBody() {
        return this.body;
    }

}
