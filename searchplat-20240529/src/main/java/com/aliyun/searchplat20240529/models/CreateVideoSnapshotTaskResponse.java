// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSnapshotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoSnapshotTaskResponseBody body;

    public static CreateVideoSnapshotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSnapshotTaskResponse self = new CreateVideoSnapshotTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoSnapshotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoSnapshotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoSnapshotTaskResponse setBody(CreateVideoSnapshotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoSnapshotTaskResponseBody getBody() {
        return this.body;
    }

}
