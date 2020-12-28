// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetSamplingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSamplingResponseBody body;

    public static GetSamplingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSamplingResponse self = new GetSamplingResponse();
        return TeaModel.build(map, self);
    }

    public GetSamplingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSamplingResponse setBody(GetSamplingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSamplingResponseBody getBody() {
        return this.body;
    }

}
