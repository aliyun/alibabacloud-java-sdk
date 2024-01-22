// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReleaseIpv6AddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseIpv6AddressResponseBody body;

    public static ReleaseIpv6AddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIpv6AddressResponse self = new ReleaseIpv6AddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseIpv6AddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseIpv6AddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseIpv6AddressResponse setBody(ReleaseIpv6AddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseIpv6AddressResponseBody getBody() {
        return this.body;
    }

}
