// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test11_0_0.models;

import com.aliyun.tea.*;

public class TestApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestApiResponseBody body;

    public static TestApiResponse build(java.util.Map<String, ?> map) throws Exception {
        TestApiResponse self = new TestApiResponse();
        return TeaModel.build(map, self);
    }

    public TestApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestApiResponse setBody(TestApiResponseBody body) {
        this.body = body;
        return this;
    }
    public TestApiResponseBody getBody() {
        return this.body;
    }

}
