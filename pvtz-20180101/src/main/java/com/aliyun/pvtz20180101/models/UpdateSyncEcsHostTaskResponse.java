// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateSyncEcsHostTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSyncEcsHostTaskResponseBody body;

    public static UpdateSyncEcsHostTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncEcsHostTaskResponse self = new UpdateSyncEcsHostTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSyncEcsHostTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSyncEcsHostTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSyncEcsHostTaskResponse setBody(UpdateSyncEcsHostTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSyncEcsHostTaskResponseBody getBody() {
        return this.body;
    }

}
