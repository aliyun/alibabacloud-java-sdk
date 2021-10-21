// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CombineLoaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CombineLoaResponseBody body;

    public static CombineLoaResponse build(java.util.Map<String, ?> map) throws Exception {
        CombineLoaResponse self = new CombineLoaResponse();
        return TeaModel.build(map, self);
    }

    public CombineLoaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CombineLoaResponse setBody(CombineLoaResponseBody body) {
        this.body = body;
        return this;
    }
    public CombineLoaResponseBody getBody() {
        return this.body;
    }

}
