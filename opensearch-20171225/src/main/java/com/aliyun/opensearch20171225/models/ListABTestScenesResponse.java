// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestScenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListABTestScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListABTestScenesResponse setBody(ListABTestScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABTestScenesResponseBody getBody() {
        return this.body;
    }

}
