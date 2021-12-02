// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RebuildAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebuildAppInstanceResponseBody body;

    public static RebuildAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildAppInstanceResponse self = new RebuildAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebuildAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildAppInstanceResponse setBody(RebuildAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildAppInstanceResponseBody getBody() {
        return this.body;
    }

}
