// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CompileSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompileSortScriptResponseBody body;

    public static CompileSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        CompileSortScriptResponse self = new CompileSortScriptResponse();
        return TeaModel.build(map, self);
    }

    public CompileSortScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompileSortScriptResponse setBody(CompileSortScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public CompileSortScriptResponseBody getBody() {
        return this.body;
    }

}
