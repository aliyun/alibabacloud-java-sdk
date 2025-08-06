// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStorageResponseBody body;

    public static DeleteStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageResponse self = new DeleteStorageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStorageResponse setBody(DeleteStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStorageResponseBody getBody() {
        return this.body;
    }

}
