// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirtualBorderRouterResponseBody body;

    public static DeleteVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualBorderRouterResponse self = new DeleteVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualBorderRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirtualBorderRouterResponse setBody(DeleteVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
