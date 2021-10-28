// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class OperateGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public OperateGatewayResponse setBody(OperateGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateGatewayResponseBody getBody() {
        return this.body;
    }

}
