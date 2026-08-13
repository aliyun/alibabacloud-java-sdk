// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListPersonalDirectoryContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPersonalDirectoryContentsResponseBody body;

    public static ListPersonalDirectoryContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalDirectoryContentsResponse self = new ListPersonalDirectoryContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonalDirectoryContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonalDirectoryContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersonalDirectoryContentsResponse setBody(ListPersonalDirectoryContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonalDirectoryContentsResponseBody getBody() {
        return this.body;
    }

}
