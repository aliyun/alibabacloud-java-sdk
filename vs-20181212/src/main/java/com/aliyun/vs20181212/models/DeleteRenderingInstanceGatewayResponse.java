// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRenderingInstanceGatewayResponseBody body;

    public static DeleteRenderingInstanceGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceGatewayResponse self = new DeleteRenderingInstanceGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRenderingInstanceGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRenderingInstanceGatewayResponse setBody(DeleteRenderingInstanceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRenderingInstanceGatewayResponseBody getBody() {
        return this.body;
    }

}
