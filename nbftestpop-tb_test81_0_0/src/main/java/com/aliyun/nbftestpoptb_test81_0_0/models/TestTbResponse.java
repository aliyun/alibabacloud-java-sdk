// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test81_0_0.models;

import com.aliyun.tea.*;

public class TestTbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestTbResponseBody body;

    public static TestTbResponse build(java.util.Map<String, ?> map) throws Exception {
        TestTbResponse self = new TestTbResponse();
        return TeaModel.build(map, self);
    }

    public TestTbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestTbResponse setBody(TestTbResponseBody body) {
        this.body = body;
        return this;
    }
    public TestTbResponseBody getBody() {
        return this.body;
    }

}
