// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishStatusResponseBody body;

    public static PublishStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishStatusResponse self = new PublishStatusResponse();
        return TeaModel.build(map, self);
    }

    public PublishStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishStatusResponse setBody(PublishStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishStatusResponseBody getBody() {
        return this.body;
    }

}
