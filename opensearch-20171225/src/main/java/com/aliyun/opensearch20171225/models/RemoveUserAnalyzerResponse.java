// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveUserAnalyzerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveUserAnalyzerResponseBody body;

    public static RemoveUserAnalyzerResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserAnalyzerResponse self = new RemoveUserAnalyzerResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserAnalyzerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserAnalyzerResponse setBody(RemoveUserAnalyzerResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserAnalyzerResponseBody getBody() {
        return this.body;
    }

}
