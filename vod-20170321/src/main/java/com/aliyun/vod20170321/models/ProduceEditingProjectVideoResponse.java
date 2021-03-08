// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProduceEditingProjectVideoResponseBody body;

    public static ProduceEditingProjectVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoResponse self = new ProduceEditingProjectVideoResponse();
        return TeaModel.build(map, self);
    }

    public ProduceEditingProjectVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProduceEditingProjectVideoResponse setBody(ProduceEditingProjectVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public ProduceEditingProjectVideoResponseBody getBody() {
        return this.body;
    }

}
