// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceSnapshotResponseBody body;

    public static CreateInstanceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSnapshotResponse self = new CreateInstanceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceSnapshotResponse setBody(CreateInstanceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

}
