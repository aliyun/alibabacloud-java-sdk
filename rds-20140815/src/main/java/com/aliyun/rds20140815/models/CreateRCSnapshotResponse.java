// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRCSnapshotResponseBody body;

    public static CreateRCSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRCSnapshotResponse self = new CreateRCSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateRCSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRCSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRCSnapshotResponse setBody(CreateRCSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRCSnapshotResponseBody getBody() {
        return this.body;
    }

}
