// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetNumLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNumLocationResponseBody body;

    public static GetNumLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNumLocationResponse self = new GetNumLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetNumLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNumLocationResponse setBody(GetNumLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNumLocationResponseBody getBody() {
        return this.body;
    }

}
