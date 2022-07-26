// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class MockOrderFreeFlowProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MockOrderFreeFlowProductResponseBody body;

    public static MockOrderFreeFlowProductResponse build(java.util.Map<String, ?> map) throws Exception {
        MockOrderFreeFlowProductResponse self = new MockOrderFreeFlowProductResponse();
        return TeaModel.build(map, self);
    }

    public MockOrderFreeFlowProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MockOrderFreeFlowProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MockOrderFreeFlowProductResponse setBody(MockOrderFreeFlowProductResponseBody body) {
        this.body = body;
        return this;
    }
    public MockOrderFreeFlowProductResponseBody getBody() {
        return this.body;
    }

}
