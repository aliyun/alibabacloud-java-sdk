// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamScopesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamScopesResponseBody body;

    public static ListIpamScopesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamScopesResponse self = new ListIpamScopesResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamScopesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamScopesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamScopesResponse setBody(ListIpamScopesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamScopesResponseBody getBody() {
        return this.body;
    }

}
