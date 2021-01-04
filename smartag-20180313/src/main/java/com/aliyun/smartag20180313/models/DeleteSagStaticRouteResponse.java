// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSagStaticRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSagStaticRouteResponseBody body;

    public static DeleteSagStaticRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSagStaticRouteResponse self = new DeleteSagStaticRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSagStaticRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSagStaticRouteResponse setBody(DeleteSagStaticRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSagStaticRouteResponseBody getBody() {
        return this.body;
    }

}
