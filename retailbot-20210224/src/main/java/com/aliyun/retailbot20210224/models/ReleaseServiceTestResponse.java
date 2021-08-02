// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ReleaseServiceTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseServiceTestResponseBody body;

    public static ReleaseServiceTestResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceTestResponse self = new ReleaseServiceTestResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseServiceTestResponse setBody(ReleaseServiceTestResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseServiceTestResponseBody getBody() {
        return this.body;
    }

}
