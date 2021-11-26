// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class GetMessageStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageStatusResponseBody body;

    public static GetMessageStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageStatusResponse self = new GetMessageStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageStatusResponse setBody(GetMessageStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageStatusResponseBody getBody() {
        return this.body;
    }

}
