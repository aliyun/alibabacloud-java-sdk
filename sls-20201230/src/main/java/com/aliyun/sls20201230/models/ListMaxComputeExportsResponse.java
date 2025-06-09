// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaxComputeExportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMaxComputeExportsResponseBody body;

    public static ListMaxComputeExportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMaxComputeExportsResponse self = new ListMaxComputeExportsResponse();
        return TeaModel.build(map, self);
    }

    public ListMaxComputeExportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMaxComputeExportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMaxComputeExportsResponse setBody(ListMaxComputeExportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMaxComputeExportsResponseBody getBody() {
        return this.body;
    }

}
