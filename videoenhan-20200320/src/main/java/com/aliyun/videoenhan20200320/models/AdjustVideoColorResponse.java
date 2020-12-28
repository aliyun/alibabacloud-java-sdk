// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AdjustVideoColorResponseBody body;

    public static AdjustVideoColorResponse build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorResponse self = new AdjustVideoColorResponse();
        return TeaModel.build(map, self);
    }

    public AdjustVideoColorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdjustVideoColorResponse setBody(AdjustVideoColorResponseBody body) {
        this.body = body;
        return this;
    }
    public AdjustVideoColorResponseBody getBody() {
        return this.body;
    }

}
