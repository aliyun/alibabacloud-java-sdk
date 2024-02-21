// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class OpenPrivateLinkServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public OpenPrivateLinkServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenPrivateLinkServiceResponse setBody(OpenPrivateLinkServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenPrivateLinkServiceResponseBody getBody() {
        return this.body;
    }

}
