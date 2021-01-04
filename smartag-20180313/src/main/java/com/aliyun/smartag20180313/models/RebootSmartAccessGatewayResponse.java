// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RebootSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootSmartAccessGatewayResponseBody body;

    public static RebootSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootSmartAccessGatewayResponse self = new RebootSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public RebootSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootSmartAccessGatewayResponse setBody(RebootSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
