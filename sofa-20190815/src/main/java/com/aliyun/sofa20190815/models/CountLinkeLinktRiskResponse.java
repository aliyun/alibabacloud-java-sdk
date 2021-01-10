// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeLinktRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountLinkeLinktRiskResponseBody body;

    public static CountLinkeLinktRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeLinktRiskResponse self = new CountLinkeLinktRiskResponse();
        return TeaModel.build(map, self);
    }

    public CountLinkeLinktRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountLinkeLinktRiskResponse setBody(CountLinkeLinktRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public CountLinkeLinktRiskResponseBody getBody() {
        return this.body;
    }

}
