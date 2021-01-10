// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListABTestScenesResponseBody body;

    public static ListABTestScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListABTestScenesResponse self = new ListABTestScenesResponse();
        return TeaModel.build(map, self);
    }

    public ListABTestScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListABTestScenesResponse setBody(ListABTestScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABTestScenesResponseBody getBody() {
        return this.body;
    }

}
