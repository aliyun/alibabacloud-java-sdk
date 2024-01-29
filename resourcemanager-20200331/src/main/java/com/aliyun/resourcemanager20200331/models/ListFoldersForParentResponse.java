// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListFoldersForParentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFoldersForParentResponseBody body;

    public static ListFoldersForParentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersForParentResponse self = new ListFoldersForParentResponse();
        return TeaModel.build(map, self);
    }

    public ListFoldersForParentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoldersForParentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFoldersForParentResponse setBody(ListFoldersForParentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoldersForParentResponseBody getBody() {
        return this.body;
    }

}
