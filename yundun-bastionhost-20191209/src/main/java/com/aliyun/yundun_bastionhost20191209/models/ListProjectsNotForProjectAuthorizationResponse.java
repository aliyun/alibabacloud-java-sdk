// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectsNotForProjectAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectsNotForProjectAuthorizationResponseBody body;

    public static ListProjectsNotForProjectAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsNotForProjectAuthorizationResponse self = new ListProjectsNotForProjectAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsNotForProjectAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectsNotForProjectAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectsNotForProjectAuthorizationResponse setBody(ListProjectsNotForProjectAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectsNotForProjectAuthorizationResponseBody getBody() {
        return this.body;
    }

}
