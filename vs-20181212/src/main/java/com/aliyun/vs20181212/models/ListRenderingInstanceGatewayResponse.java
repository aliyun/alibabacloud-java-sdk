// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstanceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRenderingInstanceGatewayResponseBody body;

    public static ListRenderingInstanceGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingInstanceGatewayResponse self = new ListRenderingInstanceGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ListRenderingInstanceGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRenderingInstanceGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRenderingInstanceGatewayResponse setBody(ListRenderingInstanceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRenderingInstanceGatewayResponseBody getBody() {
        return this.body;
    }

}
