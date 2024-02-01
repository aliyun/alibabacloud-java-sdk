// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateEipAddressResponseBody body;

    public static AllocateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressResponse self = new AllocateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateEipAddressResponse setBody(AllocateEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateEipAddressResponseBody getBody() {
        return this.body;
    }

}
