// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateConfigDirResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigDirResponseBody body;

    public static CreateConfigDirResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigDirResponse self = new CreateConfigDirResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigDirResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigDirResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigDirResponse setBody(CreateConfigDirResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigDirResponseBody getBody() {
        return this.body;
    }

}
