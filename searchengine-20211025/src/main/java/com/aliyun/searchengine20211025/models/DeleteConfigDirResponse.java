// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteConfigDirResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigDirResponseBody body;

    public static DeleteConfigDirResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigDirResponse self = new DeleteConfigDirResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigDirResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigDirResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigDirResponse setBody(DeleteConfigDirResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigDirResponseBody getBody() {
        return this.body;
    }

}
