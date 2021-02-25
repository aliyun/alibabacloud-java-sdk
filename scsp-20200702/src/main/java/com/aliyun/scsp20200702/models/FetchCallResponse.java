// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class FetchCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FetchCallResponseBody body;

    public static FetchCallResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchCallResponse self = new FetchCallResponse();
        return TeaModel.build(map, self);
    }

    public FetchCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchCallResponse setBody(FetchCallResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchCallResponseBody getBody() {
        return this.body;
    }

}
