// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipDWSNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipDWSNodeResponseBody body;

    public static SkipDWSNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipDWSNodeResponse self = new SkipDWSNodeResponse();
        return TeaModel.build(map, self);
    }

    public SkipDWSNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipDWSNodeResponse setBody(SkipDWSNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipDWSNodeResponseBody getBody() {
        return this.body;
    }

}
