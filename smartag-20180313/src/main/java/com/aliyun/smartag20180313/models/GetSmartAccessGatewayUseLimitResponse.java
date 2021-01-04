// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetSmartAccessGatewayUseLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSmartAccessGatewayUseLimitResponseBody body;

    public static GetSmartAccessGatewayUseLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmartAccessGatewayUseLimitResponse self = new GetSmartAccessGatewayUseLimitResponse();
        return TeaModel.build(map, self);
    }

    public GetSmartAccessGatewayUseLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmartAccessGatewayUseLimitResponse setBody(GetSmartAccessGatewayUseLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmartAccessGatewayUseLimitResponseBody getBody() {
        return this.body;
    }

}
