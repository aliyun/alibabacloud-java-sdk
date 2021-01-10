// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class StartSlowQueryAnalyzerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartSlowQueryAnalyzerResponseBody body;

    public static StartSlowQueryAnalyzerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSlowQueryAnalyzerResponse self = new StartSlowQueryAnalyzerResponse();
        return TeaModel.build(map, self);
    }

    public StartSlowQueryAnalyzerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSlowQueryAnalyzerResponse setBody(StartSlowQueryAnalyzerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSlowQueryAnalyzerResponseBody getBody() {
        return this.body;
    }

}
