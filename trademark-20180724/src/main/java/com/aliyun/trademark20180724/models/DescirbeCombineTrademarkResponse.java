// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DescirbeCombineTrademarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescirbeCombineTrademarkResponseBody body;

    public static DescirbeCombineTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescirbeCombineTrademarkResponse self = new DescirbeCombineTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public DescirbeCombineTrademarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescirbeCombineTrademarkResponse setBody(DescirbeCombineTrademarkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescirbeCombineTrademarkResponseBody getBody() {
        return this.body;
    }

}
