// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RenameFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameFolderResponseBody body;

    public static RenameFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameFolderResponse self = new RenameFolderResponse();
        return TeaModel.build(map, self);
    }

    public RenameFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameFolderResponse setBody(RenameFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameFolderResponseBody getBody() {
        return this.body;
    }

}
