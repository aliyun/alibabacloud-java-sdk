// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNatIpsResponseBody body;

    public static ListNatIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpsResponse self = new ListNatIpsResponse();
        return TeaModel.build(map, self);
    }

    public ListNatIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNatIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNatIpsResponse setBody(ListNatIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNatIpsResponseBody getBody() {
        return this.body;
    }

}
