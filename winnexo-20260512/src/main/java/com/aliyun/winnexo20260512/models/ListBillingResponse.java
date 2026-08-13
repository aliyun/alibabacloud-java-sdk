// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListBillingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBillingResponseBody body;

    public static ListBillingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBillingResponse self = new ListBillingResponse();
        return TeaModel.build(map, self);
    }

    public ListBillingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBillingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBillingResponse setBody(ListBillingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBillingResponseBody getBody() {
        return this.body;
    }

}
