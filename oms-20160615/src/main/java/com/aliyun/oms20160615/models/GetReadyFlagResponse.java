// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetReadyFlagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReadyFlagResponseBody body;

    public static GetReadyFlagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReadyFlagResponse self = new GetReadyFlagResponse();
        return TeaModel.build(map, self);
    }

    public GetReadyFlagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReadyFlagResponse setBody(GetReadyFlagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReadyFlagResponseBody getBody() {
        return this.body;
    }

}
