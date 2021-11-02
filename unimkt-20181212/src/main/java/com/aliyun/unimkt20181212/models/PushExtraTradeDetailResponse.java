// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushExtraTradeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushExtraTradeDetailResponseBody body;

    public static PushExtraTradeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        PushExtraTradeDetailResponse self = new PushExtraTradeDetailResponse();
        return TeaModel.build(map, self);
    }

    public PushExtraTradeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushExtraTradeDetailResponse setBody(PushExtraTradeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public PushExtraTradeDetailResponseBody getBody() {
        return this.body;
    }

}
