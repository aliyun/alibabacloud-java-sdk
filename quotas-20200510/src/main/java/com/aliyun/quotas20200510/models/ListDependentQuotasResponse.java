// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListDependentQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDependentQuotasResponseBody body;

    public static ListDependentQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDependentQuotasResponse self = new ListDependentQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListDependentQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDependentQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDependentQuotasResponse setBody(ListDependentQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDependentQuotasResponseBody getBody() {
        return this.body;
    }

}
