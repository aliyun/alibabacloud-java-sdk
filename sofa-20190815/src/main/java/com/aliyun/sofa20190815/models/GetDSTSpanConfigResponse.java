// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDSTSpanConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDSTSpanConfigResponseBody body;

    public static GetDSTSpanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDSTSpanConfigResponse self = new GetDSTSpanConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDSTSpanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDSTSpanConfigResponse setBody(GetDSTSpanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDSTSpanConfigResponseBody getBody() {
        return this.body;
    }

}
