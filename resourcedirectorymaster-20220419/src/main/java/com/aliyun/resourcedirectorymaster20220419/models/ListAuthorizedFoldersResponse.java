// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAuthorizedFoldersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedFoldersResponseBody body;

    public static ListAuthorizedFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedFoldersResponse self = new ListAuthorizedFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedFoldersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedFoldersResponse setBody(ListAuthorizedFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedFoldersResponseBody getBody() {
        return this.body;
    }

}
