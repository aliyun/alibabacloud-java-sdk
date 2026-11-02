// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ListPxfsTenantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPxfsTenantsResponseBody body;

    public static ListPxfsTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPxfsTenantsResponse self = new ListPxfsTenantsResponse();
        return TeaModel.build(map, self);
    }

    public ListPxfsTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPxfsTenantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPxfsTenantsResponse setBody(ListPxfsTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPxfsTenantsResponseBody getBody() {
        return this.body;
    }

}
