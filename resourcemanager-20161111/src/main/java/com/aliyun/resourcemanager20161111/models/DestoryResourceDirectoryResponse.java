// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DestoryResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DestoryResourceDirectoryResponseBody body;

    public static DestoryResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DestoryResourceDirectoryResponse self = new DestoryResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DestoryResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestoryResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestoryResourceDirectoryResponse setBody(DestoryResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DestoryResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
