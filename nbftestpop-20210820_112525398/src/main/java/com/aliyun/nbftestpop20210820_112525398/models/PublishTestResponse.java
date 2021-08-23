// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210820_112525398.models;

import com.aliyun.tea.*;

public class PublishTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishTestResponseBody body;

    public static PublishTestResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishTestResponse self = new PublishTestResponse();
        return TeaModel.build(map, self);
    }

    public PublishTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishTestResponse setBody(PublishTestResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishTestResponseBody getBody() {
        return this.body;
    }

}
