// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListYikeWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListYikeWorkspacesResponseBody body;

    public static ListYikeWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListYikeWorkspacesResponse self = new ListYikeWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public ListYikeWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListYikeWorkspacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListYikeWorkspacesResponse setBody(ListYikeWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListYikeWorkspacesResponseBody getBody() {
        return this.body;
    }

}
