// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushTradeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushTradeDetailResponseBody body;

    public static PushTradeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        PushTradeDetailResponse self = new PushTradeDetailResponse();
        return TeaModel.build(map, self);
    }

    public PushTradeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushTradeDetailResponse setBody(PushTradeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public PushTradeDetailResponseBody getBody() {
        return this.body;
    }

}
