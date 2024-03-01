// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListTenantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTenantsResponseBody body;

    public static ListTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantsResponse self = new ListTenantsResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantsResponse setBody(ListTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantsResponseBody getBody() {
        return this.body;
    }

}
