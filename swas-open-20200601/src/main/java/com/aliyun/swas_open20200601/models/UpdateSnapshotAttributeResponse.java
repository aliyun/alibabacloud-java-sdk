// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateSnapshotAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSnapshotAttributeResponseBody body;

    public static UpdateSnapshotAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotAttributeResponse self = new UpdateSnapshotAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSnapshotAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSnapshotAttributeResponse setBody(UpdateSnapshotAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSnapshotAttributeResponseBody getBody() {
        return this.body;
    }

}
