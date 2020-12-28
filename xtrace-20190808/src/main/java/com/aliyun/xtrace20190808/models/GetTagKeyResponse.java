// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTagKeyResponseBody body;

    public static GetTagKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagKeyResponse self = new GetTagKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetTagKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagKeyResponse setBody(GetTagKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagKeyResponseBody getBody() {
        return this.body;
    }

}
