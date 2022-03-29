// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioGatewayRoutesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIstioGatewayRoutesResponseBody body;

    public static UpdateIstioGatewayRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioGatewayRoutesResponse self = new UpdateIstioGatewayRoutesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIstioGatewayRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIstioGatewayRoutesResponse setBody(UpdateIstioGatewayRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIstioGatewayRoutesResponseBody getBody() {
        return this.body;
    }

}
