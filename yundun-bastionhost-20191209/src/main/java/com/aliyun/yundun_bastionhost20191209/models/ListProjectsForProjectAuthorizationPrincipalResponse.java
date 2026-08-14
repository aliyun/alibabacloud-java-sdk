// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectsForProjectAuthorizationPrincipalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectsForProjectAuthorizationPrincipalResponseBody body;

    public static ListProjectsForProjectAuthorizationPrincipalResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsForProjectAuthorizationPrincipalResponse self = new ListProjectsForProjectAuthorizationPrincipalResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsForProjectAuthorizationPrincipalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectsForProjectAuthorizationPrincipalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectsForProjectAuthorizationPrincipalResponse setBody(ListProjectsForProjectAuthorizationPrincipalResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectsForProjectAuthorizationPrincipalResponseBody getBody() {
        return this.body;
    }

}
