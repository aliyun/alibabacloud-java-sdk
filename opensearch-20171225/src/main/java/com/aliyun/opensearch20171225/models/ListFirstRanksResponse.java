// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFirstRanksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFirstRanksResponseBody body;

    public static ListFirstRanksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFirstRanksResponse self = new ListFirstRanksResponse();
        return TeaModel.build(map, self);
    }

    public ListFirstRanksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFirstRanksResponse setBody(ListFirstRanksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFirstRanksResponseBody getBody() {
        return this.body;
    }

}
