// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210831_223006136.models;

import com.aliyun.tea.*;

public class TestAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestAssetResponseBody body;

    public static TestAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAssetResponse self = new TestAssetResponse();
        return TeaModel.build(map, self);
    }

    public TestAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestAssetResponse setBody(TestAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public TestAssetResponseBody getBody() {
        return this.body;
    }

}
