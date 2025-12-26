// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class AddAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAddressResponseBody body;

    public static AddAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAddressResponse self = new AddAddressResponse();
        return TeaModel.build(map, self);
    }

    public AddAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAddressResponse setBody(AddAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAddressResponseBody getBody() {
        return this.body;
    }

}
