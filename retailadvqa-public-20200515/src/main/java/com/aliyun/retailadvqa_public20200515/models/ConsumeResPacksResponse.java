// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ConsumeResPacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConsumeResPacksResponseBody body;

    public static ConsumeResPacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsumeResPacksResponse self = new ConsumeResPacksResponse();
        return TeaModel.build(map, self);
    }

    public ConsumeResPacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsumeResPacksResponse setBody(ConsumeResPacksResponseBody body) {
        this.body = body;
        return this;
    }
    public ConsumeResPacksResponseBody getBody() {
        return this.body;
    }

}
