// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class OperateGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OperateGatewayResponseBody body;

    public static OperateGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateGatewayResponse self = new OperateGatewayResponse();
        return TeaModel.build(map, self);
    }

    public OperateGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateGatewayResponse setBody(OperateGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateGatewayResponseBody getBody() {
        return this.body;
    }

}
