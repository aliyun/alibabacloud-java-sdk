// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishHotspotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishHotspotResponseBody body;

    public static PublishHotspotResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishHotspotResponse self = new PublishHotspotResponse();
        return TeaModel.build(map, self);
    }

    public PublishHotspotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishHotspotResponse setBody(PublishHotspotResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishHotspotResponseBody getBody() {
        return this.body;
    }

}
