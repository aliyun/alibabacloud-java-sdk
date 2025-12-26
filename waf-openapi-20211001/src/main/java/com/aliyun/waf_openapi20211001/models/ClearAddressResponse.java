// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ClearAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearAddressResponseBody body;

    public static ClearAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAddressResponse self = new ClearAddressResponse();
        return TeaModel.build(map, self);
    }

    public ClearAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearAddressResponse setBody(ClearAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearAddressResponseBody getBody() {
        return this.body;
    }

}
