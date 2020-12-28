// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTraceQueryByMsgKeyResponseBody body;

    public static OnsTraceQueryByMsgKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgKeyResponse self = new OnsTraceQueryByMsgKeyResponse();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTraceQueryByMsgKeyResponse setBody(OnsTraceQueryByMsgKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTraceQueryByMsgKeyResponseBody getBody() {
        return this.body;
    }

}
