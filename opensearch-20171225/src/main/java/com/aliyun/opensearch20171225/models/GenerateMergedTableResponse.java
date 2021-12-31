// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GenerateMergedTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateMergedTableResponseBody body;

    public static GenerateMergedTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateMergedTableResponse self = new GenerateMergedTableResponse();
        return TeaModel.build(map, self);
    }

    public GenerateMergedTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateMergedTableResponse setBody(GenerateMergedTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateMergedTableResponseBody getBody() {
        return this.body;
    }

}
