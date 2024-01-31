// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductQuotasResponseBody body;

    public static ListProductQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductQuotasResponse self = new ListProductQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListProductQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductQuotasResponse setBody(ListProductQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductQuotasResponseBody getBody() {
        return this.body;
    }

}
