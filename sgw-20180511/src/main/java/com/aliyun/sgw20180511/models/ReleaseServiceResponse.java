// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReleaseServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseServiceResponseBody body;

    public static ReleaseServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceResponse self = new ReleaseServiceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseServiceResponse setBody(ReleaseServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseServiceResponseBody getBody() {
        return this.body;
    }

}
