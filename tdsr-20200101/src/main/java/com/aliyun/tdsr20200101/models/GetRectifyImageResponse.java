// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetRectifyImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRectifyImageResponseBody body;

    public static GetRectifyImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRectifyImageResponse self = new GetRectifyImageResponse();
        return TeaModel.build(map, self);
    }

    public GetRectifyImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRectifyImageResponse setBody(GetRectifyImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRectifyImageResponseBody getBody() {
        return this.body;
    }

}
