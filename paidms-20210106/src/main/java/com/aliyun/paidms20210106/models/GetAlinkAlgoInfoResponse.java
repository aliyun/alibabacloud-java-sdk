// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class GetAlinkAlgoInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlinkAlgoInfoResponseBody body;

    public static GetAlinkAlgoInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlinkAlgoInfoResponse self = new GetAlinkAlgoInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAlinkAlgoInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlinkAlgoInfoResponse setBody(GetAlinkAlgoInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlinkAlgoInfoResponseBody getBody() {
        return this.body;
    }

}
