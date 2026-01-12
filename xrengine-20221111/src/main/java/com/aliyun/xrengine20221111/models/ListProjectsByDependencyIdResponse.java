// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListProjectsByDependencyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectsByDependencyIdResponseBody body;

    public static ListProjectsByDependencyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsByDependencyIdResponse self = new ListProjectsByDependencyIdResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsByDependencyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectsByDependencyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectsByDependencyIdResponse setBody(ListProjectsByDependencyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectsByDependencyIdResponseBody getBody() {
        return this.body;
    }

}
