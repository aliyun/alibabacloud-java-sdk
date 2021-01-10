// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasRiskCarriertypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasRiskCarriertypeResponseBody body;

    public static ListHasRiskCarriertypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasRiskCarriertypeResponse self = new ListHasRiskCarriertypeResponse();
        return TeaModel.build(map, self);
    }

    public ListHasRiskCarriertypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasRiskCarriertypeResponse setBody(ListHasRiskCarriertypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasRiskCarriertypeResponseBody getBody() {
        return this.body;
    }

}
