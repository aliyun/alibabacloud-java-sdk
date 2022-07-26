// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class MockGetOrderFreeFlowProductStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MockGetOrderFreeFlowProductStatusResponseBody body;

    public static MockGetOrderFreeFlowProductStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        MockGetOrderFreeFlowProductStatusResponse self = new MockGetOrderFreeFlowProductStatusResponse();
        return TeaModel.build(map, self);
    }

    public MockGetOrderFreeFlowProductStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MockGetOrderFreeFlowProductStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MockGetOrderFreeFlowProductStatusResponse setBody(MockGetOrderFreeFlowProductStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public MockGetOrderFreeFlowProductStatusResponseBody getBody() {
        return this.body;
    }

}
