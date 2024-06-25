// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFolderResponseBody body;

    public static CreateFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderResponse self = new CreateFolderResponse();
        return TeaModel.build(map, self);
    }

    public CreateFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFolderResponse setBody(CreateFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFolderResponseBody getBody() {
        return this.body;
    }

}
