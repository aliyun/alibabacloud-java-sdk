// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6AddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateIpv6AddressResponseBody body;

    public static AllocateIpv6AddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6AddressResponse self = new AllocateIpv6AddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6AddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateIpv6AddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateIpv6AddressResponse setBody(AllocateIpv6AddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateIpv6AddressResponseBody getBody() {
        return this.body;
    }

}
