// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class BindESUserAnalyzerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindESUserAnalyzerResponseBody body;

    public static BindESUserAnalyzerResponse build(java.util.Map<String, ?> map) throws Exception {
        BindESUserAnalyzerResponse self = new BindESUserAnalyzerResponse();
        return TeaModel.build(map, self);
    }

    public BindESUserAnalyzerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindESUserAnalyzerResponse setBody(BindESUserAnalyzerResponseBody body) {
        this.body = body;
        return this;
    }
    public BindESUserAnalyzerResponseBody getBody() {
        return this.body;
    }

}
