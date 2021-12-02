// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ScaleAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleAppResponseBody body;

    public static ScaleAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleAppResponse self = new ScaleAppResponse();
        return TeaModel.build(map, self);
    }

    public ScaleAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleAppResponse setBody(ScaleAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleAppResponseBody getBody() {
        return this.body;
    }

}
