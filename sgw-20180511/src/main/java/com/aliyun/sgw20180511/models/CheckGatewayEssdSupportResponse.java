// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckGatewayEssdSupportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckGatewayEssdSupportResponseBody body;

    public static CheckGatewayEssdSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckGatewayEssdSupportResponse self = new CheckGatewayEssdSupportResponse();
        return TeaModel.build(map, self);
    }

    public CheckGatewayEssdSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckGatewayEssdSupportResponse setBody(CheckGatewayEssdSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckGatewayEssdSupportResponseBody getBody() {
        return this.body;
    }

}
