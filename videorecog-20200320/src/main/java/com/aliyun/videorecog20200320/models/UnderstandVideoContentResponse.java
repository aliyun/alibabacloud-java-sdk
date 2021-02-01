// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class UnderstandVideoContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnderstandVideoContentResponseBody body;

    public static UnderstandVideoContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UnderstandVideoContentResponse self = new UnderstandVideoContentResponse();
        return TeaModel.build(map, self);
    }

    public UnderstandVideoContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnderstandVideoContentResponse setBody(UnderstandVideoContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UnderstandVideoContentResponseBody getBody() {
        return this.body;
    }

}
