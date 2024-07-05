// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamSnapshotResponseBody body;

    public static CreateStreamSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamSnapshotResponse self = new CreateStreamSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamSnapshotResponse setBody(CreateStreamSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamSnapshotResponseBody getBody() {
        return this.body;
    }

}
