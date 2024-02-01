// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteTableResponseBody body;

    public static DeleteRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteTableResponse self = new DeleteRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteTableResponse setBody(DeleteRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteTableResponseBody getBody() {
        return this.body;
    }

}
