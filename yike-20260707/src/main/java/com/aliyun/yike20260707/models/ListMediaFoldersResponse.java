// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListMediaFoldersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaFoldersResponseBody body;

    public static ListMediaFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaFoldersResponse self = new ListMediaFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaFoldersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaFoldersResponse setBody(ListMediaFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaFoldersResponseBody getBody() {
        return this.body;
    }

}
