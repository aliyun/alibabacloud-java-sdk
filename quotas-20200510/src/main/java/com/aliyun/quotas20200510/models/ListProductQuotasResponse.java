// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListProductQuotasResponse setBody(ListProductQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductQuotasResponseBody getBody() {
        return this.body;
    }

}
