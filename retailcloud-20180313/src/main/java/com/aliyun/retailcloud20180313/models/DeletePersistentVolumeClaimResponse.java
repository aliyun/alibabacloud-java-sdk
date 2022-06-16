// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeletePersistentVolumeClaimResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePersistentVolumeClaimResponseBody body;

    public static DeletePersistentVolumeClaimResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePersistentVolumeClaimResponse self = new DeletePersistentVolumeClaimResponse();
        return TeaModel.build(map, self);
    }

    public DeletePersistentVolumeClaimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePersistentVolumeClaimResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePersistentVolumeClaimResponse setBody(DeletePersistentVolumeClaimResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePersistentVolumeClaimResponseBody getBody() {
        return this.body;
    }

}
