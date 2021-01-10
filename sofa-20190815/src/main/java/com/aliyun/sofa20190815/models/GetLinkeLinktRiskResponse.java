// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktRiskResponseBody body;

    public static GetLinkeLinktRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktRiskResponse self = new GetLinkeLinktRiskResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktRiskResponse setBody(GetLinkeLinktRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktRiskResponseBody getBody() {
        return this.body;
    }

}
