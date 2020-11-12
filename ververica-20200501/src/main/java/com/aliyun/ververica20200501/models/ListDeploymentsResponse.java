// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeploymentsResponseBody body;

    public static ListDeploymentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponse self = new ListDeploymentsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentsResponse setBody(ListDeploymentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentsResponseBody getBody() {
        return this.body;
    }

}
