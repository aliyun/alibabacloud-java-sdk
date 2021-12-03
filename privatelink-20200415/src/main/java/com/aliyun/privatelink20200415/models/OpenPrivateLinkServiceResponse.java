// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class OpenPrivateLinkServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenPrivateLinkServiceResponseBody body;

    public static OpenPrivateLinkServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenPrivateLinkServiceResponse self = new OpenPrivateLinkServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenPrivateLinkServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenPrivateLinkServiceResponse setBody(OpenPrivateLinkServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenPrivateLinkServiceResponseBody getBody() {
        return this.body;
    }

}
