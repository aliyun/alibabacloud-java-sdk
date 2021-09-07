// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseInstancePublicConnectionResponseBody body;

    public static ReleaseInstancePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionResponse self = new ReleaseInstancePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseInstancePublicConnectionResponse setBody(ReleaseInstancePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseInstancePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
