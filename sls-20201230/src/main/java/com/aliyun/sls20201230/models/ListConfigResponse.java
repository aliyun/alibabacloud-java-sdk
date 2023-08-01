// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigResponseBody body;

    public static ListConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigResponse self = new ListConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigResponse setBody(ListConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigResponseBody getBody() {
        return this.body;
    }

}
