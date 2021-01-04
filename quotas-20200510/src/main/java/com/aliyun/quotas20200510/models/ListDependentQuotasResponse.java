// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListDependentQuotasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDependentQuotasResponse setBody(ListDependentQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDependentQuotasResponseBody getBody() {
        return this.body;
    }

}
