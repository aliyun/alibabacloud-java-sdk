// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListABTestExperimentsResponseBody body;

    public static ListABTestExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListABTestExperimentsResponse self = new ListABTestExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public ListABTestExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListABTestExperimentsResponse setBody(ListABTestExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABTestExperimentsResponseBody getBody() {
        return this.body;
    }

}
