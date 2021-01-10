// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqOrderVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushSofamqOrderVerifyResponseBody body;

    public static PushSofamqOrderVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqOrderVerifyResponse self = new PushSofamqOrderVerifyResponse();
        return TeaModel.build(map, self);
    }

    public PushSofamqOrderVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushSofamqOrderVerifyResponse setBody(PushSofamqOrderVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public PushSofamqOrderVerifyResponseBody getBody() {
        return this.body;
    }

}
